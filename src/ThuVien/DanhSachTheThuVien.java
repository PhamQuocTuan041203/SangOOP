package ThuVien;

import java.util.Scanner;
import java.util.Arrays;

public class DanhSachTheThuVien {

    private CheckLoi check = new CheckLoi();
    private int n;
    private TheThuVien[] arrt;

    private final Scanner sc = new Scanner(System.in);

    public DanhSachTheThuVien() {
        arrt = null;
        n = 0;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public DanhSachTheThuVien(int n, TheThuVien[] arrt) {
        this.n = n;
        this.arrt = arrt;
    }

    public TheThuVien getThe(int i) {
        return arrt[i];
    }

    public void nhapds() {
        System.out.println("Nhap vao so luong the: ");
        n = Integer.parseInt(sc.nextLine());
        arrt = new TheThuVien[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao the thu: " + (i + 1));
            TheThuVien a = new TheThuVien();
            arrt[i] = new TheThuVien();
            arrt[i].thongTinConNguoi();
        }
    }

    public void xuatds() {
        System.out.println("\n\n\n\t\t\t===================== Danh Sach The Thu Vien =====================\n");
        System.out.printf("[%-10s][%-15s][%-15s][%-25s][%-10s][%-10s][%-10s][%-10s][%-15s][%-15s]\n", "Ma doc gia",
                "Ho ten", "Ngay sinh", "Email", "Dia chi", "Dien thoai", "Gioi tinh", "So the", "Ngay bat dau",
                "Ngay ket thuc");
        System.out.println();

        for (int i = 0; i < arrt.length; i++) {
            arrt[i].Xuat();
        }
    }

    public void nhapthemthe() {
        System.out.println("\nThem the Thu Vien");
        TheThuVien the = new TheThuVien();
        the.thongTinConNguoi();
        arrt = Arrays.copyOf(arrt, arrt.length + 1);
        arrt[n] = the;
        n++;
        Menu.ghi.GhiDanhSachTheThuVien(the);
    }

    public void xoathe() {
        int kt = 1;
        System.out.print("\nNhap vao Ma_TheThuVien can xoa: ");
        String xoathe = sc.nextLine();
        for (int i = 0; i < arrt.length; i++) {
            if (arrt[i].getSoThe().equalsIgnoreCase(xoathe)) {
                for (int j = i; j < arrt.length - 1; j++) {
                    arrt[j] = arrt[j + 1];
                }
                n--;
                arrt = Arrays.copyOf(arrt, arrt.length - 1);
                kt = 1;
                break;
            } else
                kt = 0;
        }

        if (kt == 0) {
            System.out.println("Khong tim thay Ma_The!");
        } else
            System.out.println("Xoa thanh cong!");
    }

    public void timkiemthe() {
        int kt = 1;
        System.out.print("\nNhap vao Ma_TheThuVien can tim: ");
        String timthe = sc.nextLine();
        for (int i = 0; i < arrt.length; i++) {
            if (arrt[i].getSoThe().equalsIgnoreCase(timthe)) {
                arrt[i].Xuat();
                kt = 1;
                break;
            } else
                kt = 0;
        }

        if (kt == 0) {
            System.out.println("Khong tim thay Ma_The!");
        }
    }

    public void NhapDanhSachTheThuVien(TheThuVien the) {
        if (n == 0) {
            arrt = new TheThuVien[1];
            arrt[n] = the;
            n++;
        } else {
            arrt = Arrays.copyOf(arrt, n + 1);
            arrt[n] = the;
            n++;
        }
    }

    public void QuanLyTheThuVien() {
        int chon;
        do {
            System.out.println("\n\n============== QUAN LI THE THU VIEN ==============\n");
            System.out.println("\t1. Them the thu vien");
            System.out.println("\t2. Xoa the thu vien");
            System.out.println("\t3. Tim kiem thu vien");
            System.out.println("\t4. Xem danh sach the thu vien");
            System.out.println("\t0. Thoat");
            System.out.println("\n==================================================");
            System.out.print("Your choosen: ");
            chon = check.KiemTraNhapSoNguyen();
            switch (chon) {
                case 0:
                    break;
                case 1:
                    nhapthemthe();
                    break;
                case 2:
                    xoathe();
                    break;
                case 3:
                    timkiemthe();
                    break;
                case 4:
                    xuatds();
                    break;
                default:
                    System.out.println("Nhap vao khong hop le!");
                    break;
            }
        } while (chon != 0);
    }
}
