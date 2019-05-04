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
@Table
public class NhanVien implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int MaNV;
	
	@Column
	private String TenNV;
	
	@Column
	private String Sdt;

	@OneToMany(fetch=FetchType.LAZY,mappedBy="NhanVien",cascade=CascadeType.ALL)
	private Set<HoaDonBanSach> HoaDonBanSachs;
	
	
	public int getMaNV() {
		return MaNV;
	}

	public void setMaNV(int maNV) {
		MaNV = maNV;
	}

	public String getTenNV() {
		return TenNV;
	}

	public void setTenNV(String tenNV) {
		TenNV = tenNV;
	}

	public String getSdt() {
		return Sdt;
	}

	public void setSdt(String sdt) {
		Sdt = sdt;
	}

	public NhanVien(String tenNV, String sdt) {
		super();
		TenNV = tenNV;
		Sdt = sdt;
	}

	public NhanVien() {
		super();
	}
	
	
}
