
import java.util.Scanner;

public class NhanVien {

    public String maSo;
    public String hoTen;
    public double heSo;

    public NhanVien(String maSo, String hoTen, double heSo) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.heSo = heSo;
    }

    public NhanVien() {
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getHeSo() {
        return heSo;
    }

    public void setHeSo(double heSo) {
        this.heSo = heSo;
    }

    public void nhap() {
       
        Scanner sc = new Scanner(System.in);

        do {
            try {
                System.out.print("Nhap ma so: ");
                setMaSo(sc.nextLine());
                System.out.print("Nhap ho ten: ");
                setHoTen(sc.nextLine());
                System.out.print("Nhap he so :");
                setHeSo(sc.nextDouble());
            } catch (Exception e) {
                System.out.println("loi nhap sai dinh dang du lieu, nhap lai (y/n)");
               break;
            }
            break;

        } while (true);
    }

    public void xuat() {
        System.out.printf("%-20s %-20s %.1f\n", getMaSo(), getHoTen(), getHeSo());
    }

}
