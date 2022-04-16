package Bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyPt {

    ArrayList<PhuongTien> list = new ArrayList<>();

    public void nhap1PhuongTien() {

        Scanner sc = new Scanner(System.in);
        String pick;
        do {
            try {
                PhuongTien pt;
                System.out.print("Ô tô | Xe May | Xe tải (oto,xm,xt): ");
                pick = sc.nextLine();
                sc = new Scanner(System.in);
                System.out.print("Nhâp vai ID:");
                String Id = sc.nextLine();
                sc = new Scanner(System.in);
                System.out.print("Nhập vao Hang San Xuât: ");
                String hangSx = sc.nextLine();
                sc = new Scanner(System.in);
                System.out.print("Nhap vao nam san xuat:");
                int namSx = sc.nextInt();
                sc = new Scanner(System.in);
                System.out.print("Nhap vao gia ban :");
                double giaBan = sc.nextDouble();
                sc = new Scanner(System.in);
                System.out.print("nhap vao mau xe: ");
                String mauXe = sc.nextLine();
                sc = new Scanner(System.in);
                if (pick.equalsIgnoreCase("oto")) {
                    System.out.print("Nhap vao cho ngoi :");
                    int choNgoi = sc.nextInt();
                    sc = new Scanner(System.in);
                    System.out.print("Nhap vao kieu dong co: ");
                    String kieuDc = sc.nextLine();
                    pt = new Oto(Id, hangSx, namSx, giaBan, mauXe, choNgoi, kieuDc);
                } else if (pick.equalsIgnoreCase("xm")) {
                    sc = new Scanner(System.in);
                    System.out.print("Nhap vao cong suat :");
                    double congSuat = sc.nextDouble();
                    pt = new XeMay(Id, hangSx, namSx, giaBan, mauXe, congSuat);
                } else if (pick.equalsIgnoreCase("xt")) {
                    sc = new Scanner(System.in);
                    System.out.print("Nhap vao trong tai :");
                    double trongTai = sc.nextDouble();
                    pt = new XeTai(Id, hangSx, namSx, giaBan, mauXe, trongTai);
                } else {
                    System.out.println("Nhap khong dung nhap lai ");
                    break;
                }

                list.add(pt);
                break;

            } catch (Exception e) {
                System.out.println("Nhập sai dữ kiệu nhập lại");
            }

        } while (true);

    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        String exit = "n";
        do {
            nhap1PhuongTien();
            sc = new Scanner(System.in);
            System.out.print("chon (y/n) de tiep tuc va thoat");
            exit = sc.nextLine();
            if (exit.equalsIgnoreCase("n")) {
                System.out.println("Nhap du lieu thanh cong");
                break;
            }

        } while (true);
    }

    public void xuat() {
        for (PhuongTien pt : list) {
            pt.xuat();
        }

    }

    public void add() {
        Scanner sc = new Scanner(System.in);
        String exit = "n";
        do {
            nhap1PhuongTien();
            sc = new Scanner(System.in);
            System.out.print("ban muon them nua khong (y/n) :");
            exit = sc.nextLine();
            if (exit.equalsIgnoreCase("n")) {
                System.out.println("Nhap du lieu thanh cong");
                break;
            }

        } while (true);
    }

    public void xoaID() {
        Scanner sc = new Scanner(System.in);
        String findId = sc.nextLine();
        boolean check = false;
        for (PhuongTien pt : list) {
            if (findId.equalsIgnoreCase(pt.getId())) {
                list.remove(pt);
                check = true;
                System.out.println("xoa thanh cong");
                break;
            }
        }
        if (check == false) {
            System.out.println("Khong tim thay du lieu can xoa");
        }
    }

    public void findptyears() {
        Scanner sc = new Scanner(System.in);
        int findyears = sc.nextInt();
        boolean check = false;
        for (PhuongTien pt : list) {
            if (findyears==pt.getNamSx()) {
                pt.xuat();
                check = true;
                
                
            }
        }
        if (check == false) {
            System.out.println("Khong tim thay");
        }

    }
    public void Sxgiaban(){
        Comparator<PhuongTien> comp = new Comparator<PhuongTien>() {
            @Override
            public int compare(PhuongTien o1, PhuongTien o2) {
                if(o1.getGiaBan()>o2.getGiaBan()){
                    return 1;
                }
                    return -1;

            }
            
        };
        Collections.sort(list, comp);
        xuat();
    }

    public void menu() {

        String stop = "y";
        int chon;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("____________________Menu Quan Lý Phuong Tiên_________________");
            System.out.println("\t1.Nhập Danh Sách Phuong tiện");
            System.out.println("\t2.Xuất thông tin Phuong Tiên");
            System.out.println("\t3.Thêm phuong tien moi");
            System.out.println("\t4.Xoa Phuong tien theo ID");
            System.out.println("\t5.Tim Phuong tien theo nam san xuat");
            System.out.println("\t6.Sap xep theo gia ban");
            System.out.println("\t0.Thoat");
            System.out.print("chon 0-6 :");
            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();

                    break;
                case 3:

                    break;
                case 4:
                    ;
                    break;
                case 5:
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh thanh cong");
                    System.exit(0);
                default:
                    System.out.println("\tChon chuc năng 1-5.");
            }
        } while (true);
    }

    public static void main(String[] args) {
        QuanLyPt ql = new QuanLyPt();
        ql.menu();
    }
}
