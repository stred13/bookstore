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
import models.ChiTietHoaDon;
import models.ChiTietPhieuNhap;
import models.HoaDonBanSach;
import models.NhanVien;
import models.PhieuNhap;
import models.Sach;
import view.DangNhap;

public class SachTableModel extends javax.swing.JFrame {
	sachController sCon = new sachController();
	DefaultTableModel DSSachModel = new DefaultTableModel();
	DefaultTableModel DSSachModelCon = new DefaultTableModel();
	DefaultTableModel tbmdMuaSach = new DefaultTableModel();
	List<ChiTietHoaDon> cthds = new ArrayList<>();
	NhanVien nv = new NhanVien();
	List<Sach> sachs = new ArrayList<>();
	nhanvienDao nvDao = new nhanvienDao();
	
	public DefaultTableModel getAllSachTableModel() {
		DSSachModel.setRowCount(0);
		sCon.getAllSach().forEach(s -> {
			DSSachModel.addRow(new Object[] { s.getMasach(), s.getTensach(), s.getTacgia(), s.getTLSach(), s.getGiaban(), s.getSoluong(), s.getMota() });
		});
		return DSSachModel;
	}
	
	public DefaultTableModel getAllSachTableModelCon() {
		DSSachModelCon.setRowCount(0);
		sCon.getAllSachCon().forEach(s -> {
			DSSachModelCon.addRow(new Object[] { s.getMasach(), s.getTensach(), s.getTacgia(), s.getTLSach(), s.getGiaban(), s.getSoluong(), s.getMota() });
		});
		return DSSachModelCon;
	}
	public DefaultTableModel getAllSachTableModelConSearch(String txtSearch) {
		DSSachModelCon.setRowCount(0);
		sCon.getAllSachSearch(txtSearch).forEach(s -> {
			if(s.getSoluong() > 0) {
				DSSachModelCon.addRow(new Object[] { s.getMasach(), s.getTensach(), s.getTacgia(), s.getTLSach(), s.getGiaban(), s.getSoluong(), s.getMota() });				
			}
		});
		return DSSachModelCon;
	}
	public DefaultTableModel getAllSachTablmodelSearch(String txtSearch) {
		DSSachModel.setRowCount(0);
		sCon.getAllSachSearch(txtSearch).forEach(s -> {
			DSSachModel.addRow(new Object[] { s.getMasach(), s.getTensach(), s.getTacgia(), s.getTLSach(), s.getGiaban(), s.getSoluong(), s.getMota() });
		});

		return DSSachModel;
	}
	
	public DefaultTableModel sachMuatbmd() {
		return this.tbmdMuaSach;
	}
	
	public void ChonSach(Sach sach, int slmua) {
			ChiTietHoaDon cthd = new ChiTietHoaDon();
			long tonggia = 0;
			tonggia = sach.getGiaban()*slmua;

			this.tbmdMuaSach.addRow(new Object[] {sach.getMasach(), sach.getTensach(), sach.getTacgia(),
					sach.getTLSach().getTentl(), sach.getGiaban(),slmua,tonggia});
			
			cthd.setDongia(sach.getGiaban());
			cthd.setSoluong(slmua);
			
			sachs.add(sach);
			cthds.add(cthd);

	}
	
	public void banSach() {
		HoaDonBanSach hd = new HoaDonBanSach();
		hd.setNgaylap(new Date());
		
		//nv = nvDao.getNhanVienbyId(1);
		hd.setNhanvien(DangNhap.nv);
		
		for(int i=0;i<sachs.size();i++) {
			sCon.banSach(sachs.get(i), DangNhap.nv, hd, cthds.get(i));
			//System.out.println(cthds.get(i).getSoluong());
		}
			
	}
	
	public void boChonSach(int row) {
		this.tbmdMuaSach.removeRow(row);
		cthds.remove(row);
		sachs.remove(row);
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
		DSSachModelCon.setColumnIdentifiers(new Object[] { "Mã Sách", "Tên Sách", "Tác Giả", "Thể Loại", "Giá Bán", "Số Lượng", "Mô Tả" });
		tbmdMuaSach.setColumnIdentifiers(new Object[] {"Mã Sách","Tên Sách","Tác Giả","Thể Loại","Giá Bán","Số Lượng","Tổng Giá"});
		
	}
	public DefaultTableModel getTbmdMuaSach() {
		return tbmdMuaSach;
	}
	public void setTbmdMuaSach(DefaultTableModel tbmdMuaSach) {
		this.tbmdMuaSach = tbmdMuaSach;
	}
	public List<ChiTietHoaDon> getCthds() {
		return cthds;
	}
	public void setCthds(List<ChiTietHoaDon> cthds) {
		this.cthds = cthds;
	}
	public List<Sach> getSachs() {
		return sachs;
	}
	public void setSachs(List<Sach> sachs) {
		this.sachs = sachs;
	}
	
	

}
