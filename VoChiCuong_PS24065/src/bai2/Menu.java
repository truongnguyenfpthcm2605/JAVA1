/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.Scanner;

public class Menu {
    
    public void menu() {
        ListPhongTro list = new ListPhongTro();

        String stop = "y";
        int chon;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("____________________Menu Quan Lý sinh Vien Poly_________________");
            System.out.println("\t1.Nhập Danh Sách phong tro");
            System.out.println("\t2.Xuất thông tin phong tron");     
            System.out.println("\t3.Thoát chương trình");
            System.out.print("\tChon chuc năng 1-3: ");
            chon = sc.nextInt();

            switch (chon) {
                case 1:
                   list.nhap();
                    break;
                case 2:
                    list.xuat();

                    break;
                case 3 : System.out.println("Thoat chuong trinh thanh cong");
                   System.exit(0);
                default:
                    System.out.println("\tChon chuc năng 1-5.");
            }
        } while (true);
    }
    public static void main(String[] args) {
        Menu m = new Menu();
        m.menu();
    }
}
