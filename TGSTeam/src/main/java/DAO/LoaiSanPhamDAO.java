/**
 * 
 */
package DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Model.LoaiSanPham;
import Model.SanPham;
import Utils.JDBC;

/**
 * @author ASUS
 *
 */
public class LoaiSanPhamDAO extends TeamDAO<LoaiSanPham, String>{
	String SELECT_ALL_SQL = "SELECT * FROM LoaiSanPham";
	@Override
	public void insert(LoaiSanPham entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(LoaiSanPham entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<LoaiSanPham> selectAll() {
		// TODO Auto-generated method stub
		return this.selectBySql(SELECT_ALL_SQL);
	}

	@Override
	public LoaiSanPham selectById(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected List<LoaiSanPham> selectBySql(String sql, Object... args) {
		// TODO Auto-generated method stub
		List<LoaiSanPham> list = new ArrayList<>();
        try {

            ResultSet rs = JDBC.query(sql, args);

            while (rs.next()) {

                LoaiSanPham entity = new LoaiSanPham();
                entity.setMaLoaiSanPham(rs.getString(1));
                entity.setTenLoaiSanPham(rs.getString(2));
                list.add(entity);

            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
	}

}
