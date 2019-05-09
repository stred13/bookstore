package daos;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import config.hibSessionFactory;
import models.NhanVien;
import models.PhieuNhap;

public class phieunhapDao {
	
	public void insertPhieuNhap(NhanVien nv) {
		SessionFactory sessFac = hibSessionFactory.getSession();
		Session sess = sessFac.getCurrentSession();
		sess.beginTransaction();
		
		PhieuNhap pn =new PhieuNhap();
		pn.setNgaynhap(new Date());
		pn.setNhanvien(nv);
		
		sess.getTransaction().commit();
		sess.close();
	}
	
}
