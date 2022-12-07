/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThuVien;

/**
 *
 * @author BEAN
 */
public class SachVietNam extends Sach{
    public SachVietNam()
    {
        
    }
    public SachVietNam(String maSach, String tenSach, String tenTacGia, String nhaXB, String tinhtrang)
    {
         super(maSach,tenSach,tenTacGia,nhaXB,tinhtrang);
         setTheloai();
    }
    @Override
    public void Nhap()
    {
        super.Nhap();
        setTheloai();
    }
    @Override
    public void setTheloai()
    {
        theloai="Sach Viet Nam";
        
    }
    @Override
     public void Xuat(){
        System.out.printf("[%-15s][%-25s][%-20s][%-15s][%-15s][%-15s]\n","Ma sach","Ten sach","Tac gia","Nha xuat ban","Tinh trang sach","The loai");
        System.out.printf("[%-15s][%-25s][%-20s][%-15s][%-15s][%-15s]\n",this.maSach,this.tenSach,this.tenTacGia,this.nhaXB,this.tinhtrang,this.theloai);
        
     }
     
    @Override
    public String toString() {
        return super.toString() + ", theloai: " + this.theloai;
    }
}
