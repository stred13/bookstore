package testmain;

import java.util.Date;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import config.hibSessionFactory;
import daos.phieunhapDao;
import daos.sachDao;
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
		
		Session sess = null;
		
		SessionFactory sessFac = hibSessionFactory.getSession();
		sess = sessFac.getCurrentSession();
		sess.beginTransaction();
		
		PhieuNhap pn = sess.get(PhieuNhap.class, 1);
		TheLoai tl = sess.get(TheLoai.class, 2);
		NhanVien nv = sess.get(NhanVien.class, 1);
		Sach s =(Sach) sess.get(Sach.class,3);

		sess.getTransaction().commit();
		sess.close();
		
		
		
		
	}
}
