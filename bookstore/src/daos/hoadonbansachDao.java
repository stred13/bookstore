package daos;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import config.hibSessionFactory;
import models.HoaDonBanSach;
import models.KhachHang;
import models.NhanVien;

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
	
	
	
}
