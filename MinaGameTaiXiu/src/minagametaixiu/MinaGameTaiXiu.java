package minagametaixiu;

import java.util.Scanner;

public class MinaGameTaiXiu {

    /*
  Luat choi tai xỉu 
  số tiền cươc it nhất bằng số tiền của họ đang có ,
    có 3 viên xuất sắc mỗi viên có 6 mặt co gia tri tu 1 -6
    kết quả là điểm của 3 viên xuất sắc cộng lại với nhau.
    + Nếu tổng 3 viên = 3 || =18  = > Cái ăn hết , người chơi thua,
    + Nếu tổng 3 viên = 4-10 => xỉu
    + Nếu tổng 3 viên = 11-17 => Tài
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vao ten ngươi chơi: ");
        double yourMoney = sc.nextDouble();
        int choose;
        String exit = "n";

        do {
            try {
                System.out.println("________Menu Game_______");
                System.out.println("\t1.Tài");
                System.out.println("\t2.Xỉu");
                System.out.println("\t0. Exit game!");
                System.out.print("Input on here(0->2) :");
                choose = sc.nextInt();

                switch (choose) {
                    case 0:
                        System.out.println("Thoat tro chơi");

                        break;
                    case 1:
                        System.out.println(">>>>Tài>>>>");
                        break;
                    case 2:
                        System.out.println(">>>>Xỉu>>>>");
                        break;
                    default:
                        System.out.print("The result you selected is not available, reselect! :");

                }
            } catch (Exception e) {
                System.out.print("Nhập sai định dạng,Nhập lại hoặc thoát(y/n) :");
                sc = new Scanner(System.in);
                exit = sc.nextLine();
                if(exit.equalsIgnoreCase("n")){
                    System.out.println("Exit is Successful!");
                    break;
                }
            }

        } while (true);
    }

}
