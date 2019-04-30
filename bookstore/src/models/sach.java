package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import jdk.nashorn.internal.ir.annotations.Ignore;

@Entity
@Table
public class sach {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int MaSach;
	@Column
	String TenSach;
	@Column
	String TacGia;
	@Column
	long Gia;
	
	@ManyToOne
	@JoinColumn(name="TheLoai",nullable=false)
	theloai tlsach;
	
	public sach() {
		super();
	}
	
	public int getMaSach() {
		return MaSach;
	}

	public void setMaSach(int maSach) {
		MaSach = maSach;
	}

	public String getTenSach() {
		return TenSach;
	}

	public void setTenSach(String tenSach) {
		TenSach = tenSach;
	}

	public String getTacGia() {
		return TacGia;
	}

	public void setTacGia(String tacGia) {
		TacGia = tacGia;
	}

	public long getGia() {
		return Gia;
	}

	public void setGia(long gia) {
		Gia = gia;
	}

	public theloai getTlsach() {
		return tlsach;
	}

	public void setTlsach(theloai tlsach) {
		this.tlsach = tlsach;
	}

	public sach(int maSach, String tenSach, String tacGia, long gia, theloai tlsach) {
		super();
		MaSach = maSach;
		TenSach = tenSach;
		TacGia = tacGia;
		Gia = gia;
		this.tlsach = tlsach;
	}


	public sach(String tenSach, String tacGia, long gia, theloai tlsach) {
		super();
		TenSach = tenSach;
		TacGia = tacGia;
		Gia = gia;
		this.tlsach = tlsach;
	}
	
	
	
	
}
