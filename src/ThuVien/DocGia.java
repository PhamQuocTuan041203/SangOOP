/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThuVien;

import java.util.Scanner;
public class DocGia extends ConNguoi{
    protected String MaDocGia;
    Scanner sc = new Scanner(System.in);
    public DocGia()
    {
        super();
        MaDocGia=null;
    }
    public DocGia(String MaDocGia,String hoten, String ngaysinh,String email, String dc, String dienthoai,String gioitinh)
    {
        super(hoten,ngaysinh,email,dc,dienthoai,gioitinh);
        this.MaDocGia=MaDocGia;
    }

    public String getMaDocGia() {
        return MaDocGia;
    }

    public void setMaDocGia(String MaDocGia) {
        this.MaDocGia = MaDocGia;
    }
    @Override
    public void Nhap()
    {
        
        System.out.println("Nhap vao ma doc gia:");
        MaDocGia=sc.nextLine();
        super.Nhap();
    }
    @Override 
    public void Xuat()
    {
        System.out.printf("%-15s%-15s%-20s%-20s%-20s%-20s%-20s\n","Ma doc gia","Ho ten", "Ngay sinh" ,"Email", "Dien thoai" ,"Dia chi","Gioi tinh" );
        System.out.printf("%-15s%-15s%-20s%-20s%-20s%-20s%-20s\n",this.MaDocGia,this.hoten , this.ngaysinh ,this.email, this.dienthoai , this.dc,this.gioitinh );
    }
 
 
}
