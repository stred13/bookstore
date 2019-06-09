package viewmodels;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import controllers.nhanvienController;
import controllers.sachController;
import daos.nhanvienDao;
import daos.sachDao;
import models.ChiTietPhieuNhap;
import models.NhanVien;
import models.PhieuNhap;
import models.Sach;

public class SachTableModel extends javax.swing.JFrame {
	sachController sCon = new sachController();
	DefaultTableModel DSSachModel = new DefaultTableModel();
	
	public DefaultTableModel getAllSachTableModel() {
		DSSachModel.setRowCount(0);
		sCon.getAllSach().forEach(s -> {
			DSSachModel.addRow(new Object[] { s.getMasach(), s.getTensach(), s.getTacgia(), s.getTLSach(), s.getGiaban(), s.getSoluong(), s.getMota() });
		});
		return DSSachModel;
	}
	public DefaultTableModel getAllSachTablmodelSearch(String txtSearch) {
		DSSachModel.setRowCount(0);
		sCon.getAllSachSearch(txtSearch).forEach(s -> {
			DSSachModel.addRow(new Object[] { s.getMasach(), s.getTensach(), s.getTacgia(), s.getTLSach(), s.getGiaban(), s.getSoluong(), s.getMota() });
		});

		return DSSachModel;
	}

	public Sach getThongTinSach(int maSach) {
		Sach s = sCon.getSachbyId(maSach);
		return s;
	}
	public void updateSach(Sach sUpdate) {
		sCon.updateSach(sUpdate);
	}
	public void deleteSach(int maSach) {
		Sach sDelete = sCon.getSachbyId(maSach);
		sDelete.setXoa(1);
		sCon.updateSach(sDelete);
	}
	public SachTableModel() {
		super();
		DSSachModel.setColumnIdentifiers(new Object[] { "Mã Sách", "Tên Sách", "Tác Giả", "Thể Loại", "Giá Bán", "Số Lượng", "Mô Tả" });
		
	}

}
