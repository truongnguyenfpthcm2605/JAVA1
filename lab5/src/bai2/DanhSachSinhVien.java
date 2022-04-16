package bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DanhSachSinhVien {

    private ArrayList<String> list = new ArrayList<>();

    public DanhSachSinhVien() {

    }

    public void nhap() {
        list.clear();
        Scanner sc = new Scanner(System.in);

        String ten;
        do {
            System.out.println("Nhập vào tên hoặc bấm enter nếu muốn thoát :");
            System.out.print("Ten : ");
            ten = sc.nextLine();

            if (ten.isEmpty()) {
                System.out.println("Nhập Chương trình thanh công");
                break;
            }
            list.add(ten);
        } while (true);
    }

    public void xuat() {

        for (String item : list) {
            System.out.println("Ten: " + item);
        }
    }

    public void Listrandom() {

        Collections.shuffle(list);
        xuat();
    }

    public void SapXepGiamdan() {

        Collections.sort(list);
        Collections.reverse(list);
        xuat();
    }
    public void removeName(String name){
        for (String item : list) {
            if(item.equalsIgnoreCase(name)){
                list.remove(item);
                System.out.println("Xoa tên thành công");
                break;
            }else{
                System.out.println("Không  co tên cần xóa trong danh sách");
                break;
                
            }
        }
        System.out.println("danh sách tên sau khi thực hiện chức năng");
        xuat();
    }

    public void Menu() {
        Scanner sc = new Scanner(System.in);
        int chon;
       
        do {
            System.out.println("\tMời Bạn chọn chức năng : ");
            System.out.println("\t1.Nhập danh sách họ và tên");
            System.out.println("\t2.Xuất danh sách vừa nhập");
            System.out.println("\t3.Xuất danh sách ngẫu nhiên");
            System.out.println("\t4.Sắp Xếp giảm dần");
            System.out.println("\t5.Tìm và xóa tên nhập từ bàn phím");
            System.out.println("\t0.Thoát chương trinh");
            System.out.print("Mời bạn chọn chức năng từ 1-6: ");
            chon = sc.nextInt();
            switch (chon) {
                case 0 : 
                    System.out.println("Hẹn Gặp lại");
                    System.exit(0);
                case 1:
                    System.out.println("\t1.Nhập danh sách họ và tên");
                    nhap();

                    break;
                case 2:
                    System.out.println("\t2.Xuất danh sách vừa nhập");
                    xuat();
                    break;
                case 3:
                    System.out.println("\t3.Xuất danh sách ngẫu nhiên");
                    Listrandom();
                    break;
                case 4:
                    System.out.println("\t4.Sắp Xếp giảm dần");
                    SapXepGiamdan();
                    break;
                case 5:
                    System.out.println("\t5.Tìm và xóa tên nhập từ bàn phím");
                    sc = new Scanner(System.in);
                    String name;
                    System.out.print("Nhập vào tên cần xóa: ");
                    name = sc.nextLine();
                    removeName(name);
                    break;

            }
        } while (chon != 0);
    }
}
