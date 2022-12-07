package ThuVien;

import java.util.Scanner;
import java.util.Arrays;

public class DanhSachNhanVien {

	private int n;
	private NhanVienPT[] DanhSachNhanVien;
	private CheckLoi check = new CheckLoi();

	private Scanner sc = new Scanner(System.in);

	public DanhSachNhanVien() {
		n = 0;
		DanhSachNhanVien = null;
	}

	public DanhSachNhanVien(int n, NhanVienPT[] arrnv) {
		this.n = n;
		this.DanhSachNhanVien = arrnv;
	}

	public void xuatds() {
		for (int i = 0; i < DanhSachNhanVien.length; i++) {
			DanhSachNhanVien[i].Xuat();
		}
	}

	public void xoanv() {
		System.out.println("Nhap ma nhan vien can xoa:");
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
		System.out.println("Nhap vao ma nhan vien can tim:");
		String timnv = sc.nextLine();
		for (int i = 0; i < DanhSachNhanVien.length; i++) {
			if (DanhSachNhanVien[i].getMaNV().equalsIgnoreCase(timnv)) {
				DanhSachNhanVien[i].Xuat();
			}
		}
	}

	public void themnv() {
		System.out.println("Nhap thong tin nhan vien them:");
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
		System.out.printf("\n");
		int chon;
		do {
			System.out.println("=================== Danh Sach Quan Ly Nhan Vien ===================");
			System.out.println("|||\t1.Them nhan vien                            |||");
			System.out.println("|||\t2.Xoa nhan vien                             |||");
			System.out.println("|||\t3.Tim kiem nhan vien                        |||");
			System.out.println("|||\t4.Xem danh sach nhan vien                   |||");
			System.out.println("|||\t0.Thoat                                     |||");
			System.out.println("===========================================================");
			System.out.println("---Nhap vao chuc nang:");
			chon = check.KiemTraNhapSoNguyen();
			switch (chon) {
			case 0:
				break;
			case 1:
				themnv();
				break;
			case 2:
				xoanv();
				break;
			case 3:
				timkiemnv();
				break;
			case 4:
				xuatds();
				break;
			default:
				System.out.println("Nhap vao khong hop le!!!");
				break;
			}
		} while (chon != 0);
	}

}