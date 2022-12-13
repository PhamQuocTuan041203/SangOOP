package ThuVien;

public interface File {

    public void DocDanhSachSach(BookList sach);

    public void DocDanhSachSGK(BookList sgk);

    public void DocDanhSachVietNam(BookList vn);

    public void DocDanhSachTheThuVien(DanhSachTheThuVien the);

    public void DocDanhSachTheMuon(DanhSachTheMuon tm);

    public void DocDanhSachNhanVien(DanhSachNhanVien nv);

    public void GhiDanhSachNhanVien(DanhSachNhanVien nv);
}