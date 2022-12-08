package ThuVien;

import java.util.Scanner;
import java.util.Arrays;

public class DanhSachNhanVien {

	private int n;
	private NhanVienPT[] DanhSachNhanVien;

	private Scanner sc = new Scanner(System.in);

	public DanhSachNhanVien() {
		n = 0;
		DanhSachNhanVien = null;
	}

	public DanhSachNhanVien(int n, NhanVienPT[] arrnv) {
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
		System.out.printf("%-15s%-15s%-20s%-20s%-15s%-20s\n", "Ma nhan vien", "Ho ten", "Luong co ban", "He so luong",
				"Gio lam viec", "Luong chinh thuc");
		for (int i = 0; i < DanhSachNhanVien.length; i++) {
			DanhSachNhanVien[i].Xuat();
		}
	}

	public void xoanv() {
		System.out.print("Nhập Mã_Nv nhân viên muốn xóa: ");
		String xoanv = sc.nextLine();
		for (int i = 0; i < DanhSachNhanVien.length; i++) {
			if (DanhSachNhanVien[i].getMaNV().equalsIgnoreCase(xoanv)) {
				for (int j = i; j < DanhSachNhanVien.length - 1; j++) {
					DanhSachNhanVien[j] = DanhSachNhanVien[j + 1];
				}
				n--;
				DanhSachNhanVien = Arrays.copyOf(DanhSachNhanVien, DanhSachNhanVien.length - 1);
			}
		}
	}

	public void timkiemnv() {
		System.out.print("Nhập Mã_NV nhân viên muốn tìm: ");
		String timnv = sc.nextLine();
		for (int i = 0; i < DanhSachNhanVien.length; i++) {
			if (DanhSachNhanVien[i].getMaNV().equalsIgnoreCase(timnv)) {
				DanhSachNhanVien[i].Xuat();
			}
		}
	}

	public void themnv() {
		System.out.println("Nhập thông tin nhân viên muốn thêm");
		NhanVienPT nv = new NhanVienPT();
		nv.nhap();
		DanhSachNhanVien = Arrays.copyOf(DanhSachNhanVien, DanhSachNhanVien.length + 1);
		DanhSachNhanVien[n] = nv;
		n++;
	}

	public void NhapDanhSachNhanVien(NhanVienPT nv) {
		if (n != 0) {
			DanhSachNhanVien = Arrays.copyOf(DanhSachNhanVien, n + 1);
			DanhSachNhanVien[n] = nv;
			n++;
		} else {
			n = 1;
			DanhSachNhanVien = new NhanVienPT[n];
			DanhSachNhanVien[0] = nv;
		}
	}

	public void QuanLyNhanVien() {
		String lc;
		while (true) {
			System.out.println("====== Danh Sach Quan Ly Nhan Vien ======");
			System.out.println("|||                                   |||");
			System.out.println("|||\t1. Them nhan vien                 |||");
			System.out.println("|||\t2. Xoa nhan vien                  |||");
			System.out.println("|||\t3. Tim kiem nhan vien             |||");
			System.out.println("|||\t4. Xem danh sach nhan vien        |||");
			System.out.println("|||\t0. Return                        |||");
			System.out.println("0. Return");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.print("Your choosen: ");
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