package models;

import java.io.Serializable;
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

	@Column(name = "Sdt")
	private String sdt;

	@OneToMany(mappedBy = "nhanvien")
	private Set<HoaDonBanSach> hoadon;

	public int getManv() {
		return manv;
	}

	public void setManv(int manv) {
		this.manv = manv;
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
