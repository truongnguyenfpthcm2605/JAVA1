
package bai3.lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class QuanLySP {
    public static void main(String[] args) {
        QuanLySP qlsp = new QuanLySP();
        qlsp.nhap();
        qlsp.xuat();
        qlsp.SapXepGiaGiam();
        qlsp.xoaSanPham();
        
    }
    SanPham sp =new SanPham();
    ArrayList<SanPham> list = new ArrayList<>();
    
    public void nhap(){
        String ten, stop ="y";
        double gia;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập vao tên sản phẩm:");
            ten= sc.next();
            sc = new Scanner(System.in);
            System.out.print("Nhập vào giá sản phẩm :");
            gia= sc.nextDouble();
            sc = new Scanner(System.in);
            sp = new SanPham(ten, gia);
            list.add(sp);
            System.out.print("chọn Y/N để tiếp tục :");
            stop = sc.next();
            if(stop.equalsIgnoreCase("n")){
                System.out.println("Nhập dữ liệu thành công");
                break;
            }
        }while(true);
    }
    public void xuat(){
        int i =1;
        System.out.printf("%-5s %-20s %s\n","STT", "Tên sản Phẩm","Giá Sản Phẩm");
        for (SanPham item : list) {
            System.out.printf("%-5s %-20s %.1f\n",i,item.getTen(),item.getGia());
            i++;
            
        }
    }
    public void SapXepGiaGiam(){
        Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o2, SanPham o1) {
                 return Double.compare(o1.getGia(), o2.getGia());
            }
        };
        Collections.sort(list, comp);
        System.out.println("Sắp Xếp giá sản phẩm giảm dần");
        xuat();
                
            
    }
    public void xoaSanPham(){
        Scanner sc = new Scanner(System.in);
        String tenXoa;
        System.out.print("Nhập tên sản phẩm cần xóa: ");
        tenXoa = sc.nextLine();
        
        for (SanPham item : list) {
            if(tenXoa.equalsIgnoreCase(item.getTen())){
                list.remove(item);
                break;
            }else{
                System.out.println("Không tim thấy san phẩm cần xóa");
                break;
            }
        }
        System.out.println("danh sách sản phẩm sau khi xóa");
        xuat();
        
    }
    
}
