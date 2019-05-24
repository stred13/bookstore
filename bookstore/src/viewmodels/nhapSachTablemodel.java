package viewmodels;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import controllers.sachController;
import models.ChiTietPhieuNhap;
import models.Sach;

public class nhapSachTablemodel extends javax.swing.JFrame {
	List<ChiTietPhieuNhap> ctpns = new ArrayList<>();
	List<Sach> sachs = new ArrayList<>();
	sachController sCon = new sachController();
	DefaultTableModel Nmodel = new DefaultTableModel();

	public DefaultTableModel sachTablmodel() {
		DefaultTableModel model = new DefaultTableModel();

		model.setColumnIdentifiers(new Object[] { "ID", "Tên Sách", "Tác Giả", "Thể Loại", "Số Lượng", "Mô Tả" });
		sCon.getAllSach().forEach(sach -> {
			model.addRow(new Object[] { sach.getMasach(), sach.getTensach(), sach.getTacgia(),
					sach.getTLSach().getTentl(), sach.getSoluong(), sach.getMota() });
		});

		return model;
	}

	public void addchipntableModel(Sach s, ChiTietPhieuNhap ctpn) {

		Nmodel.addRow(new Object[] { s.getTensach(), s.getTacgia(), s.getTLSach().getTentl(), s.getSoluong(),
				ctpn.getSoluong(), ctpn.getGianhap() });

	}

	public nhapSachTablemodel(DefaultTableModel nmodel) throws HeadlessException {
		super();
		this.Nmodel = nmodel;
		Nmodel.setColumnIdentifiers(
				new Object[] { "Tên Sách", "Tác Giả", "Thể Loại", "Số Lượng Còn", "Số Lượng Nhập", "Giá Nhập" });
	}
	
	public List<Sach> getSachs() {
		return sachs;
	}

	public void setSachs(List<Sach> sachs) {
		this.sachs = sachs;
	}

	public List<ChiTietPhieuNhap> getCtpns() {
		return ctpns;
	}

	public void setCtpns(List<ChiTietPhieuNhap> ctpns) {
		this.ctpns = ctpns;
	}

	public nhapSachTablemodel() throws HeadlessException {
		super();
	}

}
