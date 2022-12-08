/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThuVien;

import java.util.Scanner;
public class themuon {

    protected String maMuon;
    protected String maKhach;
    protected String maSach;
    protected String ngayMuon;
    protected String hanTra;
    Scanner sc=new Scanner(System.in);
    public themuon() {
        
    }
    
    public themuon(String maMuon, String maKhach, String maSach, String ngayMuon, String hanTra) {
        this.maMuon = maMuon;
        this.maKhach = maKhach;
        this.maSach = maSach;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
    }
    
    public String getMaMuon() {
        return maMuon;
    }
    public void setMaMuon(String mm) {
        this.maMuon = mm;
    }
    public void setMaMuon()
    {
        System.out.println("Nhap the muon: ");
        maMuon=sc.nextLine();
    }
    
    public String getMaKhach() {
        return maKhach;
    }
    public void setMaKhach(String mm) {
        this.maKhach = mm;
    }
    
    public String getMaSach() {
        return maSach;
    }
    public void setMaSach(String mm) {
        this.maSach = mm;
    }
    public void setMaSach()
    {
        
    }
    
    public String getNgayMuon() {
        return ngayMuon;
    }
    public void setNgayMuon(String nm) {
        this.ngayMuon = nm;
    }
    public void setNgayMuon()
    {
        System.out.println("Ngay muon: ");
        ngayMuon=sc.nextLine();
    }
    public String getHanTra() {
        return hanTra;
    }
    public void setHanTra(String ht) {
        this.hanTra = ht;
    }
    public void setHanTra()
    {
        System.out.println("Ngay tra: ");
        hanTra=sc.nextLine();
    }
    
    public void Nhap(){
        System.out.println("Nhap ma muon: ");
        maMuon=sc.nextLine();
        System.out.println("Nhap ma khach hang: ");
        maKhach=sc.nextLine();
        System.out.println("Nhap ma sach: ");
        maMuon=sc.nextLine();
        System.out.println("Nhap ngay muon(dd/mm/yyyy): ");
        ngayMuon=sc.nextLine();
        System.out.println("Nhap ngay tra(dd/mm/yyyy): ");
        hanTra=sc.nextLine();
    }
    
    
    public void Xuat(){
        System.out.printf("[%-15s][%-25s][%-20s][%-15s][%-15s]\n","Ma muon", "Ma khach hang", "Ma sach", "Ngay muon", "Hen tra");
        System.out.printf("[%-15s][%-25s][%-20s][%-15s][%-15s]\n",this.maMuon,this.maKhach,this.maSach,this.ngayMuon,this.hanTra);
    }
    
}

