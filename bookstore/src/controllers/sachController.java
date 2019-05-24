package controllers;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import daos.sachDao;
import models.Sach;

public class sachController {
	sachDao sDao = new sachDao();
	public void insertSach(Sach sach) {		
		sDao.insertSach(sach);
	}
	
	public List<Sach> getAllSach(){
		return sDao.getListSach();
	}
	
	public Sach getSachbyId(int id) {
		
		return sDao.getSachbyId(id);
	}
	
}
