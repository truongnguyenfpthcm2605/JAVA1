package javatesst;

import java.util.Scanner;

public class TryCacth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        String leave = "n";
        do {
            try {
                System.out.print("Nhập vao số nguyên : ");
                 number = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Nhập dữ liệu sai");
            }
//            System.out.println("Bạn muốn nhập lại không : (y/n)");
//            sc = new Scanner(System.in);
//            leave = sc.nextLine();
//            if(leave.equalsIgnoreCase("n")) break;
            
          

        } while ( true);

    }

}
