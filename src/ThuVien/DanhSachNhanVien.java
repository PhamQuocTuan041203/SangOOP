package ThuVien;

import java.util.Scanner;
import java.util.Arrays;

public class DanhSachNhanVien {

	private int n;
	private NhanVien[] DanhSachNhanVien;

	private Scanner sc = new Scanner(System.in);

	public DanhSachNhanVien() {
		n = 0;
		DanhSachNhanVien = null;
	}

	public DanhSachNhanVien(int n, NhanVien[] arrnv) {
		this.n = n;
		this.DanhSachNhanVien = arrnv;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public void xuatds() {
		System.out.println(
				"\n\n_________________________________________________________________________________________________________________________________________________________");
		System.out.printf("%-15s%-15s%-20s%-20s%-20s\n", "Ma nhan vien", "Ho ten", "Luong co ban", "He so luong",
				"Luong chinh thuc");
		System.out.println();

		for (int i = 0; i < DanhSachNhanVien.length; i++) {
			DanhSachNhanVien[i].Xuat();
		}
		System.out.println(
				"_________________________________________________________________________________________________________________________________________________________");
	}

	public void xoanv() {
		System.out.print("\nNhap Ma_NV muon xoa: ");
		String xoanv = sc.nextLine();
		int kt = 1;

		for (int i = 0; i < DanhSachNhanVien.length; i++) {
			if (DanhSachNhanVien[i].getMaNV().equalsIgnoreCase(xoanv)) {
				for (int j = i; j < DanhSachNhanVien.length - 1; j++) {
					DanhSachNhanVien[j] = DanhSachNhanVien[j + 1];
				}
				n--;
				DanhSachNhanVien = Arrays.copyOf(DanhSachNhanVien, DanhSachNhanVien.length - 1);
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

	public void timkiemnv() {
		int kt = 1;
		System.out.print("\nNhap Ma_NV muon tim: ");
		String timnv = sc.nextLine();

		for (int i = 0; i < DanhSachNhanVien.length; i++) {
			if (DanhSachNhanVien[i].getMaNV().equalsIgnoreCase(timnv)) {
				DanhSachNhanVien[i].Xuat();
				kt = 1;
				break;
			} else
				kt = 0;
		}

		if (kt == 0) {
			System.out.println("Khong tim thay Ma_NV!");
		} else {
			System.out.printf("%-15s%-15s%-20s%-20s%-20s\n", "Ma nhan vien", "Ho ten", "Luong co ban", "He so luong",
					"Luong chinh thuc");
			System.out.println();
		}
	}

	public void themnv() {
		System.out.print("\nThem Nhan Vien\n");
		NhanVien nv = new NhanVien();
		nv.nhap();
		DanhSachNhanVien = Arrays.copyOf(DanhSachNhanVien, DanhSachNhanVien.length + 1);
		DanhSachNhanVien[n] = nv;
		n++;
		Menu.ghi.GhiDanhSachNhanVien(nv);
	}

	public void NhapDanhSachNhanVien(NhanVien nv) {
		if (n != 0) {
			DanhSachNhanVien = Arrays.copyOf(DanhSachNhanVien, n + 1);
			DanhSachNhanVien[n] = nv;
			n++;
		} else {
			n = 1;
			DanhSachNhanVien = new NhanVien[n];
			DanhSachNhanVien[0] = nv;
		}
	}

	public void QuanLyNhanVien() {
		String lc;
		while (true) {
			System.out.println("\n\n================ QUAN LI NHAN VIEN ===============\n");
			System.out.println("\t1. Them nhan vien");
			System.out.println("\t2. Xoa nhan vien");
			System.out.println("\t3. Tim kiem nhan vien");
			System.out.println("\t4. Xem danh sach nhan vien");
			System.out.println("\t0. Tro ve");
			System.out.println("\n==================================================");
			System.out.print("Nhap lua chon cua ban: ");
			lc = sc.nextLine();

			switch (lc) {
				case "0":
					break;
				case "1":
					themnv();
					break;
				case "2":
					xoanv();
					break;
				case "3":
					timkiemnv();
					break;
				case "4":
					xuatds();
					break;

				default:
					System.out.println("Data Error!");
					break;
			}

			if (lc.equals("0")) {
				break;
			}
		}
	}

}