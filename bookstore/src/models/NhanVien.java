package models;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "nhanvien")
public class NhanVien implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MaNV")
	private int manv;

	@Column(name = "TenNV")
	private String tennv;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "GioiTinh")
	private int gioitinh;
	
	@Column(name = "TaiKhoan")
	private String taikhoan;

	@Column(name = "MatKhau")
	private String matkhau;

	@Column(name = "Sdt")
	private String sdt;
	
	@Column(name = "Diachi")
	private String diachi;
	
	@Column(name = "NgaySinh")
	private Date ngaysinh;

	@OneToMany(mappedBy = "nhanvien")
	private Set<HoaDonBanSach> hoadon;
	
	@OneToMany(mappedBy = "nhanvien")
	private Set<PhieuNhap> phieunhap;

	public int getManv() {
		return manv;
	}

	public void setManv(int manv) {
		this.manv = manv;
	}
	
	public void setGioitinh(int gioitinh) {
		this.gioitinh = gioitinh;
	}

	public int getGioitinh() {
		return gioitinh;
	}

	
	public String getTaikhoan() {
		return taikhoan;
	}

	public void setTaikhoan(String taikhoan) {
		this.taikhoan = taikhoan;
	}

	public String getMatkhau() {
		return matkhau;
	}

	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}

	public String getTennv() {
		return tennv;
	}

	public void setTennv(String tennv) {
		this.tennv = tennv;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public Date getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public Set<HoaDonBanSach> getHoadon() {
		return hoadon;
	}

	public void setHoadon(Set<HoaDonBanSach> hoadon) {
		this.hoadon = hoadon;
	}

	public NhanVien() {
		super();
	}

}
