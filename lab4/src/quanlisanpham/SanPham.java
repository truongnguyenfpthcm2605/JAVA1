package quanlisanpham;

import java.util.Scanner;

public class SanPham {

    private String ten;
    private double gia;
    private double giamGia;
    
    
    public SanPham(){ 
        
    }

    public SanPham(String ten, double gia, double giaGiam) {
        this.ten = ten;
        this.gia = gia;
        this.giamGia = giaGiam;
    }

    public SanPham(String ten, double gia) {
        this.ten = ten;
        this.gia = gia;

    }

    public String getTen() {
        return ten;
    }

    public double getGia() {
        return gia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    private double getThueNhapKhau() {
        return this.gia * 0.1;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập vào tên sản phẩm : ");
        this.ten = sc.nextLine();
        System.out.printf("Nhập vào giá sản phẩm : ");
        this.gia = sc.nextDouble();
        System.out.printf("Nhập vào giảm giá : ");
        this.giamGia = sc.nextDouble();

    }

    public void xuat() {
        System.out.printf("Tên sản phẩm: %s \nGia Sản phẩm : %.1f \nGiam Giá : %.1f\nThuế Nhập Khẩu: %.1f\n ", this.ten, this.gia, this.giamGia, getThueNhapKhau());
    }

}
