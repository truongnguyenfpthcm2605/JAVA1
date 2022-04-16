
import java.util.Scanner;

public class QuanLySanPham {

    public void menu() {
        Scanner sc = new Scanner(System.in);
        int chon;
        String exit = "y";
        SanPham ps = new SanPham();
        do {
            try {
                System.out.println("____________________Quan Ly Nhan Vien______________ ");
                System.out.println("\t1.Nhap ");
                System.out.println("\t2.Xuat");
                System.out.println("\t1.Tinh luong");
                System.out.println("\t2.Tìm Nhân Viên");
                System.out.println("\t0.Kết thúc ứng dụng");
                System.out.print("Chon chuc năng tu 1-3: ");
                chon = sc.nextInt();
                switch (chon) {
                    case 1:
                        ps.nhap();
                        break;
                    case 2:
                        ps.xuat();
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
        QuanLySanPham ql = new QuanLySanPham();
        ql.menu();
    }
}
