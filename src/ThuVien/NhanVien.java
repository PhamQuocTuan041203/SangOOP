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
		System.out.println("Nhap vao ma nhan vien:");
		MaNV = sc.nextLine();
		System.out.println("Nhập vao ho ten nhan vien: ");
		hoten = sc.nextLine();
		System.out.println("Nhap vao muc luong co ban:");
		luongcb = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập vao he so luong:");
		hesoluong = Integer.parseInt(sc.nextLine());
	}

	public void Xuat() {
		System.out.printf("%-15s%-15s%-20s%-20s%-20s\n", "Ma nhan vien", "Ho ten", "Luong co ban", "He so luong",
				"Luong chinh thuc");
		System.out.printf("%-15s%-20s%-20s%-15s%-15s\n", this.MaNV, this.hoten, this.luongcb, this.hesoluong,
				tinhluong());
	}

	public double tinhluong() {
		this.luong = this.luongcb * this.hesoluong;
		return this.luong;
	}

}