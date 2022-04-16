
package javatesst;

import java.util.Arrays;
import java.util.Scanner;

public class Mang {
    // ham dao chieu mang trả về 1 mang
    public int[] revesw(int[] a){
        int idx= 0;
        int x[] = new int[a.length];
        for(int i = a.length-1; i>=0; i--){
            x[idx] = a[i];
            idx++;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhập vao: ");
            a[i] = sc.nextInt();
            
        }
         Arrays.sort(a);
        System.out.println( Arrays.toString(a));
  
        Mang  d= new Mang();
         a= d.revesw(a);
        System.out.println(Arrays.toString(a));

        
        
    }
}
