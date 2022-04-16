package BAI2;

import java.util.ArrayList;
import java.util.Scanner;

public class BAI2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BAI2 b2 = new BAI2();
        b2.nhap();
        b2.xuat();

        b2.hangNokia();
    }
    ArrayList<SanPham> list = new ArrayList<SanPham>();
    SanPham sp = new SanPham();

    public void nhap() {
        String ten, hang, stop = "y";
        double gia;

        do {

            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập tên: ");
            ten = sc.nextLine();
            sc = new Scanner(System.in);
            System.out.print("Nhập gia: ");
            gia = sc.nextDouble();
            sc = new Scanner(System.in);
            System.out.print("Nhập hãng: ");
            hang = sc.nextLine();
            sp = new SanPham(ten, gia, hang);
            list.add(sp);
            sc = new Scanner(System.in);
            System.out.println("chọn y/n để tiếp tục : ");
            stop = sc.next();
            if (stop.equalsIgnoreCase("n")) {
                System.out.println("Nhập dữ liệu thành công");
                break;
            }

        } while (true);

    }

    public void xuat() {
        System.out.println("\tXuất danh sach sản phẩm");
        System.out.printf("%-10s %-20s %-20s %s\n", "STT", "Tên", "Giá", "Hãng");
        int i = 0;
        for (SanPham item : list) {
            System.out.printf("%-10d %-20s %-20.1f %s\n", i, item.getTenSp(), item.getGia(), item.getHang());
            i++;

        }
    }

    public void hangNokia() {
        System.out.println("Cac San Pham co hang la Nokia");
        int i = 1;
        for (SanPham item : list) {
            if (item.getHang().equals("Nokia")) {
                System.out.printf("%-5d %-20s %-20.1f %s\n", i, item.getTenSp(), item.getGia(), item.getHang());
                i++;
                break;

            }else{
                System.out.println("Khong tim thay");
                break;
            }

        }

    }

}
