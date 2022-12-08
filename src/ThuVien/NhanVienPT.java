package ThuVien;

import java.util.Scanner;

public class NhanVienPT extends NhanVien {

	protected int giolamviec;

	Scanner sc = new Scanner(System.in);

	public NhanVienPT() {
		super();
		giolamviec = 0;
	}

	public NhanVienPT(int giolamviec) {
		this.giolamviec = giolamviec;
	}

	public NhanVienPT(String MaNV, String hoten, int luong, int luongcb, int hesoluong, int giolamviec) {
		super(MaNV, hoten, luong, luongcb, hesoluong);
		this.giolamviec = giolamviec;
	}

	public int getGiolamviec() {
		return giolamviec;
	}

	public void setGiolamviec(int giolamviec) {
		this.giolamviec = giolamviec;
	}

	@Override
	public void nhap() {
		super.nhap();
		System.out.print("Nhap so gio lam viec cua nhan vien: ");
		giolamviec = Integer.parseInt(sc.nextLine());
	}

	@Override
	public void Xuat() {
		System.out.printf("%-15s%-20s%-20s%-15s%-15s%-15s\n", this.MaNV, this.hoten, this.luongcb, this.hesoluong,
				this.giolamviec, this.luong);
	}

	@Override
	public double tinhluong() {
		this.luong = this.luongcb * this.giolamviec;
		return this.luong;
	}

}