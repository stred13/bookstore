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

	
	public void nhapSach(Sach sach,NhanVien nv) {
		SessionFactory sessFac = hibSessionFactory.getSession();
		Session sess = sessFac.getCurrentSession();
		sess.beginTransaction();
		
		//tạo phiếu nhập
		PhieuNhap pn = new PhieuNhap();
		pn.setNgaynhap(new Date());
		pn.setNhanvien(nv);
		
		//chi tiết phiếu nhập
		ChiTietPhieuNhap ctpn = new ChiTietPhieuNhap();
		ctpn.setGianhap(250000);
		ctpn.setSoluong(15);
		
		//thông tin sách
		ctpn.setSach(sach);
		
		//thông tin phiếu nhập
		ctpn.setPhieunhap(pn);
		
		sess.save(ctpn);
		sess.getTransaction().commit();
		sess.close();
		
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
