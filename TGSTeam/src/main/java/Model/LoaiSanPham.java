package Model;

public class LoaiSanPham {
private String maLoaiSanPham,tenLoaiSanPham;

public LoaiSanPham(String maLoaiSanPham, String tenLoaiSanPham) {
	
	this.maLoaiSanPham = maLoaiSanPham;
	this.tenLoaiSanPham = tenLoaiSanPham;
}

public LoaiSanPham() {
	
}

public String getMaLoaiSanPham() {
	return maLoaiSanPham;
}

public void setMaLoaiSanPham(String maLoaiSanPham) {
	this.maLoaiSanPham = maLoaiSanPham;
}

public String getTenLoaiSanPham() {
	return tenLoaiSanPham;
}

public void setTenLoaiSanPham(String tenLoaiSanPham) {
	this.tenLoaiSanPham = tenLoaiSanPham;
}

}
