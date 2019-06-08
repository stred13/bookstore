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
	DefaultTableModel DSNVModel = new DefaultTableModel();
	NhanVien nv = new NhanVien();
	NhanVien nvlogin = new NhanVien();
	
	public DefaultTableModel nhanVienTablmodel() {
		
		nvCon.getAllNhanVien().forEach(nv -> {
			DSNVModel.addRow(new Object[] { nv.getManv(), nv.getTennv(), nv.getEmail(),
					nv.getGioitinh(), nv.getNgaysinh(), nv.getSdt(), nv.getDiachi() });
		});

		return DSNVModel;
	}
	public DefaultTableModel nhanVienTablmodelSearch(String txtSearch) {
		
		nvCon.getNhanVienSearch(txtSearch).forEach(nv -> {
			DSNVModel.addRow(new Object[] { nv.getManv(), nv.getTennv(), nv.getEmail(),
					nv.getGioitinh(), nv.getNgaysinh(), nv.getSdt(), nv.getDiachi() });
		});

		return DSNVModel;
	}

	public NhanVien getThongTinNhanVien(int maNV) {
		nv = nvCon.getNhanVienbyId(maNV);
		return nv;
	}
	public void NhanVienLogin(String tk, String mk) {
		nvlogin = nvCon.getNhanVienLogin(tk, mk);
	}
	public NhanVien getNhanVienLogin() {
		return nvlogin;
	}
	public void updateNhanVien(NhanVien nv) {
		nvCon.updateNhanVien(nv);
	}
	public void deleteNhanVien(int maNV) {
		NhanVien nvDelete = nvCon.getNhanVienbyId(maNV);
		nvCon.deleteNhanVien(nvDelete);
	}
	public NhanVienTableModel() {
		super();
		DSNVModel.setColumnIdentifiers(new Object[] { "Mã NV", "Họ Tên", "Email", "Giới Tính", "Ngày Sinh", "SDT", "Địa Chỉ" });
		
	}

}
