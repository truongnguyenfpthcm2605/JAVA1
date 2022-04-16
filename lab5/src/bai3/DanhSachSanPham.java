package bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachSanPham {

    private ArrayList<SanPham> list = new ArrayList<>();

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        String name, a = "y";
        int i = 1;
        double gia;
        System.out.println("Nhập vào danh sách Sản phẩm");
        do {
            System.out.printf("Sản phẩm %d: \n", i);
            System.out.print("Tên Sản Phẩm: ");
            name = sc.nextLine();
            System.out.print("Gia sản phẩm: ");
            gia = sc.nextDouble();
            list.add(new SanPham(name, gia));
            sc = new Scanner(System.in);
            System.out.print("Chọn (y/n) để thoát :");
            a = sc.nextLine();

            if (a.equalsIgnoreCase("y")) {
                System.out.println("Nhập dữ liệu thành công");
                break;
            }

            i++;
        } while (true);
    }

    public void xuat() {
        int i = 1;
        System.out.printf("%-20s %-20s %s", "Sản phẩm thứ", "Tên Sản Phẩm", "Giá Sản Phẩm");
        for (SanPham item : list) {

            System.out.printf("\n%-20d %-20s %.2f\n", i, item.getTenSp(), item.getGia());
            i++;
        }
    }

    public void SapXep() {
        Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o1.getGia(), o2.getGia());
            }
        };
        Collections.sort(list, comp);

        xuat();
    }

    public void XoaTenSanPham() {

        Scanner sc = new Scanner(System.in);
        String xoaTen;
        System.out.print("Nhập vào tên sản Phẩm cần xóa :");
        xoaTen = sc.nextLine();
        SanPham sp = null;
        for (SanPham item : list) {
            if (item.getTenSp().equalsIgnoreCase(xoaTen)) {
                sp = item;
            }
        }
        if (sp != null) {
            list.remove(sp);
            System.out.println("Xóa Sản Phẩm Thành Công");
        }else{
            System.out.println("Không tìm thấy sản phẩm cần xóa");
        }

        xuat();
    }
    public void giaTrungBinh(){
        System.out.println("Gia Trung Binh");
        double tong =0;
        int i =0;
        for (SanPham item: list) {
            tong+=item.getGia();
            i++;
            
        }
        System.out.println("Giá trung Binh: "+(tong/i));
    }

    public static void main(String[] args) {
        DanhSachSanPham sp = new DanhSachSanPham();
        sp.nhap();
//        sp.xuat();
//        sp.SapXep();
//        sp.XoaTenSanPham();
        sp.giaTrungBinh();

    }
}
