package Bai1;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arrStr = new String[6];
        System.out.println("Nhap mang");
        for (int i = 0; i < arrStr.length; i++) {
            System.out.printf("arrStr[%d] = ", i);
            arrStr[i] = sc.nextLine();

        }
        System.out.println(" xuat mang");
        for (int i = 0; i < arrStr.length; i++) {
            System.out.printf("arrStr[%d]= %s\n",i,arrStr[i]);
        }
        System.out.println("Chuoi co do dai bé hon 3 ki tu");
        boolean check = false;
        for (int i = 0; i < arrStr.length; i++) {
            if(arrStr[i].length()<3){
                System.out.printf("arrStr[%d] = %s\n",i,arrStr[i]);
                check= true;
            }
        }
        if(check==false){
            System.out.println("khong co chuoi nao be hon 3 ki tu");
        }

    }
}
