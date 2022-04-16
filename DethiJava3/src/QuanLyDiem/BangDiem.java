package QuanLyDiem;

import java.util.Scanner;

public class BangDiem {

    private String maSV;
    private String MaMH;
    private double diem;

    public BangDiem(String maSV, String MaMH, double diem) {
        this.maSV = maSV;
        this.MaMH = MaMH;
        this.diem = diem;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getMaMH() {
        return MaMH;
    }

    public void setMaMH(String MaMH) {
        this.MaMH = MaMH;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ma Sv :");
        setMaSV(sc.nextLine());

        System.out.print("Nhap vao ma MH:  ");
        setMaMH(sc.nextLine());
        System.out.print("Nhap vao diem : ");
        setDiem(sc.nextDouble());
    }
    public void xuat(){
        System.out.printf("%-20s %-20s %.1f\n",getMaSV(),getMaMH(),getDiem());
    }

}
