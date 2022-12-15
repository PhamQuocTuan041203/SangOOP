package ThuVien;

public interface Filee {

    public void DocDanhSachSach(BookList sach);

    public void DocDanhSachSGK(BookList sgk);

    public void DocDanhSachVietNam(BookList vn);

    public void DocDanhSachTheThuVien(DanhSachTheThuVien the);

    public void DocDanhSachTheMuon(DanhSachTheMuon tm);

    public void DocDanhSachNhanVien(DanhSachNhanVien nv);

    public void GhiDanhSachNhanVien(NhanVien nv);

    public void GhiDanhSachSach(Sach s);

    public void GhiDanhSachSachVietNam(Sach s);

    public void GhiDanhSachSGK(Sach s);

    public void GhiDanhSachTheThuVien(TheThuVien the);
    
    public void GhiDanhSachTheMuon(themuon The);
}