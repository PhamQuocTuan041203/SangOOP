package ThuVien;

import java.io.BufferedReader;
import java.io.FileReader;

public class GhiVaDocFile implements File {

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
				NhanVienPT nv1 = new NhanVienPT();
				nv1.setMaNV(strArray[0]);
				nv1.setHoten(strArray[1]);
				nv1.setLuong(Double.parseDouble(strArray[2]));
				nv1.setLuongcb(Integer.parseInt(strArray[3]));
				nv1.setHesoluong(Integer.parseInt(strArray[4]));
				nv.NhapDanhSachNhanVien(nv1);
			}
			fr.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}