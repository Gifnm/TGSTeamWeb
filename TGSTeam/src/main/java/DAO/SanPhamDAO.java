package DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Model.SanPham;
import Utils.JDBC;

public class SanPhamDAO extends TeamDAO<SanPham, String>{
	 String SELECT_ALL_SQL = "SELECT * FROM SanPham";
	@Override
	public void insert(SanPham entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(SanPham entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<SanPham> selectAll() {
		// TODO Auto-generated method stub
		return this.selectBySql(SELECT_ALL_SQL);
	}

	@Override
	public SanPham selectById(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected List<SanPham> selectBySql(String sql, Object... args) {
		// TODO Auto-generated method stub
		List<SanPham> list = new ArrayList<>();
        try {

            ResultSet rs = JDBC.query(sql, args);

            while (rs.next()) {

                SanPham entity = new SanPham();
                entity.setID(rs.getInt(1));
                entity.setBarcode(rs.getString(2));
                entity.setTenSP(rs.getString(3));
                entity.setGiaMuon(rs.getFloat(4));
                entity.setDonGia(rs.getFloat(5));
                entity.setMaLoaiSP(rs.getString(6));
                entity.setMaCH(rs.getInt(7));
                entity.setHinhAnh(rs.getString(8));
                list.add(entity);

            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
	public List<SanPham> selectBykeyWork(String KeyWork) {
		// TODO Auto-generated method stub
		String SelectByKeyWork = "SELECT * FROM SanPham WHERE TenSP LIKE ?";
		return this.selectBySql(SelectByKeyWork,"%"+KeyWork+"%");
	}
	public List<SanPham> selectByLoaiSP(String KeyWork) {
		// TODO Auto-generated method stub
		String SelectByKeyWork = "SELECT * FROM SanPham WHERE MaLoaiSP = ?";
		return this.selectBySql(SelectByKeyWork,KeyWork);
	}
	public static void main(String[] args) {
		SanPhamDAO dao = new SanPhamDAO();
		List<SanPham> list = dao.selectByLoaiSP("SP001");
		System.out.println(list.size());
	}
	}

	

