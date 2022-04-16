
package javatest1;

import java.util.Arrays;
import java.util.Scanner;

public class JavaTest1 {

    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       String fullName = sc.nextLine();
        System.out.println(fullName);
       
       
       String arrStr[] = fullName.split(" ");
        System.out.println(Arrays.toString(arrStr));
        System.out.println("Họ la : " + arrStr[0]);
        System.out.println("Tên la : "+ arrStr[arrStr.length-1]);
       String lot ="";
        for (int i = 1; i < arrStr.length-1; i++) {
            lot+= arrStr[i];
        }
        System.out.println("lot la : "+ lot);
        System.out.printf("%s %s %s \n",arrStr[0],lot,arrStr[arrStr.length-1]);
      
    }
    
}
