package testmain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import config.hibSessionFactory;
import models.sach;
import models.theloai;

public class mainTest {

	public static void main(String[] args) {
		
		Session sess = null;
		
		SessionFactory sessFac = hibSessionFactory.getSession();
		sess = sessFac.getCurrentSession();
		Transaction trans = sess.beginTransaction();
		theloai tl = (theloai) sess.load(theloai.class, 1);
		
		sach s = new sach("Me ma","hn",20000,tl);
		
		sess.save(s);
		System.out.println(tl.getSach().size());
		trans.commit();
		sess.close();
		
	}

}
