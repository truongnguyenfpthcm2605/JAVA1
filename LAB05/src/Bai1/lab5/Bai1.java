
package Bai1.lab5;


import java.util.ArrayList;
import java.util.Scanner;


public class Bai1 {
    public static void main(String[] args) {
       Bai1 b1 = new Bai1();
       b1.input();
       b1.output();
       
        
    }
    ArrayList<Double> list = new ArrayList<>();
    
    public void input(){
        String stop = "y";
        do{ 
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập Số :");
            list.add(sc.nextDouble());
            System.out.print("Chon y/n để tiếp tục: ");
            stop = sc.next();
            if(stop.equalsIgnoreCase("n")){
                System.out.println("Nhập dữ liệu thành công");
                break;
            }  
        }while(true);
    }
    public void output(){
        System.out.println("Xuất Các số trong danh sách đã nhập ");
        int count=0;
        for (Double item : list) {
            System.out.printf("Số thứ %d = %.1f\n",count,item);
            count++;
        }
        System.out.println("Tổng các số trong danh sách : "+ sum());
    }
    private double sum(){
        double tong=0;
        for (Double item : list) {
            tong+=item;
            
        }
        return tong;
    }
    
    
    
}
