package daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import config.hibSessionFactory;
import models.TheLoai;

public class theloaisachDao {
	
	public List<TheLoai> getAllTheloai() {
		SessionFactory sessFac = hibSessionFactory.getSession();
		Session sess = sessFac.getCurrentSession();
		sess.beginTransaction();
		
		List<TheLoai> tls = sess.createQuery("from TheLoai").list(); 
		
		sess.getTransaction().commit();
		sess.close();
		return tls;
	}
}
