package ThuVien;

import java.util.Scanner;

public class PhieuNhapSach {

	private String NgayNhapHang;
	private String MaPhieuNhap;
	private String TenNV;
	private double TongTien;

	private Scanner sc = new Scanner(System.in);

	public PhieuNhapSach() {
		NgayNhapHang = null;
		MaPhieuNhap = null;
		TenNV = null;
		TongTien = 0;
	}

	public PhieuNhapSach(String NgayNhapHang, String MaPhieuNhap, String TenNV, double TongTien) {
		this.NgayNhapHang = NgayNhapHang;
		this.MaPhieuNhap = MaPhieuNhap;
		this.TenNV = TenNV;
		this.TongTien = TongTien;
	}

	public String getNgayNhapHang() {
		return NgayNhapHang;
	}

	public void setNgayNhapHang(String NgayNhapHang) {
		this.NgayNhapHang = NgayNhapHang;
	}

	public void setNgayNhapHang() {
		System.out.println("Nhap vao ngay nhap hang:");
		NgayNhapHang = sc.nextLine();
	}

	public String getMaPhieuNhap() {
		return MaPhieuNhap;
	}

	public void setMaPhieuNhap(String MaPhieuNhap) {
		this.MaPhieuNhap = MaPhieuNhap;
	}

	public String getTenNV() {
		return TenNV;
	}

	public void setTenNV(String TenNV) {
		this.TenNV = TenNV;
	}

	public double getTongTien() {
		return TongTien;
	}

	public void setTongTien(double TongTien) {
		this.TongTien = TongTien;
	}

	public void Nhap() {
		setNgayNhapHang();
		System.out.println("Ma phieu nhap: ");
		MaPhieuNhap = sc.nextLine();
		System.out.println("Ten nhan vien dang nhap: ");
		TenNV = sc.nextLine();
		System.out.println("Tong tien la: ");
		TongTien = Double.parseDouble(sc.nextLine());
	}

	public void Xuat() {
		System.out.printf("[%-15s][%-15s][%-20s][%-20s]\n", "Ngay nhap hang", "Ma phieu nhap", "Ten nhan vien nhap",
				"Tong tien");
		System.out.printf("[%-15s][%-15s][%-20s][%-20.2f]\n", NgayNhapHang, MaPhieuNhap, TenNV, TongTien);
	}

}