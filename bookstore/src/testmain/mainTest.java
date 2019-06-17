package testmain;

import java.util.Date;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import config.hibSessionFactory;
import daos.nhanvienDao;
import daos.phieunhapDao;
import daos.sachDao;
import daos.theloaisachDao;
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
		
		theloaisachDao tl = new theloaisachDao();
		sachDao sDao = new sachDao();
		nhanvienDao nvd = new nhanvienDao();
		NhanVien nv = nvd.getNhanVienbyId(1);
		PhieuNhap pn = new PhieuNhap();
		phieunhapDao pndao = new phieunhapDao();
		 sDao.getListSachCon();
//		pn.setNgaynhap(new Date());
//		pn.setNhanvien(nv);
//		
//		ChiTietPhieuNhap ctpn = new ChiTietPhieuNhap();
//		ctpn.setGianhap(23000);
//		ctpn.setSoluong(20);
//		
//		pndao.deletePhieuNhap();
		//sDao.nhapSach(sDao.getSachbyId(1), nv, pn, ctpn);
		
		System.out.println( sDao.getListSachCon().size());
		
	}
}
