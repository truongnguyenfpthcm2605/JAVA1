package bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ManagerTeacher {

    Teacher ps;
    ArrayList<Teacher> list = new ArrayList<>();

    public void menu() {

        String stop = "y";
        int chon;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("____________________Menu Quan Lý Teacher_________________");
            System.out.println("\t1.Nhập Danh Sách Teacher");
            System.out.println("\t2.Xuất thông tin Teacher");
            System.out.println("\t3.Sắp xếp danh sach Teacher theo thu nhap");
            System.out.println("\t4.Tim kiem tho tuoi ");
            System.out.println("\t5.Thoát chương trình");
            System.out.print("\tChon chuc năng 1-5: ");
            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    input();

                    break;
                case 2:
                    output();

                    break;
                case 3:
                    SxThuNhap();
                    break;
                case 4:
                    findAgf();
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh thanh cong");
                    System.exit(0);
                default:
                    System.out.println("\tChon chuc năng 1-5.");
            }
        } while (true);
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        String exit = "k";
        do {
            ps = new Teacher();
            ps.input();
            list.add(ps);
            sc = new Scanner(System.in);
            System.out.print("Nhâp nua hay khong (co/k):");
            exit = sc.nextLine();
            if (exit.equalsIgnoreCase("k")) {
                System.out.println("Nhâp du lieu thanh cong");
                break;
            }

        } while (true);

    }

    public void output() {
        for (Person item : list) {
            item.output();
        }
    }

    public void SxThuNhap() {
        System.out.println("Sap xep theo thu nhap");
        Comparator<Teacher> comp = new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                if(o1.getEarning()> o2.getEarning()){
                    return 1;
                }
                return -1;
                
        }
 
        

    };
        Collections.sort(list, comp);
        output();
}

    public void findAgf() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao so tuoi muon tim: ");
        int Age = sc.nextInt();
        boolean check = false;
        for (Person item : list) {
            if (Age == item.getAge()) {
                item.output();
                check = true;
                
            }
        }
        if(check==false){
            System.out.println("khong co tuoi ban tim");
        }
    }

    public static void main(String[] args) {
        ManagerTeacher Mt = new ManagerTeacher();
        Mt.menu();
    }
}
