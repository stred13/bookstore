package controllers;

import daos.phieunhapDao;
import models.PhieuNhap;

public class phieunhapController {
	phieunhapDao pnDao = new phieunhapDao();
	public PhieuNhap getPhieuNhapbyId(int id) {
		return pnDao.getPhieuNhapbyId(id);
	}

}
