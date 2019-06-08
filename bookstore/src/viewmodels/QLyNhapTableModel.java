package viewmodels;

import javax.swing.table.DefaultTableModel;

import daos.phieunhapDao;

public class QLyNhapTableModel extends javax.swing.JFrame {
	private DefaultTableModel tbmdPhieuNhap = new DefaultTableModel();
	private phieunhapDao pnDao = new phieunhapDao();

	public DefaultTableModel getTbmdPhieuNhap() {

		pnDao.getListPhieuNhap().forEach(pn -> {
			tbmdPhieuNhap.addRow(new Object[] {pn.getMapn(),pn.getNgaynhap(),pn.getNhanvien().getManv(),pn.getCtpn().size()});
		});
		return this.tbmdPhieuNhap;
	}

	
	
	public QLyNhapTableModel() {
		super();
		//this.tbmdPhieuNhap = tbmodel;
		this.tbmdPhieuNhap.setColumnIdentifiers(new Object[] { "MaPN", "Ngày Nhập", "Mã Nhân Viên","Số Lượng CTPN" });
	}

}
