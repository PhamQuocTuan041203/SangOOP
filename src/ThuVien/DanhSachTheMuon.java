package ThuVien;

import java.util.Arrays;

public class DanhSachTheMuon {

    private int n;
    private themuon[] DanhSachTheMuon;

    public DanhSachTheMuon() {
        DanhSachTheMuon = null;
        n = 0;
    }

    public DanhSachTheMuon(int n, themuon[] DanhSachTheMuon) {
        this.n = n;
        this.DanhSachTheMuon = DanhSachTheMuon;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public themuon[] getDanhSachTheMuon() {
        return DanhSachTheMuon;
    }

    public void setDanhSachTheMuon(themuon[] DanhSachTheMuon) {
        this.DanhSachTheMuon = DanhSachTheMuon;
    }

    public void NhapDanhSach(themuon the) {
        if (n == 0) {
            DanhSachTheMuon = new themuon[1];
            DanhSachTheMuon[n] = the;
            n++;
        } else {
            DanhSachTheMuon = Arrays.copyOf(DanhSachTheMuon, n + 1);
            DanhSachTheMuon[n] = the;
            n++;
        }
    }

    public void xuatthemuon() {
        System.out.println("\n\n\t==================== DANH SACH CAC THE MUON ====================\n");
        System.out.printf("[%-15s][%-25s][%-20s][%-15s][%-15s]\n", "Ma muon", "Ma khach hang", "Ma sach", "Ngay muon",
                "Hen tra");
        System.out.println();

        for (int i = 0; i < n; i++) {
            DanhSachTheMuon[i].Xuat();
        }
    }

    public themuon GetTheMuon(int i) {
        return DanhSachTheMuon[i];
    }

}