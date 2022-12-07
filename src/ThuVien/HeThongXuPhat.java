/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThuVien;

import java.util.Scanner;
public abstract class HeThongXuPhat {
    public double xuphat=100000;
    public double xuphat2=500000;
   Scanner sc = new Scanner (System.in);
   public HeThongXuPhat()
   {
       
   }
   public abstract void hanhchinh();
   public abstract void hanhchinh2();
   public  double getXuphat()
   {
       return xuphat;
   }
   public double getXuphat2()
   {
       return xuphat2;
   }

}
