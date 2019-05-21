package controllers;

import java.util.List;

import daos.theloaisachDao;
import models.TheLoai;

public class theloaisachController {
	theloaisachDao tlsachDao = new theloaisachDao();
	public List<TheLoai> getAllTLsach(){		
		return tlsachDao.getAllTheloai();
	}
}
