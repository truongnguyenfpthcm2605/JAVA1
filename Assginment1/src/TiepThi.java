
public class TiepThi extends NhanVien{
     private  double doanhSo;
     private  double hueHong;

    public TiepThi(String maNV, String hoVaTen, double luong, double doanhSo, double hueHong) {
        super(maNV, hoVaTen, luong);
        this.doanhSo = doanhSo;
        this.hueHong= hueHong;
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHueHong() {
        return hueHong;
    }

    public void setHueHong(double hueHong) {
        this.hueHong = hueHong;
    }
     @Override
    public double getThuNhap(){
        double thuNhap = getLuong()+ doanhSo+ hueHong;
        return thuNhap;
    }
    




    
}
