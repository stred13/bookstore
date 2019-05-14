package daos;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import config.hibSessionFactory;
import models.ChiTietPhieuNhap;
import models.NhanVien;
import models.PhieuNhap;
import models.Sach;

public class sachDao {
	
	public List<Sach> getListSach(){
		SessionFactory sessFac = hibSessionFactory.getSession();
		Session sess = sessFac.getCurrentSession();
		sess.beginTransaction();
		
		List<Sach> listSach = sess.createQuery("from Sach").list();
		sess.getTransaction().commit();
		sess.close();
		return listSach;
	}

	
	public boolean nhapSach(Sach sach,NhanVien nv,PhieuNhap pn,long gianhap, int soluong) {
		try {
			SessionFactory sessFac = hibSessionFactory.getSession();
			Session sess = sessFac.getCurrentSession();
			sess.beginTransaction();
			
			//chi tiết phiếu nhập
			ChiTietPhieuNhap ctpn = new ChiTietPhieuNhap();
			ctpn.setGianhap(gianhap);
			ctpn.setSoluong(soluong);
			
			//thông tin sách
			ctpn.setSach(sach);
			
			//thông tin phiếu nhập
			ctpn.setPhieunhap(pn);
			
			sess.save(ctpn);
			sess.getTransaction().commit();
			sess.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean banSach(Sach s) {
		
		return true;
	}
	
	public Sach getSachbyName(String name) {
		SessionFactory sessFac = hibSessionFactory.getSession();
		Session sess = sessFac.getCurrentSession();
		sess.beginTransaction();
		
		Sach s = (Sach) sess.createQuery("from Sach s Where s.tensach = :name").setParameter("name", name).getSingleResult();
		
		sess.getTransaction().commit();
		sess.close();
		
		return s;
	}
	
}
