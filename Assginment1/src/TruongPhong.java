
public class TruongPhong extends NhanVien{
    public double trachNhiem;

    public TruongPhong(String maNV, String hoVaTen, double luong, double trachNhiem) {
        super(maNV, hoVaTen, luong);
        this.trachNhiem = trachNhiem;
    }

    public double getTrachNhiem() {
        return this.trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }
    @Override
    public double getThuNhap(){
        return getLuong()+ trachNhiem;
    }

}
