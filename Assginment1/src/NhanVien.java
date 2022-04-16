
public class   NhanVien {

    private String maNV;
    private String hoVaTen;
    private double luong;

    public NhanVien(String maNV, String hoVaTen, double luong) {
        this.maNV = maNV;
        this.hoVaTen = hoVaTen;
        this.luong = luong;
    }

    public NhanVien() {
    }
    

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public double getThuNhap() {
        return getLuong() -getThueTN();

    }

    public double getThueTN() {

        if (luong < 9000) {
            return 0;
        } else if (luong >= 9000 && luong <= 15000) {
            return (luong-9000) * 0.1;
        } else {
            return 600 + (luong -15000)*0.12;
           
        }

    }

    public void xuatThongTin() {
        System.out.printf("%-10s %-10s %-10.1f %-10.1f %.1f\n",getMaNV(),getHoVaTen(),getLuong(),getThueTN(),getThuNhap());
    }

}
