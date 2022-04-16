
package quanlisanpham;

import java.util.Scanner;



public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sản phẩm 1");
        SanPham sp = new SanPham();
        sp.nhap();
        sp.xuat();
        System.out.println("Sản phẩm 2");
        SanPham sp1 = new SanPham("trung", 1000);
        sp1.xuat();
        System.out.println("Sản phẩm 3");
        SanPham sp2 = new SanPham("truong", 660, 60);
        sp2.xuat();
        
        
        

        }
 
}

