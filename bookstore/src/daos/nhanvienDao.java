package daos;

import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import config.hibSessionFactory;
import models.NhanVien;
import models.PhieuNhap;
import models.Sach;

public class nhanvienDao {
	
	public List<NhanVien> getListNhanVien() {
		SessionFactory sessFac = hibSessionFactory.getSession();
		Session sess = sessFac.getCurrentSession();
		sess.beginTransaction();
		String hql = "From NhanVien where xoa = 0 ";
		Query query = sess.createQuery(hql);
		List<NhanVien> listSach = query.getResultList();
		sess.getTransaction().commit();
		sess.close();
		return listSach;
	}
	public List<NhanVien> getNhanVienSearch(String txtSearch) {
		SessionFactory sessFac = hibSessionFactory.getSession();
		Session sess = sessFac.getCurrentSession();
		sess.beginTransaction();
		String hql = "From NhanVien s Where xoa = 0 and s.tennv like :txtSearch";
		List<NhanVien> listSach = sess.createQuery(hql).setParameter("txtSearch", "%" + txtSearch + "%").getResultList();

		sess.getTransaction().commit();
		sess.close();
		return listSach;
	}


	public NhanVien getNhanVienbyId(int id) {
		
		SessionFactory sessFac = hibSessionFactory.getSession();
		Session sess = sessFac.getCurrentSession();
		sess.beginTransaction();
		
		NhanVien nv = (NhanVien) sess.get(NhanVien.class,id);
		
		sess.getTransaction().commit();
		sess.close();
		
		return nv;
	}
	
	public NhanVien getNhanVienbyTaiKhoan(String tk, String mk) {
		SessionFactory sessFac = hibSessionFactory.getSession();
		Session sess = sessFac.getCurrentSession();
		sess.beginTransaction();

		List<NhanVien> s = sess.createQuery("from NhanVien s Where xoa = 0 and s.taikhoan = :tk and s.matkhau = :mk")
				.setParameter("tk", tk).setParameter("mk", mk)
				.getResultList();

		sess.getTransaction().commit();
		sess.close();
		if(s.size()==0)
			return null;
		return s.get(0);
	}
	public void insertNhanVien(NhanVien nv) {
		SessionFactory sessFac = hibSessionFactory.getSession();
		Session sess = sessFac.getCurrentSession();
		sess.beginTransaction();

		sess.save(nv);
		sess.getTransaction().commit();
		sess.close();
	}
	public void updateNhanVien(NhanVien nv) {
		SessionFactory sessFac = hibSessionFactory.getSession();
		Session sess = sessFac.getCurrentSession();
		sess.beginTransaction();

		sess.update(nv);
		sess.getTransaction().commit();
		sess.close();
	}
	public void deleteNhanVien(NhanVien nv) {
		SessionFactory sessFac = hibSessionFactory.getSession();
		Session sess = sessFac.getCurrentSession();
		sess.beginTransaction();

		sess.delete(nv);
		sess.getTransaction().commit();
		sess.close();
	}
}
