package daos;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import config.hibSessionFactory;
import models.NhanVien;
import models.PhieuNhap;

public class nhanvienDao {
	public NhanVien getNhanVienbyId(int id) {
		
		SessionFactory sessFac = hibSessionFactory.getSession();
		Session sess = sessFac.getCurrentSession();
		sess.beginTransaction();
		
		NhanVien nv = (NhanVien) sess.get(NhanVien.class,1);
		
		sess.getTransaction().commit();
		sess.close();
		
		return nv;
	}
}
