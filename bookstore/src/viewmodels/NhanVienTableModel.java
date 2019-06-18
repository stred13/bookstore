package viewmodels;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;
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
					nv.getGioitinh() == 1 ? "nam" : "Nữ", nv.getSdt(), nv.getDiachi() });
		});

		return DSNVModel;
	}
	public DefaultTableModel nhanVienTablmodelSearch(String txtSearch) {
		
		nvCon.getNhanVienSearch(txtSearch).forEach(nv -> {
			DSNVModel.addRow(new Object[] { nv.getManv(), nv.getTennv(), nv.getEmail(),
					nv.getGioitinh() == 1 ? "nam" : "Nữ", nv.getSdt(), nv.getDiachi() });
		});

		return DSNVModel;
	}

	public NhanVien getThongTinNhanVien(int maNV) {
		nv = nvCon.getNhanVienbyId(maNV);
		return nv;
	}
	public NhanVien NhanVienLogin(String tk, String mk) {
		nvlogin = (NhanVien) nvCon.getNhanVienLogin(tk, mk);
		return nvlogin;
	}
	public NhanVien getNhanVienLogin() {
		return nvlogin;
	}
	public void updateNhanVien(NhanVien nv) {
		nvCon.updateNhanVien(nv);
	}
	public void deleteNhanVien(int maNV) {
		NhanVien nvDelete = nvCon.getNhanVienbyId(maNV);
		if(nvDelete.getAdmin() == 0) {
			nvDelete.setXoa(1);
			nvCon.updateNhanVien(nvDelete);			
		}else {
			JOptionPane.showMessageDialog(null, "nhân viên Admin không thể xóa");
		}
	}
	public NhanVienTableModel() {
		super();
		DSNVModel.setColumnIdentifiers(new Object[] { "Mã NV", "Họ Tên", "Email", "Giới Tính", "SDT", "Địa Chỉ" });
		
	}

}
