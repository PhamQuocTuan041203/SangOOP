package ThuVien;

import java.util.Scanner;

public class NhanVien {

	protected String MaNV, hoten;
	protected int luongcb;
	protected int hesoluong;
	protected double luong;

	Scanner sc = new Scanner(System.in);

	public NhanVien() {
	}

	public NhanVien(String MaNV, String hoten, double luong, int luongcb, int hesoluong) {
		this.MaNV = MaNV;
		this.hoten = hoten;
		this.luongcb = luongcb;
		this.hesoluong = hesoluong;
		this.luong = luong;
	}

	public double getLuong() {
		return luong;
	}

	public void setLuong(double luong) {
		this.luong = luong;
	}

	public String getMaNV() {
		return MaNV;
	}

	public void setMaNV(String MaNV) {
		this.MaNV = MaNV;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public int getLuongcb() {
		return luongcb;
	}

	public void setLuongcb(int luongcb) {
		this.luongcb = luongcb;
	}

	public int getHesoluong() {
		return hesoluong;
	}

	public void setHesoluong(int hesoluong) {
		this.hesoluong = hesoluong;
	}

	public void nhap() {
		System.out.print("Nhap ma nhan vien: ");
		MaNV = sc.nextLine();
		System.out.print("Nhap ho va ten nhan vien: ");
		hoten = sc.nextLine();
		System.out.print("Nhap luong co ban: ");
		luongcb = Menu.check.KiemTraNhapSoNguyen();
		// luongcb = Integer.parseInt(sc.nextLine());
		System.out.print("Nhap he so luong: ");
		// hesoluong = Integer.parseInt(sc.nextLine());
		hesoluong = Menu.check.KiemTraNhapSoNguyen();
	}

	public void Xuat() {
		System.out.printf("%-15s%-18s%-20s%-15s%-15s\n", this.MaNV, this.hoten, this.luongcb, this.hesoluong,
				tinhluong());
	}

	public double tinhluong() {
		this.luong = this.luongcb * this.hesoluong;
		return this.luong;
	}

}