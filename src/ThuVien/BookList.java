package ThuVien;

import java.util.Scanner;
import java.util.Arrays;

public class BookList {

    private int n;
    private Sach[] DanhSachSach;

    private final Scanner sc = new Scanner(System.in);

    public BookList() {
        DanhSachSach = null;
        n = 0;
    }

    public BookList(int n, Sach[] DanhSachSach) {
        this.n = n;
        this.DanhSachSach = DanhSachSach;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void nhapds() {
        System.out.println("Nhap vao so luong sach: ");
        n = Integer.parseInt(sc.nextLine());
        DanhSachSach = new Sach[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao sach thu: " + (i + 1));
            Sach a = new Sach();
            DanhSachSach[i] = new Sach();
            DanhSachSach[i].Nhap();
        }
    }

    public void xuatds() {
        System.out.println("\n\n\t========================= DANH SACH CAC QUYEN SACH =========================\n");
        System.out.printf("[%-15s][%-25s][%-20s][%-15s][%-15s][%-15s]\n", "Ma sach", "Ten sach", "Tac gia",
                "Nha xuat ban", "Tinh trang sach", "The loai");
        System.out.println();

        for (int i = 0; i < DanhSachSach.length; i++) {
            DanhSachSach[i].Xuat();
        }
    }

    public void xuatdssgk() {
        System.out.println("\n\n\t==================== DANH SACH SACH GIAO KHOA ====================\n");
        System.out.printf("[%-15s][%-25s][%-20s][%-15s][%-15s][%-15s]\n", "Ma sach", "Ten sach", "Tac gia",
                "Nha xuat ban", "Tinh trang sach", "The loai");
        System.out.println();

        for (int i = 0; i < DanhSachSach.length; i++) {
            if (DanhSachSach[i] instanceof SachGiaoKhoa) {
                DanhSachSach[i].Xuat();
            }
        }
    }

    public void xuatdssvn() {
        System.out.println("\n\n\t==================== DANH SACH SACH VIET NAM ====================\n");
        System.out.printf("[%-15s][%-25s][%-20s][%-15s][%-15s][%-15s]\n", "Ma sach", "Ten sach", "Tac gia",
                "Nha xuat ban", "Tinh trang sach", "The loai");
        System.out.println();

        for (int i = 0; i < DanhSachSach.length; i++) {
            if (DanhSachSach[i] instanceof SachVietNam) {
                DanhSachSach[i].Xuat();
            }
        }
    }

    public void nhapthemsach() {
        System.out.println("Nhap them thong tin sach: ");
        Sach s = new Sach();
        s.Nhap();
        DanhSachSach = Arrays.copyOf(DanhSachSach, DanhSachSach.length + 1);
        DanhSachSach[n] = s;
        n++;
    }

    public void xoasach() {
        int kt = 1;
        System.out.print("Nhap Ma_Sach can xoa: ");
        String xoas = sc.nextLine();

        for (int i = 0; i < DanhSachSach.length; i++) {
            if (DanhSachSach[i].getMaSach().equalsIgnoreCase(xoas)) {
                for (int j = i; j < DanhSachSach.length - 1; j++) {
                    DanhSachSach[j] = DanhSachSach[j + 1];
                }
                n--;
                DanhSachSach = Arrays.copyOf(DanhSachSach, DanhSachSach.length - 1);
                kt = 1;
                break;
            } else
                kt = 0;
        }

        if (kt == 0) {
            System.out.println("Khong tim thay Ma_Sach!");
        } else
            System.out.println("Xoa thanh cong!");
    }

    public void timkiemsach() {
        int kt = 1;
        System.out.print("\nNhap Ma_Sach can tim: ");
        String tims = sc.nextLine();
        for (int i = 0; i < DanhSachSach.length; i++) {
            if (DanhSachSach[i].getMaSach().equalsIgnoreCase(tims)) {
                DanhSachSach[i].Xuat();
                kt = 1;
                break;
            } else
                kt = 0;
        }

        if (kt == 0) {
            System.out.println("Khong tim thay Ma_Sach!");
        }
    }

    public void NhapDanhSach(Sach sach) {
        if (n == 0) {
            DanhSachSach = new Sach[1];
            DanhSachSach[n] = sach;
            n++;
        } else {
            DanhSachSach = Arrays.copyOf(DanhSachSach, n + 1);
            DanhSachSach[n] = sach;
            n++;
        }
    }

    public void NhapSachMoi() {
        int chon;
        do {
            Sach sach = null;
            System.out.println("\n\n============ CHON THE LOAI ============\n");
            System.out.println("\t1. Sach Viet Nam");
            System.out.println("\t2. Sach Giao Khoa");
            System.out.println("\t3. Sach tuy thich");
            System.out.println("\t0. Thoat");
            System.out.println("==================================================");
            System.out.print("Nhap lua chon cua ban: ");
            chon = Menu.check.KiemTraNhapSoNguyen();

            switch (chon) {
                case 0:
                    break;
                case 1:
                    sach = new SachVietNam();
                    sach.Nhap();
                    Menu.ghi.GhiDanhSachSach(sach);
                    Menu.ghi.GhiDanhSachSachVietNam(sach);
                    break;
                case 2:
                    sach = new SachGiaoKhoa();
                    sach.Nhap();
                    Menu.ghi.GhiDanhSachSach(sach);
                    Menu.ghi.GhiDanhSachSGK(sach);
                    break;
                case 3:
                    sach = new Sach();
                    sach.Nhap();
                    Menu.ghi.GhiDanhSachSach(sach);
            }
            if (sach != null) {
                DanhSachSach = Arrays.copyOf(DanhSachSach, DanhSachSach.length + 1);
                DanhSachSach[n] = sach;
                n++;
                System.out.println("Nhap thanh cong!");
            }
        } while (chon != 0);
    }

    public void QuanLySach() {
        System.out.printf("\n");
        int chon;
        do {
            System.out.println("\n\n================ Quan Ly Cac Quyen Sach ================\n");
            System.out.println("\t1. Them sach moi");
            System.out.println("\t2. Xoa sach");
            System.out.println("\t3. Tim kiem sach");
            System.out.println("\t4. Xem danh sach sach Viet Nam");
            System.out.println("\t5. Xem danh sach sach Giao Khoa");
            System.out.println("\t6. Xem danh sach Tong Hop");
            System.out.println("\t0. Tro ve");
            System.out.println("\n===========================================================");
            System.out.print("Nhap lua chon cua ban: ");
            chon = Menu.check.KiemTraNhapSoNguyen();

            switch (chon) {
                case 0:
                    break;
                case 1:
                    NhapSachMoi();
                    break;
                case 2:
                    xoasach();
                    break;
                case 3:
                    timkiemsach();
                    break;
                case 4:
                    xuatdssvn();
                    break;
                case 5:
                    xuatdssgk();
                    break;
                case 6:
                    xuatds();
                    break;
                default:
                    System.out.println("Nhap vao khong hop le!");
                    break;
            }
        } while (chon != 0);
    }

    public Sach getSach(int i) {
        return DanhSachSach[i];
    }

}