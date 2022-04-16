
package javatesst;

import java.util.Scanner;

public class TimCuoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = new String[6];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhap vao chuoi : ");
            a[i] = sc.nextLine();

        }
        for (String Str : a) {
            System.out.println(Str);
        }
        int flag = -1 ;
        for(int i=0 ;i< a.length;i++){
            if(a[i].equals("hello")){
                flag = i;
                break;
            }
        }
        if(flag==-1){
            System.out.println("Khong tim thay");
        }else{
            System.out.println("Tim thay dau tien ở vi tri thu "+ flag);
        }
    }
}

