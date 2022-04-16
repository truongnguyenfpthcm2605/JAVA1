/*
mang
nguyen van truong ps24083 ; ngay 10/1/2022;
bai 3 lab 3;

 */
import java.util.Arrays;
import java.util.Scanner;

public class BAI3 {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap vao so pha tu mang: ");
        n = sc.nextInt();
        int mang[] = new int[n];
        
        
        inputs(mang, n);
        outputs(mang, n);
        SapXep(mang, n);
        
        min(mang, n);
        tbchia3(mang, n);
        
    }
    
    public static void inputs(int mang[], int n) {
        System.out.println("Nhap vao gia tri trong mang");
        for (int i = 0; i < n; i++) {
            System.out.printf("mang[%d] = ", i);
            mang[i] = sc.nextInt();
            
        }
    }
    
    public static void outputs(int mang[], int n) {
        System.out.println("Xuat gia tri trong mang ");
        for (int i = 0; i < n; i++) {
            System.out.printf("mang[%d] = %d\n", i, mang[i]);
            
        }
        
    }

    public static void SapXep(int mang[], int n) {
        System.out.println("Sap Xep giam dan");
        int a;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (mang[i] > mang[j]) {
                    a = mang[i];
                    mang[i] = mang[j];
                    mang[j] = a;
                    
                }
                
            }
            
        }
        outputs(mang, n);
        
    }    
    
    public static void min(int mang[], int n) {
        int min = mang[0];
        for (int i = 0; i < mang.length; i++) {
            min = Math.min(min, mang[i]);
        }
        System.out.println("Gia tri nho nhat cua mang la : " + min);
    }
    
    public static void tbchia3(int mang[], int n) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] % 3 == 0) {
                count++;
                sum += mang[i];
            }
            
        }
        System.out.println("Trung binh cong cua cac phan tu chia het cho 3 trong mang : " + ((float) sum / count));
    }
    
}
