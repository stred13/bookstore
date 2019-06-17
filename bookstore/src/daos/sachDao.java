package daos;

import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import config.hibSessionFactory;
import models.ChiTietHoaDon;
import models.ChiTietPhieuNhap;
import models.HoaDonBanSach;
import models.NhanVien;
import models.PhieuNhap;
import models.Sach;

public class sachDao {

	public List<Sach> getListSach() {
		SessionFactory sessFac = hibSessionFactory.getSession();
		Session sess = sessFac.getCurrentSession();
		sess.beginTransaction();
		String hql = "From Sach where xoa = 0";
		Query query = sess.createQuery(hql);
		List<Sach> listSach = query.getResultList();
		sess.getTransaction().commit();
		sess.close();
		return listSach;
	}
	
	public List<Sach> getListSachCon() {
		SessionFactory sessFac = hibSessionFactory.getSession();
		Session sess = sessFac.getCurrentSession();
		sess.beginTransaction();
		String hql = "From Sach where soluong>0 and xoa = 0";
		Query query = sess.createQuery(hql);
		List<Sach> listSach = query.getResultList();
		sess.getTransaction().commit();
		sess.close();
		return listSach;
	}
	
	public void banSach(Sach sach,NhanVien nv, HoaDonBanSach hd, ChiTietHoaDon cthd) {
		try {
			SessionFactory sessFac = hibSessionFactory.getSession();
			Session sess = sessFac.getCurrentSession();
			sess.beginTransaction();

			// chi tiết phiếu nhập
			/*ctpn.setGianhap(gianhap);
			ctpn.setSoluong(soluong);*/
			
			sach.setSoluong(sach.getSoluong()-cthd.getSoluong());
			// thông tin sách
			cthd.setSach(sach);
			System.out.println("sl "+sach.getSoluong());
			// thông tin phiếu nhập
			cthd.setHoadon(hd);

			sess.save(cthd);
			sess.getTransaction().commit();
			sess.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void nhapSach(Sach sach, NhanVien nv, PhieuNhap pn, ChiTietPhieuNhap ctpn) {
		try {
			SessionFactory sessFac = hibSessionFactory.getSession();
			Session sess = sessFac.getCurrentSession();
			sess.beginTransaction();

			// chi tiết phiếu nhập
			/*ctpn.setGianhap(gianhap);
			ctpn.setSoluong(soluong);*/
			sach.setSoluong(sach.getSoluong()+ctpn.getSoluong());
			// thông tin sách
			ctpn.setSach(sach);

			// thông tin phiếu nhập
			ctpn.setPhieunhap(pn);

			sess.save(ctpn);
			sess.getTransaction().commit();
			sess.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Sach> getAllSachSearch(String txtSearch) {
		SessionFactory sessFac = hibSessionFactory.getSession();
		Session sess = sessFac.getCurrentSession();
		sess.beginTransaction();

		List<Sach> listSach = sess.createQuery("from Sach s Where s.xoa = 0 and s.tensach like :txtSearch")
				.setParameter("txtSearch", "%" + txtSearch + "%")
				.getResultList();

		sess.getTransaction().commit();
		sess.close();

		return listSach;
	}

	public Sach getSachbyName(String name) {
		SessionFactory sessFac = hibSessionFactory.getSession();
		Session sess = sessFac.getCurrentSession();
		sess.beginTransaction();

		Sach s = (Sach) sess.createQuery("from Sach s Where s.xoa = 0 and s.tensach = :name").setParameter("name", name)
				.getSingleResult();

		sess.getTransaction().commit();
		sess.close();

		return s;
	}

	public Sach getSachbyId(int id) {
		SessionFactory sessFac = hibSessionFactory.getSession();
		Session sess = sessFac.getCurrentSession();
		sess.beginTransaction();

		Sach s = (Sach) sess.createQuery("from Sach s Where s.xoa = 0 and s.masach = :id").setParameter("id", id).getSingleResult();

		sess.getTransaction().commit();
		sess.close();

		return s;
	}

	public void insertSach(Sach sach) {
		SessionFactory sessFac = hibSessionFactory.getSession();
		Session sess = sessFac.getCurrentSession();
		sess.beginTransaction();

		sess.save(sach);
		sess.getTransaction().commit();
		sess.close();
	}
	public void updateSach(Sach s) {
		SessionFactory sessFac = hibSessionFactory.getSession();
		Session sess = sessFac.getCurrentSession();
		sess.beginTransaction();

		sess.update(s);
		sess.getTransaction().commit();
		sess.close();
	}
	public void deleteSach(Sach s) {
		SessionFactory sessFac = hibSessionFactory.getSession();
		Session sess = sessFac.getCurrentSession();
		sess.beginTransaction();

		sess.delete(s);
		sess.getTransaction().commit();
		sess.close();
	}

}
