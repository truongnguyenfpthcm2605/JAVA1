
import java.util.Scanner;

public class SanPhamDemo {

    public String ten;
    public double gia;
    public double giamGia;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ten : ");
        ten = sc.nextLine();
        System.out.print("Nhap vao gia: ");
        gia = sc.nextDouble();
        System.out.print("Nhap vao giam gia: ");
        giamGia = sc.nextDouble();

    }

    public void xuat() {
        System.out.printf("ten : %s\nGia : %.1f\nGiam gia: %.1f\nThue Nhap Khau: %.1f\n", ten, gia , giamGia , thueNhapKhau());
    }
    private double thueNhapKhau(){
        return gia*0.1;
    }
}
