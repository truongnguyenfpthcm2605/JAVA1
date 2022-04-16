
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Menu m = new Menu();
        m.menu();
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        int chon;
        String exit = "y";
        QuanLyNhanVien ql = new QuanLyNhanVien();
        do {
            try {
                System.out.println("____________________Quan Ly Nhan Vien_____________ ");
                System.out.println("\t1.Nhap ");
                System.out.println("\t2.Xuat");
                System.out.println("\t3.Tim nhan vien he so nho nhat");
                System.out.println("\t4.Danh sach nhan vien he so giam dan");
                System.out.println("\t5.Trung binh he so nhan vien");
                System.out.println("\t0.Kết thúc ứng dụng");
                System.out.print("Chon chuc năng tu 0-5: ");
                chon = sc.nextInt();
                switch (chon) {
                    case 1:
                        ql.nhap();
                        break;
                    case 2:
                        ql.xuat();
                        break;
                    case 3:
                        ql.findMin();
                        break;
                    case 4:
                       ql.giamDan();
                        break;
                    case 5 : 
                         ql.tbHeSo();
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
    
}
