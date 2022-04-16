
package javatesst;

import java.util.Scanner;

public class SplitString {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhập vao tên : ");
        String ten = sc.nextLine();
        ten.trim();
        String Arrstr[]  = ten.split(" ");
        String ho = Arrstr[0];
        
        String tens = Arrstr[Arrstr.length-1];
        String dem = " ";
        for(int i= 1 ;i<Arrstr.length-1;i++){
           dem+= Arrstr[i];
        }
        System.out.println("Họ : "+ ho + " Điệm : "+ dem + " Tên : "+ tens);
    }
}
