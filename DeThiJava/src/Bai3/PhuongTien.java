
package Bai3;

public class PhuongTien {
    private String id;
    private String hangSx;
    private int namSx;
    private double giaBan;
    private String mauXe;

    public PhuongTien(String id, String hangSx, int namSx, double giaBan, String mauXe) {
        this.id = id;
        this.hangSx = hangSx;
        this.namSx = namSx;
        this.giaBan = giaBan;
        this.mauXe = mauXe;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHangSx() {
        return hangSx;
    }

    public void setHangSx(String hangSx) {
        this.hangSx = hangSx;
    }

    public int getNamSx() {
        return namSx;
    }

    public void setNamSx(int namSx) {
        this.namSx = namSx;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public String getMauXe() {
        return mauXe;
    }

    public void setMauXe(String mauXe) {
        this.mauXe = mauXe;
    }
    
    public void xuat(){
        System.out.printf("%-10s %-10s %-10d %-10.1f %s \n",getId(),getHangSx(),getNamSx(),getGiaBan(),getMauXe());
    }
}
