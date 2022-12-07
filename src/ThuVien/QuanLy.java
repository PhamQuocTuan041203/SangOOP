/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThuVien;


public class QuanLy extends NhanVien {
    protected double hesotrachnhiem;
    public QuanLy()
    {
        super();
        hesotrachnhiem=0;
    }
    public QuanLy(String MaNV,String hoten,int luong,int luongcb,int hesoluong,double hesotrachnhiem )
    {
        super(MaNV,hoten,luong,luongcb,hesoluong);
        this.hesotrachnhiem=hesotrachnhiem;
    }

    public double getHesotrachnhiem() {
        return hesotrachnhiem;
    }

    public void setHesotrachnhiem(double hesotrachnhiem) {
        this.hesotrachnhiem = hesotrachnhiem;
    }
    @Override 
    public void nhap()
    {
        super.nhap();
        System.out.println("He so trach nhiem:");
        hesotrachnhiem=sc.nextDouble();
    }
    @Override  
         public void Xuat()
    {
        System.out.printf("%-15s%-15s%-20s%-20s%-20s%-20s\n","Ma nhan vien", "Ho ten" , "Luong co ban" ,"He so luong","He so trach nhiem" , "Luong chinh thuc");
        System.out.printf("%-15s%-20s%-20s%-15s%-15s%-15s\n",this.MaNV , this.hoten , this.luongcb , this.hesoluong,this.hesotrachnhiem , this.luong);
    }    
     @Override
     public double tinhluong()
     {
        this.luong=this.luongcb*this.hesotrachnhiem;
        return this.luong;
     }
   }

