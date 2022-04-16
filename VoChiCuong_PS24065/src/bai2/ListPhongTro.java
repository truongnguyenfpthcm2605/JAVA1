/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Truong Nguyen
 */
public class ListPhongTro {
    PhongTro pt;
    ArrayList<PhongTro> list = new ArrayList<>();

    public void nhap() {
        String leave = "n";
        Scanner sc = new Scanner(System.in);
        do {

            System.out.print("Nhap vao  so phong:");
            int sphong = sc.nextInt();
            sc = new Scanner(System.in);
            System.out.print("nhap gia tien theo thang: ");
            double tienThang = sc.nextDouble();
            sc = new Scanner(System.in);
            System.out.print("Nhap sso dien: ");
            double sodien = sc.nextDouble();
            sc = new Scanner(System.in);
            System.out.print("Nhap so nuoc :");
            double soNuoc = sc.nextDouble();
            PhongTro pt = new PhongTro(sphong, tienThang, sodien, soNuoc);
            list.add(pt);
            System.out.print("Ban muon nhap tiep hay khong (y/n) :");
            sc = new Scanner(System.in);
            leave = sc.nextLine();
            if (leave.equalsIgnoreCase("n")) {
                System.out.println("Nhâp du lieu thanh cong");
                break;
            }

        } while (true);
    }
    public void xuat(){
        System.out.printf("%-10s %-20s %-20s %-20s %s\n","So Phong","Tien theo thang","Tien dien","Tioen nuoc","Tien thue");
        for (PhongTro pt : list) {
            pt.xuat();
        }
    }

}
