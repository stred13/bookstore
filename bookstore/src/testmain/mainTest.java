package testmain;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import config.hibSessionFactory;
import models.ChiTietPhieuNhap;
import models.PhieuNhap;
import models.Sach;
import models.TheLoai;

public class mainTest {

	public static void main(String[] args) {
		
		Session sess = null;
		
		SessionFactory sessFac = hibSessionFactory.getSession();
		sess = sessFac.getCurrentSession();
		//Transaction trans = sess.beginTransaction();
		/*theloai tl = (theloai) sess.load(theloai.class, 1);
		
		sach s = new sach("Ham","hn",30000,tl);
		
		
		sess.save(s);
		System.out.println(tl.getSach().size());
		trans.commit();
		sess.close();*/
		
		sess.beginTransaction();
		PhieuNhap pn = new PhieuNhap(new Date());
		Sach s = (Sach) sess.load(Sach.class, 1);
		
		ChiTietPhieuNhap ctpn = new ChiTietPhieuNhap();
		ctpn.setDongia(250000);
		ctpn.setSoluong(15);
		ctpn.setSach(s);
		ctpn.setPhieunhap(pn);
		
		sess.persist(ctpn);
		sess.getTransaction().commit();
		//trans.commit();
		sess.close();
		
	}
}
