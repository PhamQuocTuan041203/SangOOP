package ThuVien;

import java.util.Scanner;
import java.util.Arrays;

public class DanhSachPhieuNhap {

	private int n;
	private PhieuNhapSach[] DanhSachPhieuNhap;

	private final Scanner sc = new Scanner(System.in);

	private final CheckLoi check = new CheckLoi();

	public DanhSachPhieuNhap() {
		DanhSachPhieuNhap = null;
		n = 0;
	}

	public DanhSachPhieuNhap(int n, PhieuNhapSach[] DanhSachPhieuNhap) {
		this.n = n;
		this.DanhSachPhieuNhap = DanhSachPhieuNhap;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public void nhapds() {
		System.out.print("\nNhap vao so phieu nhap: ");
		n = Integer.parseInt(sc.nextLine());
		DanhSachPhieuNhap = new PhieuNhapSach[n];
		for (int i = 0; i < n; i++) {
			System.out.println("\nNhap vao phieu nhap thu: " + (i + 1));
			DanhSachPhieuNhap[i] = new PhieuNhapSach();
			DanhSachPhieuNhap[i].Nhap();
		}
	}

	public void Xuat() {
		for (int i = 0; i < n; i++) {
			System.out.println("\nThong tin phieu nhap: ");
			DanhSachPhieuNhap[i].Xuat();
		}
	}

	public void xoapn() {
		int kt = 1;
		System.out.print("Nhap Ma_PhieuNhap can xoa: ");
		String xoas = sc.nextLine();
		for (int i = 0; i < DanhSachPhieuNhap.length; i++) {
			if (DanhSachPhieuNhap[i].getMaPhieuNhap().equalsIgnoreCase(xoas)) {
				for (int j = i; j < DanhSachPhieuNhap.length - 1; j++) {
					DanhSachPhieuNhap[j] = DanhSachPhieuNhap[j + 1];
				}
				n--;
				DanhSachPhieuNhap = Arrays.copyOf(DanhSachPhieuNhap, DanhSachPhieuNhap.length - 1);
				kt = 1;
				break;
			} else
				kt = 0;
		}

		if (kt == 0) {
			System.out.println("Khong tim thay Ma_NV!");
		} else
			System.out.println("Xoa thanh cong!");
	}

	public void timkiempn() {
		int kt = 1;
		System.out.print("Nhap Ma_PhieuNhap can tim: ");
		String tims = sc.nextLine();
		for (int i = 0; i < DanhSachPhieuNhap.length; i++) {
			if (DanhSachPhieuNhap[i].getMaPhieuNhap().equalsIgnoreCase(tims)) {
				DanhSachPhieuNhap[i].Xuat();
				kt = 1;
				break;
			} else
				kt = 0;
		}

		if (kt == 0) {
			System.out.println("Khong tim thay Ma_NV!");
		}
	}

	public PhieuNhapSach getPhieuNhap(int i) {
		return DanhSachPhieuNhap[i];
	}

}