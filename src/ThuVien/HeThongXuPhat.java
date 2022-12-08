package ThuVien;

import java.util.Scanner;

public abstract class HeThongXuPhat {

    public double xuphat = 100;
    public double xuphat2 = 500;

    Scanner sc = new Scanner(System.in);

    public HeThongXuPhat() {
    }

    public abstract void hanhchinh();

    public abstract void hanhchinh2();

    public double getXuphat() {
        return xuphat;
    }

    public double getXuphat2() {
        return xuphat2;
    }

}