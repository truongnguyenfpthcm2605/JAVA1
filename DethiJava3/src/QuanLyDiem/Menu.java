
package QuanLyDiem;

import java.util.Scanner;

public class Menu {

    public void menu() {
        Scanner sc = new Scanner(System.in);
        int chon;
        String exit = "y";
        QuanLyDiemSV ql = new QuanLyDiemSV();
        do {
            try {
                System.out.println("____________________Quan Ly DIem Sinh Vien_____________ ");
                System.out.println("\t1.Nhap ");
                System.out.println("\t2.Xuat");
                System.out.println("\t3.Tim ma sv");
                System.out.println("\t4. Diem trung binh");
                System.out.println("\t0.Kết thúc ứng dụng");
                System.out.print("Chon chuc năng tu 1-3: ");
                chon = sc.nextInt();
                switch (chon) {
                    case 1:
                        ql.nhap();
                        break;
                    case 2:
                        ql.xuat();
                        break;
                    case 3: 
                        ql.findSv();
                        break;
                    case 4: 
                        ql.diemTB();
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("Chon chuc năng tu 1-3: ");

                }
            } catch (Exception e) {
                sc = new Scanner(System.in);
                System.out.print("Nhap sai dinh dang du kieu muon nhap lai chon (y/n): ");
                exit = sc.nextLine();
                if (exit.equalsIgnoreCase("n")) {
                    break;
                }

            }

        } while (true);
    }
    public static void main(String[] args) {
        Menu m = new Menu();
        m.menu();
    }
}
