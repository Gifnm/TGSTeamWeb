package Model;

public class SanPham {
	private Integer ID;
	private String Barcode;
private String TenSP;
	private Float  GiaMuon;
	private Float DonGia;
	private String MaLoaiSP;
	private Integer MaCH;
	private String HinhAnh;
	public SanPham() {
		
	}
	public SanPham(Integer iD, String barcode, String tenSP, Float giaMuon, Float donGia, String maLoaiSP, Integer maCH,
			String hinhAnh) {
		ID = iD;
		Barcode = barcode;
		TenSP = tenSP;
		GiaMuon = giaMuon;
		DonGia = donGia;
		MaLoaiSP = maLoaiSP;
		MaCH = maCH;
		HinhAnh = hinhAnh;
	}
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getBarcode() {
		return Barcode;
	}
	public void setBarcode(String barcode) {
		Barcode = barcode;
	}
	public String getTenSP() {
		return TenSP;
	}
	public void setTenSP(String tenSP) {
		TenSP = tenSP;
	}
	public Float getGiaMuon() {
		return GiaMuon;
	}
	public void setGiaMuon(Float giaMuon) {
		GiaMuon = giaMuon;
	}
	public Float getDonGia() {
		return DonGia;
	}
	public void setDonGia(Float donGia) {
		DonGia = donGia;
	}
	public String getMaLoaiSP() {
		return MaLoaiSP;
	}
	public void setMaLoaiSP(String maLoaiSP) {
		MaLoaiSP = maLoaiSP;
	}
	public Integer getMaCH() {
		return MaCH;
	}
	public void setMaCH(Integer maCH) {
		MaCH = maCH;
	}
	public String getHinhAnh() {
		return HinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		HinhAnh = hinhAnh;
	}
	
			
}
