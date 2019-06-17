package controllers;

import java.util.List;

import daos.hoadonbansachDao;
import models.HoaDonBanSach;

public class hoadonController {
	hoadonbansachDao hdDao = new hoadonbansachDao();
	public List<HoaDonBanSach> getListhoadon(){
		return hdDao.getListHoaDon();
	}
	
	public HoaDonBanSach getHoaDonbyID(int id) {
		return hdDao.getHoaDonbyId(id);
	}
	
}
