
package bai2;

public class PhongTro {
    private int soPhong;
    private double soTienThang;
    private double sodien;
    private double soNuoc;

    public PhongTro(int soPhong, double soTienThang, double sodien, double soNuoc) {
        this.soPhong = soPhong;
        this.soTienThang = soTienThang;
        this.sodien = sodien;
        this.soNuoc = soNuoc;
    }

    public PhongTro() {
    }

    public int getSoPhong() {
        return soPhong;
    }

    public void setSoPhong(int soPhong) {
        this.soPhong = soPhong;
    }

    public double getSoTienThang() {
        return soTienThang;
    }

    public void setSoTienThang(double soTienThang) {
        this.soTienThang = soTienThang;
    }

    public double getSodien() {
        return sodien;
    }

    public void setSodien(double sodien) {
        this.sodien = sodien;
    }

    public double getSoNuoc() {
        return soNuoc;
    }

    public void setSoNuoc(double soNuoc) {
        this.soNuoc = soNuoc;
    }
    public double tinThue(){
        return getSoTienThang()+getSodien()*3000+getSoNuoc()*15000;
    }
    public void xuat(){
        System.out.printf("%-10d %-20.1f %-20.1f %-20.1f %.1f\n",getSoPhong(),getSoTienThang(),getSodien(),getSoNuoc(),tinThue());
        }
    
 
    
}
