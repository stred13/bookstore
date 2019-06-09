package daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import config.hibSessionFactory;
import models.ChiTietPhieuNhap;

public class chitietphieunhapDao {
	public List<ChiTietPhieuNhap> getListCTPN(){
		SessionFactory sessFac = hibSessionFactory.getSession();
		Session sess = sessFac.getCurrentSession();
		sess.beginTransaction();
		
		List<ChiTietPhieuNhap> ctpns = sess.createQuery("from ChiTietPhieuNhap").getResultList();
		
		sess.getTransaction().commit();
		sess.close();
		
		return ctpns;
	}
}
