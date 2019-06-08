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
	public void updateNhanVien(NhanVien nv) {		
		nvDao.updateNhanVien(nv);
	}
	public void deleteNhanVien(NhanVien nv) {		
		nvDao.deleteNhanVien(nv);
	}
	
	public List<NhanVien> getAllNhanVien(){
		return nvDao.getListNhanVien();
	}
	
	public List<NhanVien> getNhanVienSearch(String txtSearch){
		return nvDao.getNhanVienSearch(txtSearch);
	}
	public NhanVien getNhanVienbyId(int maNV){
		return nvDao.getNhanVienbyId(maNV);
	}
	public NhanVien getNhanVienLogin(String tk, String mk){
		return nvDao.getNhanVienbyTaiKhoan(tk, mk);
	}

}
