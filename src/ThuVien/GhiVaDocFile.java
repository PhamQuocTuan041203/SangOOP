package ThuVien;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class GhiVaDocFile implements Filee {

	@Override
	public void GhiDanhSachTheMuon(themuon The) {
		try {
			File file = new File("D://DanhSachTheMuon.txt");
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			pw.println(The.maMuon + ";" + The.maKhach + ";" + The.maSach + ";" + The.ngayMuon + ";" + The.hanTra);
			pw.close();
		} catch (IOException ioe) {
			System.out.println("Exception occurred:");
			ioe.printStackTrace();
		}
	}

	@Override
	public void GhiDanhSachTheThuVien(TheThuVien the) {
		try {
			File file = new File("D://DanhSachTheThuVien.txt");
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			pw.println(the.MaDocGia + ";" + the.hoten + ";" + the.ngaysinh + ";" + the.email + ";" + the.dc + ";"
					+ the.dienthoai + ";" + the.gioitinh + ";" + the.SoThe + ";" + the.ngaybatdau + ";"
					+ the.ngayketthuc);
			pw.close();
		} catch (IOException ioe) {
			System.out.println("Exception occurred:");
			ioe.printStackTrace();
		}
	}

	@Override
	public void GhiDanhSachNhanVien(NhanVien nv) {
		try {
			File file = new File("D://DanhSachNhanVien.txt");
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			pw.println(nv.MaNV + ";" + nv.hoten + ";" + nv.luongcb + ";" + nv.hesoluong + ";");
			pw.close();
		} catch (IOException ioe) {
			System.out.println("Exception occurred:");
			ioe.printStackTrace();
		}
	}

	@Override
	public void GhiDanhSachSach(Sach s) {
		try {
			File file = new File("D://DanhSachSach.txt");
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			pw.println(s.maSach + ";" + s.tenSach + ";" + s.tenTacGia + ";" + s.nhaXB + ";" + s.tinhtrang + ";"
					+ s.theloai + ";");
			pw.close();
		} catch (IOException ioe) {
			System.out.println("Exception occurred:");
			ioe.printStackTrace();
		}
	}

	@Override
	public void GhiDanhSachSGK(Sach s) {
		try {
			File file = new File("D://DanhSachSGK.txt");
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			pw.println(s.maSach + ";" + s.tenSach + ";" + s.tenTacGia + ";" + s.nhaXB + ";" + s.tinhtrang + ";"
					+ s.theloai + ";");
			pw.close();
		} catch (IOException ioe) {
			System.out.println("Exception occurred:");
			ioe.printStackTrace();
		}
	}

	@Override
	public void GhiDanhSachSachVietNam(Sach s) {
		try {
			File file = new File("D://DanhSachSachVietNam.txt");
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			pw.println(s.maSach + ";" + s.tenSach + ";" + s.tenTacGia + ";" + s.nhaXB + ";" + s.tinhtrang + ";"
					+ s.theloai + ";");
			pw.close();
		} catch (IOException ioe) {
			System.out.println("Exception occurred:");
			ioe.printStackTrace();
		}
	}

	@Override
	public void DocDanhSachSach(BookList sach) {
		try {
			FileReader fr = new FileReader("D://DanhSachSach.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			while (true) {
				line = br.readLine();
				if (line == null)
					break;
				String[] strArray = line.split(";");
				Sach s = new Sach();
				s.setMaSach(strArray[0]);
				s.setTenSach(strArray[1]);
				s.setTenTacGia(strArray[2]);
				s.setNhaXB(strArray[3]);
				s.setTinhtrang(strArray[4]);
				s.setTheloai(strArray[5]);
				sach.NhapDanhSach(s);
			}
			fr.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void DocDanhSachSGK(BookList sgk) {
		try {
			FileReader fr = new FileReader("D:\\DanhSachSGK.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			while (true) {
				line = br.readLine();
				if (line == null)
					break;
				String[] strArray = line.split(";");
				SachGiaoKhoa s1 = new SachGiaoKhoa();
				s1.setMaSach(strArray[0]);
				s1.setTenSach(strArray[1]);
				s1.setTenTacGia(strArray[2]);
				s1.setNhaXB(strArray[3]);
				s1.setTinhtrang(strArray[4]);
				s1.setTheloai(strArray[5]);
				sgk.NhapDanhSach(s1);
			}
			fr.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void DocDanhSachVietNam(BookList vn) {
		try {
			FileReader fr = new FileReader("D://DanhSachSachVietNam.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			while (true) {
				line = br.readLine();
				if (line == null)
					break;
				String[] strArray = line.split(";");
				SachVietNam s2 = new SachVietNam();
				s2.setMaSach(strArray[0]);
				s2.setTenSach(strArray[1]);
				s2.setTenTacGia(strArray[2]);
				s2.setNhaXB(strArray[3]);
				s2.setTinhtrang(strArray[4]);
				s2.setTheloai(strArray[5]);
				vn.NhapDanhSach(s2);
			}
			fr.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void DocDanhSachTheThuVien(DanhSachTheThuVien the) {
		try {
			FileReader fr = new FileReader("D://DanhSachTheThuVien.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			while (true) {
				line = br.readLine();
				if (line == null)
					break;
				String[] strArray = line.split(";");
				TheThuVien t = new TheThuVien();
				t.setMaDocGia(strArray[0]);
				t.setHoten(strArray[1]);
				t.setNgaysinh(strArray[2]);
				t.setEmail(strArray[3]);
				t.setDc(strArray[4]);
				t.setDienthoai(strArray[5]);
				t.setGioiinh(strArray[6]);
				t.setSoThe(strArray[7]);
				t.setNgaybatdau(strArray[8]);
				t.setNgayketthuc(strArray[9]);
				the.NhapDanhSachTheThuVien(t);
			}
			fr.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void DocDanhSachTheMuon(DanhSachTheMuon tm) {
		try {
			FileReader fr = new FileReader("D://DanhSachTheMuon.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			while (true) {
				line = br.readLine();
				if (line == null)
					break;
				String[] strArray = line.split(";");
				themuon t2 = new themuon();
				t2.setMaMuon(strArray[0]);
				t2.setMaKhach(strArray[1]);
				t2.setMaSach(strArray[2]);
				t2.setNgayMuon(strArray[3]);
				t2.setHanTra(strArray[4]);
				tm.NhapDanhSach(t2);
			}
			fr.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void DocDanhSachNhanVien(DanhSachNhanVien nv) {
		try {
			FileReader fr = new FileReader("D:\\DanhSachNhanVien.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;

			while (true) {
				line = br.readLine();
				if (line == null)
					break;
				String[] strArray = line.split(";");
				NhanVien nv1 = new NhanVien();
				nv1.setMaNV(strArray[0]);
				nv1.setHoten(strArray[1]);
				nv1.setLuongcb(Integer.parseInt(strArray[2]));
				nv1.setHesoluong(Integer.parseInt(strArray[3]));
				nv.NhapDanhSachNhanVien(nv1);
			}
			fr.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}