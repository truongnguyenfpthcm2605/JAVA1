
import java.util.Scanner;

public class SanPham {

    private String ten;
    private double luong;

    public SanPham(String ten, double luong) {
        this.ten = ten;
        this.luong = luong;
    }

    public SanPham() {
    }
    

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double gia) {
        this.luong = gia;
    }

    public double VAT() {

        if (getLuong() >= 500) {
            return (getLuong() - 500) * 0.05;

        } else if (getLuong() >= 1000) {
            return (getLuong() - 1000) * 0.1;
        }
        return 0;

    }
    public double Earning(){
        return getLuong()-VAT();
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Nhap ten  :");
            setTen(sc.nextLine());
            System.out.print("Nhap luong: ");
            setLuong(sc.nextDouble());

        } catch (Exception e) {
            System.out.println("Nhap sai dinh dang du lieu");
        }

    }
    public void xuat(){
        System.out.printf("%-20s %-20.1f %-20.1f %.1f\n",getTen(),getLuong(),VAT(),Earning());
    }
}
