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

public class NhanVienTableModel extends javax.swing.JFrame {
	nhanvienController nvCon = new nhanvienController();
	nhanvienDao nvDao = new nhanvienDao();
	NhanVien nv = nvDao.getNhanVienbyId(1);
	public DefaultTableModel nhanVienTablmodel() {
		DefaultTableModel model = new DefaultTableModel();

		model.setColumnIdentifiers(new Object[] { "Ma NV", "Ho Ten", "Email", "Gioi Tinh", "Ngay Sinh", "SDT", "Dia Chi" });
		nvCon.getAllNhanVien().forEach(nv -> {
			model.addRow(new Object[] { nv.getManv(), nv.getTennv(), nv.getEmail(),
					nv.getGioitinh(), nv.getNgaysinh(), nv.getSdt(), nv.getDiachi() });
		});

		return model;
	}
	public NhanVienTableModel() throws HeadlessException {
		super();
	}

}
