package lab7.bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Menu m = new Menu();
        m.menu();

    }

    ArrayList<SinhVienPoly> list = new ArrayList<>();

    public void menu() {

        String stop = "y";
        int chon;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("____________________Menu Quan Lý sinh Vien Poly_________________");
            System.out.println("\t1.Nhập Danh Sách Sinh viên");
            System.out.println("\t2.Xuất thông tin sinh viên");
            System.out.println("\t3.Xuất danh sach sinh vien co học luc giỏi");
            System.out.println("\t4. Sắp xếp sinh Viên theo điêm");
            System.out.println("\t5.Thoát chương trình");
            System.out.print("\tChon chuc năng 1-5: ");
            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();

                    break;
                case 3:
                    hocLucGioi();
                    break;
                case 4:
                    sapXepDiem();
                    break;
                case 5: System.out.println("Thoat chuong trinh thanh cong");
                   System.exit(0);
                default:
                    System.out.println("\tChon chuc năng 1-5.");
            }
        } while (true);
    }

    public void nhap() {
        String leave = "n";

        do {
            SinhVienPoly sv;
            Scanner sc = new Scanner(System.in);
            System.out.println("Ban muốn nhâp sinh vien nganh nao: ");
            System.out.print("Sinh vien IT / Sinh Vien Biz (it-biz) :");
            String nhap = sc.nextLine();
            System.out.print("Nhâp ho va ten :");
            sc = new Scanner(System.in);
            String ten = sc.nextLine();
            if (nhap.equalsIgnoreCase("it")) {

                System.out.print("Nhâp diêm java :");
                sc = new Scanner(System.in);
                double java = sc.nextDouble();
                System.out.print("Nhâp diem html:");
                sc = new Scanner(System.in);
                double html = sc.nextDouble();
                System.out.print("Nhap diem css: ");
                sc = new Scanner(System.in);
                double css = sc.nextDouble();
                sv = new SinhVienIT(java, html, css, ten);
                list.add(sv);

            } else if (nhap.equalsIgnoreCase("biz")) {
                System.out.print("Nhap diem martketing: ");
                sc = new Scanner(System.in);
                double martketing = sc.nextDouble();
                System.out.print("Nhap diem sales: ");
                sc = new Scanner(System.in);
                double sales = sc.nextDouble();
                sv = new SinhVienBiz(ten, martketing, sales);
                list.add(sv);
            } else {
                System.out.println("moi ban chon lai sinh vien: ");
            }

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
        System.out.printf("%-10s %-10s %-10s %s\n","Ho Ten","Nganh","Diem","Hoc Luc");
        for (SinhVienPoly item : list) {
            item.xuat();
        }
    }

    public void hocLucGioi() {
        System.out.println("Sinh vien co hoc luc gioi");
        
        boolean flag =false;
        for (SinhVienPoly item: list) {
            if(item.hocLuc().equalsIgnoreCase("Gioi")){
                item.xuat();
                flag= true;
            }
        }
        if(flag == false){
            System.out.println("Khong co sinh vien hoc luc gioi");
        }
    }
    public void sapXepDiem(){
        System.out.println("Sap xep sinh vien theo diem");
        Comparator<SinhVienPoly> comp = new Comparator<SinhVienPoly>() {
            @Override
            public int compare(SinhVienPoly o1, SinhVienPoly o2) {
                if(o1.getDiem() > o2.getDiem()){
                    return 1;
                }
                return -1;
            }
        };
        Collections.sort(list, comp);
        xuat();
    }

}
