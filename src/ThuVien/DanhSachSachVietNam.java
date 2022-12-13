package ThuVien;

import java.util.Scanner;
import java.util.Arrays;

public class DanhSachSachVietNam {

    private int n;
    private SachVietNam[] arrvn;

    Scanner sc = new Scanner(System.in);

    public DanhSachSachVietNam() {
        arrvn = null;
        n = 0;
    }

    public DanhSachSachVietNam(int n, SachVietNam[] arrvn) {
        this.n = n;
        this.arrvn = arrvn;
    }

    public void nhapds() {
        System.out.println("Nhap vao so luong sach Viet Nam:");
        n = Integer.parseInt(sc.nextLine());
        arrvn = new SachVietNam[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao sach thu :" + (i + 1));
            Sach a = new Sach();
            arrvn[i] = new SachVietNam();
            arrvn[i].Nhap();
        }
    }

    public void xuatds() {
        System.out.println("=============== DANH SACH CAC SACH ===============");
        for (int i = 0; i < arrvn.length; i++) {
            arrvn[i].Xuat();
            System.out.println("==================================================");
        }
    }

    public void nhapthemsach() {
        System.out.println("Nhap them thong tin sach giao khoa: ");
        SachVietNam vn = new SachVietNam();
        vn.Nhap();
        arrvn = Arrays.copyOf(arrvn, arrvn.length + 1);
        arrvn[n] = vn;
        n++;
    }

    public void xoasach() {
        System.out.println("Nhap ma sach can xoa: ");
        String xoas = sc.nextLine();
        for (int i = 0; i < arrvn.length; i++) {
            if (arrvn[i].getMaSach().equalsIgnoreCase(xoas)) {
                for (int j = i; j < arrvn.length - 1; j++) {
                    arrvn[j] = arrvn[j + 1];
                }
                n--;
                arrvn = Arrays.copyOf(arrvn, arrvn.length - 1);
            }
        }
    }

    public void timkiemsach() {
        System.out.println("Nhap vao sach can tim: ");
        String tims = sc.nextLine();
        for (int i = 0; i < arrvn.length; i++) {
            if (arrvn[i].getMaSach().equalsIgnoreCase(tims)) {
                arrvn[i].Xuat();
            }
        }
    }

    public void NhapDanhSachSachVN(SachVietNam vn) {
        if (n == 0) {
            arrvn = new SachVietNam[1];
            arrvn[n] = vn;
            n++;
        } else {
            arrvn = Arrays.copyOf(arrvn, n + 1);
            arrvn[n] = vn;
            n++;
        }
    }

}