
package Bai2.lab5;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;


public class DanhSach {
    ArrayList<String> list = new ArrayList<>();
    
    public void nhap(){
        String stop= "y";
        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập tên :");
            list.add(sc.next());
            System.out.print("chọn Y/N để tiếp tục:");
            stop =sc.next();
            if(stop.equalsIgnoreCase("N")){
                System.out.println("Nhập dữ liệu thành công");
                break;
            }
        }while(true);
    }
    public void xuat(){
        int count=1;
        for(String item : list){
            System.out.printf("Tên %d : %s\n",count,item);
            count++;
        }
    }
    public void Randomlist(){
        Collections.shuffle(list);
        xuat();
    }
    public void SapXepGiam(){
        Collections.sort(list);
        Collections.reverse(list);
        xuat();
    }
    public void Delete(String ten){
        System.out.println("Danh Sách Sau Khi Xóa.");
        for (String item : list) {
            if(ten.equalsIgnoreCase(item)){
                list.remove(item);
                break;
            }else{
                System.out.println("Không tìm thấy tên cần xóa");
                break;
            }
        }
        xuat();
    }
}
