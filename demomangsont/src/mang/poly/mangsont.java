
package mang.poly;

import java.util.Scanner;

public class mangsont {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.printf("Nhap vao so n:");
        n = sc.nextInt();
            CacSont(n);
    }

    public static boolean KTsont(int n) {
        boolean a = true;
        double b = Math.ceil(Math.sqrt(n));
        for (int i = 2; i <= b; i++) {
            if (n % i == 0) {
                a = false;
                break;
            }
        }
        return a;

    }
    public static void CacSont(int n){
        for(int i =1 ;i< n;i++){
            if(KTsont(i)==true){
                System.out.println(i);
            }
        }
    }
}
