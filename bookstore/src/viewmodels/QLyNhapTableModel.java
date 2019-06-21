package viewmodels;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.swing.table.DefaultTableModel;

import daos.phieunhapDao;
import models.ChiTietPhieuNhap;
import models.PhieuNhap;
import models.Sach;

public class QLyNhapTableModel extends javax.swing.JFrame {
	private DefaultTableModel tbmdPhieuNhap = new DefaultTableModel();
	private phieunhapDao pnDao = new phieunhapDao();
	private DefaultTableModel tbmdCTPN = new DefaultTableModel();
	
	public int getTotalSachs(Set<ChiTietPhieuNhap> ctpns) {
		int sum =0;
		Iterator<ChiTietPhieuNhap> iCt = ctpns.iterator();
		while(iCt.hasNext()) {
			sum+=iCt.next().getSoluong();
		}
		return sum;
	}

	public DefaultTableModel getTbmdPhieuNhap() {
		tbmdPhieuNhap.setRowCount(0);
		pnDao.getListPhieuNhap().forEach(pn -> {
			tbmdPhieuNhap.addRow(new Object[] {pn.getMapn(),pn.getNgaynhap(),pn.getNhanvien().getManv(),getTotalSachs(pn.getCtpn())});
		});
		return this.tbmdPhieuNhap;
	}
	
	public DefaultTableModel getTbmdChiTietPN(PhieuNhap pn) {
		tbmdCTPN.setRowCount(0);
		pn.getCtpn().forEach(ctpn -> {
			tbmdCTPN.addRow(new Object[] {ctpn.getMactpn(),ctpn.getSach().getTensach(),ctpn.getSoluong(),ctpn.getGianhap()});
		});
		
		return this.tbmdCTPN;
	}

	
	
	
	public DefaultTableModel getTbmdCTPN() {
		return tbmdCTPN;
	}

	public void setTbmdCTPN(DefaultTableModel tbmdCTPN) {
		this.tbmdCTPN = tbmdCTPN;
	}

	public QLyNhapTableModel() {
		super();
		//this.tbmdPhieuNhap = tbmodel;
		this.tbmdPhieuNhap.setColumnIdentifiers(new Object[] { "MaPN", "Ngày Nhập", "Mã Nhân Viên","Số Lượng CTPN" });
		this.tbmdCTPN.setColumnIdentifiers(new Object[] { "MaCTPN", "Sach", "Số Lượng","Giá Nhập" });
	}

}
