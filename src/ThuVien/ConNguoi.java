package ThuVien;

import java.util.Scanner;

public class ConNguoi {

    protected String hoten;
    protected String ngaysinh;
    protected String dienthoai;
    protected String email;
    protected String dc;
    protected String gioitinh;

    Scanner inp = new Scanner(System.in);

    public ConNguoi() {
        hoten = "";
        ngaysinh = "";
        dienthoai = "";
        email = "";
        dc = null;
        gioitinh = null;
    }

    public ConNguoi(String hoten, String ngaysinh, String email, String dc, String dienthoai, String gioitinh) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.dienthoai = dienthoai;
        this.email = email;
        this.dc = dc;
        this.gioitinh = gioitinh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getGioiTinh() {
        return gioitinh;
    }

    public void setGioiinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void Nhap() {
        System.out.println("Nhap ho ten:");
        this.hoten = inp.nextLine();
        System.out.println("Nhap ngay sinh:");
        this.ngaysinh = inp.nextLine();
        System.out.println("Nhap email");
        this.email = inp.nextLine();
        System.out.println("Nhap vao dia chi");
        dc = inp.nextLine();
        System.out.println("Nhap dien thoai:");
        this.dienthoai = inp.nextLine();
        System.out.println("Gioi tinh cua ban la:");
        this.gioitinh = inp.nextLine();
    }

    public void Xuat() {
        System.out.println(this.hoten);
        System.out.println(this.ngaysinh);
        System.out.print(this.email);
        System.out.println(this.dc);
        System.out.println(this.dienthoai);
        System.out.println(this.gioitinh);
    }

}