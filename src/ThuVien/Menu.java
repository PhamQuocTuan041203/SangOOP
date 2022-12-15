package ThuVien;

import java.util.Scanner;

public class Menu {

	public static Filee ghi = new GhiVaDocFile();
	private BookList DanhSachSach = new BookList();
	private BookList DanhSachSachMuon = new BookList();
	private DanhSachNhanVien DanhSachNhanVien = new DanhSachNhanVien();
	private DanhSachTheThuVien DanhSachTheThuVien = new DanhSachTheThuVien();
	private DanhSachTheMuon DanhSachTheMuon = new DanhSachTheMuon();
	private DanhSachPhieuNhap DanhSachPhieuNhap = new DanhSachPhieuNhap();

	private Scanner sc = new Scanner(System.in);
	public static CheckLoi check = new CheckLoi();

	public void KhoiTaoDuLieu() {
		ghi.DocDanhSachSach(DanhSachSach);
		ghi.DocDanhSachSGK(DanhSachSach);
		ghi.DocDanhSachVietNam(DanhSachSach);
		ghi.DocDanhSachTheThuVien(DanhSachTheThuVien);
		ghi.DocDanhSachTheMuon(DanhSachTheMuon);
		ghi.DocDanhSachNhanVien(DanhSachNhanVien);
	}

	public void BatDauChuongTrinh() {
		while (true) {
			String lc;
			System.out.println("\n\n========== CHUONG TRINH QUAN LY THU VIEN =========\n");
			System.out.println("\t1. Dang nhap");
			System.out.println("\t0. Thoat");
			System.out.println("\n==================================================");
			System.out.print("Nhap lua chon cua ban: ");
			lc = sc.nextLine();

			switch (lc) {
				case "0":
					break;
				case "1":
					DangNhap();
					break;

				default:
					System.out.println("Data Error!");
					break;
			}

			if (lc.equals("0"))
				break;
		}
	}

	public void DangNhap() {
		int chon;
		while (true) {
			String user, pass;
			System.out.print("\nAccount: ");
			user = sc.nextLine();
			System.out.print("Password: ");
			pass = sc.nextLine();

			if (user.equals("admin") && (pass.equals("admin"))) {
				chon = 2;
				break;
			} else if (user.equals("quoctuan") && (pass.equals("quoctuan"))) {
				chon = 1;
				break;
			} else {
				System.out.println("Error Data!");
			}
		}

		if (chon == 1) {
			QuanLyNhanVien();
		} else if (chon == 2) {
			DanhSachAdmin();
		}
	}

	public void DanhSachAdmin() {
		String lc;
		while (true) {
			System.out.println("\n\n================= QUAN LY AMDIN ================\n");
			System.out.println("\t1. Quan li Nhan Vien");
			System.out.println("\t2. Quan li Sach");
			System.out.println("\t3. Quan li The Thu Vien");
			System.out.println("\t4. Danh sach Cac The Muon");
			System.out.println("\t5. Quan li Phieu Nhap");
			System.out.println("\t0. Tro ve");
			System.out.println("\n================================================");
			System.out.print("Nhap lua chon cua ban: ");
			lc = sc.nextLine();

			switch (lc) {
				case "0":
					break;
				case "1":
					DanhSachNhanVien.QuanLyNhanVien();
					break;
				case "2":
					DanhSachSach.QuanLySach();
					break;
				case "3":
					DanhSachTheThuVien.QuanLyTheThuVien();
					break;
				case "4":
					DanhSachTheMuon.xuatthemuon();
					break;
				case "5":
					QuanLyPhieuNhap();
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

	public void QuanLyNhanVien() {
		String lc;
		while (true) {
			System.out.println("\n\n=============== QUAN LI NHAN VIEN ================\n");
			System.out.println("\t1. Thong ke sach Viet Nam");
			System.out.println("\t2. Thong ke sach Giao Khoa");
			System.out.println("\t3. Thong ke tat ca sach");
			System.out.println("\t4. Tim kiem sach");
			System.out.println("\t5. Xuat danh sach the muon");
			System.out.println("\t6. Nguoi dung muon sach");
			System.out.println("\t0. Tro ve");
			System.out.println("\n==================================================");
			System.out.print("Nhap lua chon cua ban: ");
			lc = sc.nextLine();

			switch (lc) {
				case "0":
					break;
				case "1":
					DanhSachSach.xuatdssvn();
					break;
				case "2":
					DanhSachSach.xuatdssgk();
					break;
				case "3":
					DanhSachSach.xuatds();
					break;
				case "4":
					DanhSachSach.timkiemsach();
					break;
				case "5":
					DanhSachTheMuon.xuatthemuon();
					break;
				case "6":
					MuonSach();
					ChoMuonSach();
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

	public void QuanLyPhieuNhap() {
		String lc;
		while (true) {
			System.out.println("\n\n========= QUAN LI PHIEU NHAP ===========\n");
			System.out.println("\t1. Them Phieu Nhap");
			System.out.println("\t2. Danh sach Phieu Nhap");
			System.out.println("\t3. Xoa Phieu Nhap");
			System.out.println("\t4. Tim kiem Phieu Nhap");
			System.out.println("\t0. Tro ve");
			System.out.println("\n========================================");
			System.out.print("Nhap lua chon cua ban: ");
			lc = sc.nextLine();

			switch (lc) {
				case "1":
					DanhSachPhieuNhap.nhapds();
					break;
				case "2":
					DanhSachPhieuNhap.Xuat();
					break;
				case "3":
					DanhSachPhieuNhap.xoapn();
					break;
				case "4":
					DanhSachPhieuNhap.timkiempn();
					break;

				default:
					System.out.println("Error Data!");
					break;
			}

			if (lc.equals("0")) {
				break;
			}
		}
		DanhSachAdmin();
	}

	public void MuonSach() {
		int kt = 1;
		do {
			System.out.println("\n\n0. Tiep tuc");
			System.out.print("Nhap Ma_Sach can muon: ");
			String MaSach = sc.nextLine();
			if (MaSach.charAt(0) == '0') {
				break;
			} else {
				for (int i = 0; i < DanhSachSach.getN(); i++) {
					if (DanhSachSach.getSach(i).getMaSach().equals(MaSach)) {
						System.out.println("Nhap thanh cong!");
						DanhSachSachMuon.NhapDanhSach(DanhSachSach.getSach(i));
						kt = 1;
						break;
					} else
						kt = 0;
				}

				if (kt == 0) {
					System.out.println("Khong tim thay Ma_Sach!");
				}
			}
		} while (true);
	}

	public void ChoMuonSach() {
		System.out.println("\nNhap thong tin nguoi muon sach");
		TheThuVien thethuvien = new TheThuVien();
		System.out.print("Nhap Ma_DocGia: ");
		String MaDocGia = sc.nextLine();
		for (int i = 0; i < DanhSachTheThuVien.getN(); i++) {
			if (DanhSachTheThuVien.getThe(i).getMaDocGia().equals(MaDocGia)) {
				thethuvien = DanhSachTheThuVien.getThe(i);
			}
		}
		System.out.print("Nhap vao Ma_TheMuon: ");
		String MaMuon = sc.nextLine();
		System.out.print("Nhap vao ngay muon: ");
		String NgayMuon = sc.nextLine();
		System.out.print("Nhap vao ngay tra: ");
		String NgayTra = sc.nextLine();

		for (int i = 0; i < DanhSachSachMuon.getN(); i++) {
			themuon The = new themuon();
			The.setHanTra(NgayTra);
			The.setNgayMuon(NgayMuon);
			The.setMaKhach(thethuvien.getMaDocGia());
			The.setMaMuon(MaMuon);
			The.setMaSach(DanhSachSachMuon.getSach(i).getMaSach());
			DanhSachTheMuon.NhapDanhSach(The);
			ghi.GhiDanhSachTheMuon(The);
		}
		DanhSachSachMuon = new BookList();
	}

	public void TraSach() {
		System.out.println("Nhap vao ma doc gia: ");
		String MaDocGia = sc.nextLine();
		System.out.println("Nhap vao ngay tra: ");
		String NgayTra = sc.nextLine();

		for (int i = 0; i < DanhSachTheMuon.getN(); i++) {
			if (DanhSachTheMuon.GetTheMuon(i).getMaKhach().equals(MaDocGia))
				if (!check.CheckNgayTra1(DanhSachTheMuon.GetTheMuon(i).getHanTra(), NgayTra)) {
					System.out.println("Xu phat!");
					HeThongXuPhat xlvp = new XuLyViPham();
					System.out.println("Moi nop phat: " + xlvp.getXuphat());
				}
		}
	}

}