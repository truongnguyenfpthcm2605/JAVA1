package QuanLyDiem;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyDiemSV {

    BangDiem bd;
    ArrayList<BangDiem> list = new ArrayList<>();

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        String leave = "n";
        do {
            System.out.print("Nhap vao ma sv: ");
            String maSv = sc.nextLine();
            sc = new Scanner(System.in);
            System.out.print("Nhap vao ma MH: ");
            String maMH = sc.nextLine();
            sc = new Scanner(System.in);
            System.out.print("Nhap vao diem: ");
            double diem = sc.nextDouble();
            bd = new BangDiem(maSv, maMH, diem);
            list.add(bd);
            System.out.print("Ban muon nhap tiep hay khong (y/n) :");
            sc = new Scanner(System.in);
            leave = sc.nextLine();
            if (leave.equalsIgnoreCase("n")) {
                System.out.println("Nhâp du lieu thanh cong");
                break;
            }

        } while (true);
    }

    public void xuat() {
        System.out.printf("%-20s %-20s %s\n", "Ma Sv", " MA MH", "Diem");
        for (BangDiem item : list) {
            item.xuat();
        }
    }

    public void findSv() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien muon tim: ");
        String find = sc.nextLine();
        boolean check = false;
        for (BangDiem item : list) {
            if (find.equalsIgnoreCase(item.getMaSV())) {
                item.xuat();
                check = true;
            }
        }
        if (check == false) {
            System.out.println("khong tim thay ");

        }

    }

    public void diemTB() {
        double diemTB = 0;
    
        for (BangDiem item : list) {
            diemTB+=item.getDiem();
        }
        System.out.println("diem trung binh la : "+ diemTB);
    }
}
