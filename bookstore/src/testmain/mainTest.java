package testmain;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import config.hibSessionFactory;
import daos.phieunhapDao;
import daos.sachDao;
import models.ChiTietHoaDon;
import models.ChiTietPhieuNhap;
import models.HoaDonBanSach;
import models.KhachHang;
import models.NhanVien;
import models.PhieuNhap;
import models.Sach;
import models.TheLoai;

public class mainTest {

	public static void main(String[] args) {
		
		Session sess = null;
		
		SessionFactory sessFac = hibSessionFactory.getSession();
		sess = sessFac.getCurrentSession();
		sess.beginTransaction();
		//Transaction trans = sess.beginTransaction();
		/*theloai tl = (theloai) sess.load(theloai.class, 1);
		
		sach s = new sach("Ham","hn",30000,tl);
		
		
		sess.save(s);
		System.out.println(tl.getSach().size());
		trans.commit();
		sess.close();*/
		
		/*sess.beginTransaction();
		PhieuNhap pn = new PhieuNhap(new Date());
		Sach s = (Sach) sess.load(Sach.class, 1);
		
		ChiTietPhieuNhap ctpn = new ChiTietPhieuNhap();
		ctpn.setDongia(250000);
		ctpn.setSoluong(15);
		ctpn.setSach(s);
		ctpn.setPhieunhap(pn);
		
		sess.persist(ctpn);
		sess.getTransaction().commit();*/
		/*NhanVien nv = (NhanVien) sess.load(NhanVien.class, 1);
		KhachHang kh = (KhachHang) sess.load(KhachHang.class, 1);
		Sach s = (Sach) sess.load(Sach.class, 1);
		//System.out.println(nv.getManv()+" "+kh.getMakh());
		
		HoaDonBanSach hd = new HoaDonBanSach();
		hd.setKhachhang(kh);
		hd.setNgaylap(new Date());
		hd.setNhanvien(nv);
		hd.setTongtien(50000);
		//hd.setMahd(3);
		
		ChiTietHoaDon cthd = new ChiTietHoaDon();
		cthd.setDongia(12000);
		cthd.setSach(s);
		cthd.setSoluong(4);
		cthd.setHoadon(hd);
		sess.save(cthd);*/
		
		/*TheLoai tl = (TheLoai) sess.load(TheLoai.class, 1);
		NhanVien nv = (NhanVien) sess.load(NhanVien.class, 1);
		Sach sach = new Sach();
		sach.setGiaban(0);
		sach.setTacgia("Tien");
		sach.setTensach("Tien heo");
		sach.setTLSach(tl);
		sess.getTransaction().commit();
		sess.close();
		sachDao sDao = new sachDao();
		sDao.nhapSach(sach, nv);		
		*/
		
		sachDao sDao = new sachDao();
		Sach s =sDao.getSachbyName("sachdoanh");
		System.out.println(s.getTensach());
	}
}
