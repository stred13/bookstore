package daos;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import config.hibSessionFactory;
import models.NhanVien;
import models.PhieuNhap;

public class phieunhapDao {
	
	public List<PhieuNhap> getListPhieuNhap(){
		SessionFactory sessFac = hibSessionFactory.getSession();
		Session sess = sessFac.getCurrentSession();
		sess.beginTransaction();
		List<PhieuNhap> phieunhaps = sess.createQuery("from PhieuNhap").getResultList();
		sess.getTransaction().commit();
		sess.close();
		
		return phieunhaps;
	}
	
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
	
	public void deletePhieuNhap() {
		SessionFactory sessFac = hibSessionFactory.getSession();
		Session sess = sessFac.getCurrentSession();
		sess.beginTransaction();
		
		PhieuNhap pn = sess.get(PhieuNhap.class, 10);
		
		sess.remove(pn);
		sess.getTransaction().commit();
		sess.close();
	}
}
