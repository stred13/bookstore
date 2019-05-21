package controllers;

import daos.sachDao;
import models.Sach;

public class sachController {
	sachDao sDao = new sachDao();
	public void insertSach(Sach sach) {
		sDao.insertSach(sach);
	}
	
}
