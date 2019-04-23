package models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import jdk.nashorn.internal.ir.annotations.Ignore;

@Entity
public class theloai {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int MaTL;
	
	@Column
	String TenTL;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="tlsach")
	Set<sach> Sach;

	public int getMaTL() {
		return MaTL;
	}

	public void setMaTL(int maTL) {
		MaTL = maTL;
	}

	public String getTenTL() {
		return TenTL;
	}

	public void setTenTL(String tenTL) {
		TenTL = tenTL;
	}

	public Set<sach> getSach() {
		return Sach;
	}

	public void setSach(Set<sach> sach) {
		for(sach s: sach) {
			s.setTlsach(this);
		}
		this.Sach = sach;
	}

	@Ignore
	public theloai(int maTL, String tenTL, Set<sach> sach) {
		super();
		MaTL = maTL;
		TenTL = tenTL;
		Sach = sach;
	}

	@Ignore
	public theloai(String tenTL, Set<sach> sach) {
		super();
		TenTL = tenTL;
		Sach = sach;
	}

	public theloai() {
		super();
	}
	
	
}
