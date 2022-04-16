package BAI1;

import java.util.Scanner;

public class BAI1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fullname;
        System.out.print("Nhập Vào Họ Và Tên : ");
        fullname =sc.nextLine();
        
        String[] arrStr = fullname.split(" ");
        String ho = arrStr[0].toUpperCase();
        String ten = arrStr[arrStr.length-1].toUpperCase();
        String dem=" ";
        for (int i = 1; i < arrStr.length-1; i++) {
            dem+=arrStr[i]+ " ";
            
        }
        System.out.println(ho+dem+ten);
        
               

        
    }

}
