package daos;

import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import config.hibSessionFactory;
import models.ChiTietPhieuNhap;
import models.NhanVien;
import models.PhieuNhap;
import models.Sach;

public class sachDao {

	public List<Sach> getListSach() {
		SessionFactory sessFac = hibSessionFactory.getSession();
		Session sess = sessFac.getCurrentSession();
		sess.beginTransaction();
		String hql = "From Sach";
		Query query = sess.createQuery(hql);
		List<Sach> listSach = query.getResultList();
		sess.getTransaction().commit();
		sess.close();
		return listSach;
	}

	public void nhapSach(Sach sach, NhanVien nv, PhieuNhap pn, ChiTietPhieuNhap ctpn) {
		try {
			SessionFactory sessFac = hibSessionFactory.getSession();
			Session sess = sessFac.getCurrentSession();
			sess.beginTransaction();

			// chi tiết phiếu nhập
			/*ctpn.setGianhap(gianhap);
			ctpn.setSoluong(soluong);*/

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

	public Sach getSachbyName(String name) {
		SessionFactory sessFac = hibSessionFactory.getSession();
		Session sess = sessFac.getCurrentSession();
		sess.beginTransaction();

		Sach s = (Sach) sess.createQuery("from Sach s Where s.tensach = :name").setParameter("name", name)
				.getSingleResult();

		sess.getTransaction().commit();
		sess.close();

		return s;
	}

	public Sach getSachbyId(int id) {
		SessionFactory sessFac = hibSessionFactory.getSession();
		Session sess = sessFac.getCurrentSession();
		sess.beginTransaction();

		Sach s = (Sach) sess.createQuery("from Sach s Where s.masach = :id").setParameter("id", id).getSingleResult();

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

}
