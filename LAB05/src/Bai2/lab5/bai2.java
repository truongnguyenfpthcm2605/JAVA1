package Bai2.lab5;

import java.util.Scanner;

public class bai2 {

    public static void main(String[] args) {
        bai2 b2 = new bai2();
        b2.menu();
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        DanhSach ds = new DanhSach();
        int choose;
        String ten;
        do {
            System.out.println(">>>>>>>>>>>>>>>>>Menu Bai2 lab5 >>>>>>>>>>>>>>>>");
            System.out.println("\t1.Nhập danh sách họ và tên.");
            System.out.println("\t2.Xuất danh sách vừa nhập.");
            System.out.println("\t3.Xuất danh sách ngẫu nhiên.");
            System.out.println("\t4.Sắp Xếp giảm dần và xuất danh sách.");
            System.out.println("\t5.Tìm và xóa  tên nhập từ bàn phím.");
            System.out.println("\t0. Thoát.");
            System.out.print("Chọn chức năng từ 0-5: ");
            choose = sc.nextInt();

            switch (choose) {
                case 0:
                    System.out.println("Thoát .");
                    System.exit(0);
                case 1:
                    System.out.println("Nhập danh sách .");
                    ds.nhap();
                    break;
                case 2:
                    System.out.println("Xuất danh sách .");
                    ds.xuat();
                    break;
                case 3:
                    System.out.println("Xuất danh sách ngẫu nhiên. ");
                    ds.Randomlist();
                    break;
                case 4:
                    System.out.println("Sắp Xếp giảm dần và xuất danh sách.");
                    ds.SapXepGiam();
                    break;
                case 5:
                    System.out.println("Tìm và xóa  tên nhập từ bàn phím");
                    sc = new Scanner(System.in);
                    System.out.print("Nhập tên cần xóa: ");
                    ten= sc.next();
                    ds.Delete(ten);
                    break;

            }

        } while (true);
    }
}
