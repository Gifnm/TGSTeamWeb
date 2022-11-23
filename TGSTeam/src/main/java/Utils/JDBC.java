package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {
	 static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	    static String dburl = "jdbc:sqlserver://localhost:1433;database=TGSTeam";
	    static String user = "sa";
	    static String pass = "123";

	    static {
	        try {
	            Class.forName(driver);
	        } catch (Exception e) {
	            throw new RuntimeException(e);
	        }
	    }

	    public static PreparedStatement getStmt(String sql, Object... args) throws SQLException {
	        Connection coon = DriverManager.getConnection(dburl, user, pass);
	        PreparedStatement stmt;
	        if (sql.trim().startsWith("{")) {
	            stmt = coon.prepareCall(sql);// PROC
	        } else {
	            stmt = coon.prepareStatement(sql);// SQL
	        }
	        for (int i = 0; i < args.length; i++) {

	            stmt.setObject(i + 1, args[i]);
	        }
	        return stmt;
	    }

	    public static ResultSet query(String sql, Object... args) throws SQLException {
	        PreparedStatement stmt = JDBC.getStmt(sql, args);
	        return stmt.executeQuery();
	    }

	    public static Object value(String sql, Object... args) {
	        try {
	            ResultSet rs = JDBC.query(sql, args);
	            if (rs.next()) {
	                return rs.getObject(0);
	            }
	            rs.getStatement().getConnection().close();
	            return null;
	        } catch (Exception e) {
	            throw new RuntimeException(e);
	        }
	    }

	    public static int update(String sql, Object... args) {
	        try {
	            PreparedStatement stmt = JDBC.getStmt(sql, args);
	            try {
	                return stmt.executeUpdate();
	            } finally {
	                stmt.getConnection().close();
	            }

	        } catch (Exception e) {
	            throw new RuntimeException();
	        }
	    }
}
