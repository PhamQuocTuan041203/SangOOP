package ThuVien;

import java.util.Scanner;

public class DocGia extends ConNguoi {

    protected String MaDocGia;

    Scanner sc = new Scanner(System.in);

    public DocGia() {
        super();
        MaDocGia = null;
    }

    public DocGia(String MaDocGia, String hoten, String ngaysinh, String email, String dc, String dienthoai,
            String gioitinh) {
        super(hoten, ngaysinh, email, dc, dienthoai, gioitinh);
        this.MaDocGia = MaDocGia;
    }

    public String getMaDocGia() {
        return MaDocGia;
    }

    public void setMaDocGia(String MaDocGia) {
        this.MaDocGia = MaDocGia;
    }

    public void thongTinConNguoi() {
        System.out.print("Nhap vao ma Doc Gia: ");
        MaDocGia = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        this.hoten = inp.nextLine();
        System.out.print("Nhap ngay sinh: ");
        this.ngaysinh = inp.nextLine();
        System.out.print("Nhap email: ");
        this.email = inp.nextLine();
        System.out.print("Nhap dia chi: ");
        dc = inp.nextLine();
        System.out.print("Nhap dien thoai: ");
        this.dienthoai = inp.nextLine();
        System.out.print("Gioi tinh: ");
        this.gioitinh = inp.nextLine();
    }

    @Override
    public void Xuat() {
        System.out.printf("%-15s%-15s%-20s%-20s%-20s%-20s%-20s\n", "Ma doc gia", "Ho ten", "Ngay sinh", "Email",
                "Dien thoai", "Dia chi", "Gioi tinh");
        System.out.printf("%-15s%-15s%-20s%-20s%-20s%-20s%-20s\n", this.MaDocGia, this.hoten, this.ngaysinh, this.email,
                this.dienthoai, this.dc, this.gioitinh);
    }

}