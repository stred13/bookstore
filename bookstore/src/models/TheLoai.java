package models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import jdk.nashorn.internal.ir.annotations.Ignore;

@Entity
@Table(name="theloai")
public class TheLoai {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MaTL")
	int matl;
	
	@Column(name="TenTL")
	String tentl;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="TLSach")
	Set<Sach> sach;

	public int getMatl() {
		return matl;
	}

	public void setMatl(int matl) {
		this.matl = matl;
	}

	public String getTentl() {
		return tentl;
	}

	public void setTentl(String tentl) {
		this.tentl = tentl;
	}

	public Set<Sach> getSach() {
		return sach;
	}

	public void setSach(Set<Sach> SACH) {
		for(Sach s: SACH) {
			s.setTLSach(this);
		}
		this.sach = SACH;
	}

	@Ignore
	public TheLoai(int maTL, String tenTL, Set<Sach> Sach) {
		super();
		matl = maTL;
		tenTL = tenTL;
		Sach = Sach;
	}

	@Ignore
	public TheLoai(String tenTL, Set<Sach> Sach) {
		super();
		tenTL = tenTL;
		sach = Sach;
	}

	public TheLoai() {
		super();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getTentl();
	}
	
}
