package ThuVien;

import java.util.Scanner;
import java.util.Arrays;

public class DanhSachSGK {

	private int n;
	private SachGiaoKhoa[] arrsgk;

	Scanner sc = new Scanner(System.in);

	public DanhSachSGK() {
		arrsgk = null;
		n = 0;
	}

	public DanhSachSGK(int n, SachGiaoKhoa[] arrsgk) {
		this.n = n;
		this.arrsgk = arrsgk;
	}

	public void nhapds() {
		System.out.println("Nhap vao so luong sach giao khoa: ");
		n = Integer.parseInt(sc.nextLine());
		arrsgk = new SachGiaoKhoa[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap vao sach thu: " + (i + 1));
			Sach a = new Sach();
			arrsgk[i] = new SachGiaoKhoa();
			arrsgk[i].Nhap();
		}
	}

	public void xuatds() {
		System.out.println("=============== DANH SACH CAC SACH ===============");
		for (int i = 0; i < arrsgk.length; i++) {
			arrsgk[i].Xuat();
			System.out.println("==================================================");
		}
	}

	public void nhapthemsach() {
		System.out.println("Nhap them thong tin sach giao khoa: ");
		SachGiaoKhoa sgk = new SachGiaoKhoa();
		sgk.Nhap();
		arrsgk = Arrays.copyOf(arrsgk, arrsgk.length + 1);
		arrsgk[n] = sgk;
		n++;
	}

	public void xoasach() {
		System.out.println("Nhap ma sach can xoa: ");
		String xoas = sc.nextLine();
		for (int i = 0; i < arrsgk.length; i++) {
			if (arrsgk[i].getMaSach().equalsIgnoreCase(xoas)) {
				for (int j = i; j < arrsgk.length - 1; j++) {
					arrsgk[j] = arrsgk[j + 1];
				}
				n--;
				arrsgk = Arrays.copyOf(arrsgk, arrsgk.length - 1);
			}
		}
	}

	public void timkiemsach() {
		System.out.println("Nhap vao sach can tim: ");
		String tims = sc.nextLine();
		for (int i = 0; i < arrsgk.length; i++) {
			if (arrsgk[i].getMaSach().equalsIgnoreCase(tims)) {
				arrsgk[i].Xuat();
			}
		}
	}

	public void NhapDanhSachSGK(SachGiaoKhoa sgk) {
		if (n == 0) {
			arrsgk = new SachGiaoKhoa[1];
			arrsgk[n] = sgk;
			n++;
		} else {
			arrsgk = Arrays.copyOf(arrsgk, n + 1);
			arrsgk[n] = sgk;
			n++;
		}
	}

}