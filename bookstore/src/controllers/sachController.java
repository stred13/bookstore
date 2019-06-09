package controllers;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import daos.sachDao;
import models.ChiTietPhieuNhap;
import models.NhanVien;
import models.PhieuNhap;
import models.Sach;

public class sachController {
	sachDao sDao = new sachDao();
	public void insertSach(Sach sach) {		
		sDao.insertSach(sach);
	}
	
	public void nhapSach(Sach sach, NhanVien nv, PhieuNhap pn, ChiTietPhieuNhap ctpn) {
		sDao.nhapSach(sach, nv, pn, ctpn);
	}
	
	public List<Sach> getAllSach(){
		return sDao.getListSach();
	}
	
	public List<Sach> getAllSachSearch(String txtSearch){
		return sDao.getAllSachSearch(txtSearch);
	}
	
	public void updateSach(Sach s) {		
		sDao.updateSach(s);
	}
	public void deleteSach(Sach s) {		
		sDao.deleteSach(s);
	}
	
	public Sach getSachbyId(int id) {
		
		return sDao.getSachbyId(id);
	}
	
}
