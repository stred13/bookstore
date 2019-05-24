package testmain;

import java.util.Date;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import config.hibSessionFactory;
import daos.phieunhapDao;
import daos.sachDao;
import daos.theloaisachDao;
import models.ChiTietHoaDon;
import models.ChiTietPhieuNhap;
import models.HoaDonBanSach;
import models.KhachHang;
import models.NhanVien;
import models.PhieuNhap;
import models.Sach;
import models.TheLoai;

public class mainTest {

	public static void main(String[] args) {
		
		theloaisachDao tl = new theloaisachDao();
		sachDao sDao = new sachDao();
		
		System.out.println(sDao.getListSach().get(0).getCtpn().size());
		
	}
}
