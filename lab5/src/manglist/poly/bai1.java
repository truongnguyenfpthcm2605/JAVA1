package manglist.poly;

import java.util.ArrayList;
import java.util.Scanner;

public class bai1 {

    private ArrayList<Double> list = new ArrayList<>();

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        Double x;

        System.out.println("Nhập danh sach :");
        while (true) {

            System.out.print("nhap: ");
            x = sc.nextDouble();
            list.add(x);
            sc.nextLine();
            System.out.println("Bạn có muốn nhập nữa không: (Y/N)");

            if (sc.nextLine().equalsIgnoreCase("n")) {
                break;
            }

        }
    }
    public void xuat(){
        for (Double item : list) {
            System.out.println("Xuất: "+ item);
        }
        System.out.println("Tong : "+ tinhTong());
    }
    private double tinhTong(){
        double tong = 0;
        for (Double item : list) {
            tong+=item;
        }
        return tong;
    }

    public static void main(String[] args) {
        bai1 b1 = new bai1();
        b1.nhap();
        b1.xuat();
    }

}
