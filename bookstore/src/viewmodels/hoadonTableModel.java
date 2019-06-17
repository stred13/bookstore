package viewmodels;

import java.util.Iterator;
import java.util.Set;

import javax.swing.table.DefaultTableModel;

import controllers.hoadonController;
import daos.hoadonbansachDao;
import models.ChiTietHoaDon;
import models.ChiTietPhieuNhap;
import models.HoaDonBanSach;

public class hoadonTableModel {
	DefaultTableModel tbmdHoaDon = new DefaultTableModel();
	DefaultTableModel tbmdCTHD = new DefaultTableModel();
	hoadonbansachDao hdDao = new hoadonbansachDao();
	
	
	public long getTotalSachs(Set<ChiTietHoaDon> cthds) {
		int sum =0;
		Iterator<ChiTietHoaDon> iCt = cthds.iterator();
		while(iCt.hasNext()) {
			sum+=iCt.next().getSoluong();
		}
		return sum;
	}
	
	public long getTienHD(Set<ChiTietHoaDon> cthds) {
		long sum =0;
		Iterator<ChiTietHoaDon> iCt = cthds.iterator();
		while(iCt.hasNext()) {
			ChiTietHoaDon itemp = iCt.next();
			sum+=itemp.getDongia()*itemp.getSoluong();
		}
		return sum;
	}
	
	public DefaultTableModel gettbmdHoaDonAll() {
		this.tbmdHoaDon.setRowCount(0);
		hdDao.getListHoaDon().forEach(hd->{
			tbmdHoaDon.addRow(new Object[] {hd.getMahd(),hd.getNgaylap(),hd.getNhanvien().getManv(),getTotalSachs(hd.getCthd())});
		});
		return this.tbmdHoaDon;
	}
	
	public DefaultTableModel gettbmdCTHDs(HoaDonBanSach hd) {
		tbmdCTHD.setRowCount(0);
		hd.getCthd().forEach(cthd -> {
			tbmdCTHD.addRow(new Object[] {cthd.getMacthd(),cthd.getSach().getTensach(),cthd.getDongia(),cthd.getSoluong()});
		});
		
		return this.tbmdCTHD;
	}
	
	public hoadonTableModel() {
		super();
		//this.tbmdPhieuNhap = tbmodel;
		this.tbmdHoaDon.setColumnIdentifiers(new Object[] { "MaHD", "Ngày Lập", "Mã Nhân Viên","Số Lượng CTHD" });
		this.tbmdCTHD.setColumnIdentifiers(new Object[] { "MaCTHD", "Mã Sach","Giá Bán","Số Lượng" });
	}
}
