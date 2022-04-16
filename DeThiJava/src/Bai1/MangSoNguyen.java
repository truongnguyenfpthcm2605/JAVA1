package Bai1;

import java.util.Scanner;

public class MangSoNguyen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Nhập vao số phần tử trong mang: ");
        int numberArray = sc.nextInt();

        int array[] = new int[numberArray];
        System.out.println("Nhập mảng");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("a[%d] = ",i);
            array[i] = sc.nextInt();
        }
        System.out.println("Xuất Mảng");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("a[%d] = %d\n",i,array[i]);
        }
        System.out.println("Xuất mảng căn bậc 2");
       
        for (int i = 0; i < array.length; i++) {
            System.out.printf("a[%d] = %.1f\n",i,(double)Math.sqrt(array[i]));
        }

    }

}
