package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class chitietphieunhap {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int MaPN;
	
	@Column
	int MaSach;
	
	@Column
	int SoLuong;
}
