/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThuVien;

import java.util.Scanner;

public class TheThuVien extends DocGia {
    protected String SoThe;
    protected String ngaybatdau;
    protected String ngayketthuc;
    Scanner sc = new Scanner(System.in);

    public TheThuVien() {
        super.getMaDocGia();
        this.SoThe = null;
        this.ngaybatdau = null;
        this.ngayketthuc = null;
    }

    public TheThuVien(String MaDocGia, String hoten, String ngaysinh, String email, String dc, String dienthoai,
            String gioitinh, String SoThe, String ngaybatdau, String ngayketthuc) {
        super(MaDocGia, hoten, ngaysinh, email, dc, dienthoai, gioitinh);
        this.SoThe = SoThe;
        this.ngaybatdau = ngaybatdau;
        this.ngayketthuc = ngayketthuc;
    }

    public String getSoThe() {
        return SoThe;
    }

    public void setSoThe(String SoThe) {
        this.SoThe = SoThe;
    }

    public String getNgaybatdau() {
        return ngaybatdau;
    }

    public void setNgaybatdau(String ngaybatdau) {
        this.ngaybatdau = ngaybatdau;
    }

    public String getNgayketthuc() {
        return ngayketthuc;
    }

    public void setNgayketthuc(String ngayketthuc) {
        this.ngayketthuc = ngayketthuc;
    }

    @Override
    public void thongTinConNguoi() {
        super.thongTinConNguoi();
        System.out.print("Nhap vao so the: ");
        SoThe = sc.nextLine();
        System.out.print("Ngay nhan the: ");
        ngaybatdau = sc.nextLine();
        System.out.print("Ngay the het han: ");
        ngayketthuc = sc.nextLine();
    }

    @Override
    public void Xuat() {
        System.out.printf("[%-10s][%-15s][%-15s][%-25s][%-10s][%-10s][%-10s][%-10s][%-15s][%-15s]\n", this.MaDocGia,
                this.hoten, this.ngaysinh, this.email, this.dc, this.dienthoai, this.gioitinh, this.SoThe,
                this.ngaybatdau, this.ngayketthuc);
    }
}
