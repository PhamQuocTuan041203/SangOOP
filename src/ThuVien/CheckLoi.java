package ThuVien;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class CheckLoi {

    Scanner scanner = new Scanner(System.in);

    public String KiemTraNhapChuoi() {
        String DauVao;
        while (true) {
            DauVao = scanner.nextLine();
            DauVao = DauVao.trim();
            if (DauVao != null) {
                return DauVao;
            } else {
                System.out.print("Khong duoc bo trong!! Moi nhap lai: ");
            }
        }
    }

    public boolean CheckNgayTra1(String HanTra, String NgayTra) {
        String[] ChuoiHanTra = HanTra.split("/");
        String[] ChuoiNgayTra = NgayTra.split("/");
        int NamHanTra = Integer.parseInt(ChuoiHanTra[2]);
        int NamNgayTra = Integer.parseInt(ChuoiNgayTra[2]);
        if (NamHanTra < NamNgayTra)
            return false;
        int ThangHanTra = Integer.parseInt(ChuoiHanTra[1]);
        int ThangNgayTra = Integer.parseInt(ChuoiNgayTra[1]);
        if (ThangHanTra < ThangNgayTra)
            return false;
        int NgayHanTra = Integer.parseInt(ChuoiHanTra[0]);
        int NgayNgayTra = Integer.parseInt(ChuoiNgayTra[0]);
        if (NgayHanTra < NgayNgayTra)
            return false;
        return true;
    }

    public String KiemTraNhapMaDocGia() {
        String DauVao;

        while (true) {
            DauVao = scanner.nextLine();
            DauVao = DauVao.toUpperCase();
            if (DauVao.matches("DG" + "[0-9]{1,2}")) {
                return DauVao;
            } else {
                System.out.println("Dinh dang ma doc gia: DG_. Ví dụ: DG01");
            }
        }
    }

    public String KiemTraNhapTen() {
        String DauVao;
        
        while (true) {
            DauVao = scanner.nextLine();
            if (DauVao.matches("[\\pL\\pMn*\\s*]+")) {
                DauVao = DauVao.trim();
                DauVao = DauVao.replaceAll("\\s+", " ");
                DauVao = DauVao.toLowerCase();
                String[] Chuoi = DauVao.split(" ");
                DauVao = "";
                for (int i = 0; i < Chuoi.length; i++) {
                    DauVao += String.valueOf(Chuoi[i].charAt(0)).toUpperCase() + Chuoi[i].substring(1);
                    if (i < Chuoi.length - 1) {
                        DauVao += " ";
                    }
                }
                return DauVao;
            } else {
                System.out.print("Nhap ten khong hop le! Moi nhap lai: ");
            }
        }
    }

    public int KiemTraNhapSoNguyen() {
        int DauVao;
        while (true) {
            try {
                DauVao = Integer.parseInt(scanner.nextLine());
                return DauVao;
            } catch (NumberFormatException exception) {
                System.out.print("Sai kiểu dữ liệu ! Nhập lại: ");
            }
        }
    }

    public int KiemTraNhapSoNguyenDuong() {
        int DauVao;
        while (true) {
            DauVao = KiemTraNhapSoNguyen();
            if (DauVao > 0) {
                return DauVao;
            } else {
                System.out.print("Số nhập vào không được nh�? hơn 0 ! M�?i nhập lại: ");
            }
        }
    }

    public boolean LaSoNguyenTo(int DauVao) {
        for (int i = 2; i <= sqrt(DauVao); i++) {
            if (DauVao % i == 0) {
                return false;
            }
        }
        return true;
    }

    public String TiepTuc() {
        String DauVao;
        String DinhDang = "[n|y]";
        while (true) {
            DauVao = scanner.nextLine();
            DauVao = DauVao.toLowerCase();
            if (DauVao.matches(DinhDang)) {
                return DauVao;
            } else {
                System.out.print("Sai dinh dang ! Moi nhap lai: ");
            }
        }
    }
}
