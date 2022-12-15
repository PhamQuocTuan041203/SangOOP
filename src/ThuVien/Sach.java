package ThuVien;

import java.util.Scanner;

public class Sach {

    protected String maSach;
    protected String tenSach;
    protected String tenTacGia;
    protected String nhaXB;
    protected String tinhtrang;
    protected String theloai;

    Scanner sc = new Scanner(System.in);

    public Sach() {
    }

    public Sach(String maSach, String tenSach, String tenTacGia, String nhaXB, String tinhtrang) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tenTacGia = tenTacGia;
        this.nhaXB = nhaXB;
        this.tinhtrang = tinhtrang;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String ms) {
        this.maSach = ms;
    }

    public void setMaSach() {
        System.out.print("Nhap vao ma sach: ");
        maSach = sc.nextLine();
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String ts) {
        this.tenSach = ts;
    }

    public void setTenSach() {
        System.out.print("Nhap vao ten sach: ");
        tenSach = sc.nextLine();
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String ttg) {
        this.tenTacGia = ttg;
    }

    public void setTenTacGia() {
        System.out.print("Nhap vao ten tac gia: ");
        tenTacGia = sc.nextLine();
    }

    public String getNhaXB() {
        return nhaXB;
    }

    public void setNhaXB(String nxb) {
        this.nhaXB = nxb;
    }

    public void setNhaXB() {
        System.out.print("Nhap vao nha xuat ban: ");
        nhaXB = sc.nextLine();
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public void setTinhtrang() {
        System.out.print("Tinh trang sach: ");
        tinhtrang = sc.nextLine();
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai() {
        System.out.print("The loai gi: ");
        theloai = sc.nextLine();
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public void Nhap() {
        System.out.println();
        setMaSach();
        setTenSach();
        setTenTacGia();
        setNhaXB();
        setTinhtrang();
        setTheloai();
    }

    public void sua() {
        System.out.println("Sua thong tin sach theo ma sach: ");
        Sach s = new Sach();
        s.Nhap();
    }

    public void Xuat() {
        System.out.printf("[%-15s][%-25s][%-20s][%-15s][%-15s][%-15s]\n", this.maSach, this.tenSach, this.tenTacGia,
                this.nhaXB, this.tinhtrang, this.theloai);
    }

}