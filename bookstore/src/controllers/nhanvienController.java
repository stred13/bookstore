package controllers;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import daos.nhanvienDao;
import daos.sachDao;
import models.ChiTietPhieuNhap;
import models.NhanVien;
import models.PhieuNhap;
import models.Sach;

public class nhanvienController {
	nhanvienDao nvDao = new nhanvienDao();
	public void insertNhanVien(NhanVien nv) {		
		nvDao.insertNhanVien(nv);
	}
	
	public List<NhanVien> getAllNhanVien(){
		return nvDao.getListNhanVien();
	}
}
