package daos;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import config.hibSessionFactory;
import models.ChiTietHoaDon;
import models.ChiTietPhieuNhap;
import models.HoaDonBanSach;
import models.KhachHang;
import models.NhanVien;
import models.PhieuNhap;

public class hoadonbansachDao {
	
	public void insertHoaDon(KhachHang kh,NhanVien nv) {
		SessionFactory sessFac = hibSessionFactory.getSession();
		Session sess = sessFac.getCurrentSession();
		sess.beginTransaction();
		
		HoaDonBanSach hd = new HoaDonBanSach();
		hd.setCthd(null);
		//hd.setKhachhang(kh);
		hd.setNhanvien(nv);
		hd.setNgaylap(new Date());
		hd.setCthd(null);
		
		sess.save(hd);		
		sess.getTransaction().commit();
		sess.close();
	}
	
	public List<HoaDonBanSach> getListHoaDon(){
		SessionFactory sessFac = hibSessionFactory.getSession();
		Session sess = sessFac.getCurrentSession();
		
		sess.beginTransaction();
		List<HoaDonBanSach> hoadons = sess.createQuery("from HoaDonBanSach").getResultList();
		
		sess.getTransaction().commit();
		sess.close();
		
		return hoadons;
	}
	
	public HoaDonBanSach getHoaDonbyId(int id) {
		SessionFactory sessFac = hibSessionFactory.getSession();
		Session sess = sessFac.getCurrentSession();
		sess.beginTransaction();
		
		HoaDonBanSach hd = sess.get(HoaDonBanSach.class, id);
		
		sess.getTransaction().commit();
		sess.close();
		return hd;
	}
	
}
