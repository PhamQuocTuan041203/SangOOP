package ThuVien;

import java.util.Scanner;
import java.util.Arrays;

public class BookList {

    private int n;
    private Sach[] DanhSachSach;

    private final Scanner sc = new Scanner(System.in);
    private final CheckLoi check = new CheckLoi();

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
        System.out.println("========== DANH SACH CAC SACH ==========");
        for (int i = 0; i < DanhSachSach.length; i++) {
            DanhSachSach[i].Xuat();
            System.out.println("==================================================");
        }
    }

    public void xuatdssgk() {
        System.out.println("=============== DANH SACH CAC SACH ===============");
        for (int i = 0; i < DanhSachSach.length; i++) {
            if (DanhSachSach[i] instanceof SachGiaoKhoa) {
                DanhSachSach[i].Xuat();
                System.out.println("==================================================");
            }
        }
    }

    public void xuatdssvn() {
        System.out.println("=============== DANH SACH CAC SACH ===============");
        for (int i = 0; i < DanhSachSach.length; i++) {
            if (DanhSachSach[i] instanceof SachVietNam) {
                DanhSachSach[i].Xuat();
                System.out.println("==================================================");
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
        System.out.println("Nhap ma sach can xoa: ");
        String xoas = sc.nextLine();
        for (int i = 0; i < DanhSachSach.length; i++) {
            if (DanhSachSach[i].getMaSach().equalsIgnoreCase(xoas)) {
                for (int j = i; j < DanhSachSach.length - 1; j++) {
                    DanhSachSach[j] = DanhSachSach[j + 1];
                }
                n--;
                DanhSachSach = Arrays.copyOf(DanhSachSach, DanhSachSach.length - 1);
            }
        }
    }

    public void timkiemsach() {
        System.out.println("Nhap vao sach can tim: ");
        String tims = sc.nextLine();
        for (int i = 0; i < DanhSachSach.length; i++) {
            if (DanhSachSach[i].getMaSach().equalsIgnoreCase(tims)) {
                DanhSachSach[i].Xuat();
            }
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
            System.out.println("\n\n================= DANH SACH SACH =================");
            System.out.println("1. Sach Viet Nam");
            System.out.println("2. Sach Giao Khoa");
            System.out.println("3. Sach tuy thich");
            System.out.println("0. Thoat");
            System.out.println("==================================================");
            System.out.println("Nhap vao sach ban muon them: ");
            chon = check.KiemTraNhapSoNguyen();
            switch (chon) {
                case 0:
                    break;
                case 1:
                    sach = new SachVietNam();
                    sach.Nhap();
                    break;
                case 2:
                    sach = new SachGiaoKhoa();
                    sach.Nhap();
                    break;
                case 3:
                    sach = new Sach();
                    sach.Nhap();
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
            System.out.println("=================== Danh Sach Sach ===================");
            System.out.println("1. Them sach moi");
            System.out.println("2. Xoa sach");
            System.out.println("3. Tim kiem sach");
            System.out.println("4. Xem danh sach sach Viet Nam");
            System.out.println("5. Xem danh sach sach giao khoa");
            System.out.println("6. Xem danh sach tong hop");
            System.out.println("0. Tro ve");
            System.out.println("===========================================================");
            System.out.println("Nhap lua chon cua ban: ");
            chon = check.KiemTraNhapSoNguyen();
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