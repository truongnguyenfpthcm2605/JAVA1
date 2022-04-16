
package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class bai1 {
    ArrayList<Double> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bai1 b1 = new bai1();
         b1.input();
         b1.output();
         b1.tongSoLe();
         b1.soChanmin();
        
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        
        String exit = "k";
        
        do{
            try {
                System.out.print("Nhap vao mang: ");
                double  number = sc.nextDouble();
                list.add(number);
            } catch (Exception e) {
                System.out.println("nhap sai dư lieu nhap lại");
            }
            sc = new Scanner(System.in);
            System.out.print("Nhâp nua hay khong (co/k):");
            exit = sc.nextLine();
            if(exit.equalsIgnoreCase("k")){
                System.out.println("Nhâp du lieu thanh cong");
                break;
            }
            
        }while(true);
    }
    public void output(){
        System.out.println("xuat phan tu mang");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            
        }
    }
    public void tongSoLe(){
        double tong=0;
        for (Double item : list) {
            if(item%2!=0){
                tong+=item;
            }
        }
        if(tong==0){
            System.out.println("Khong co so chia het cho le");
        }else{
            System.out.println("tong so le la :"+ tong);
        }
    }
    public void soChanmin(){
        double min=list.get(0);
        for (Double item : list) {
            if(item%2==0){
                min = Math.min(min, item);
            }
           
            
        }
        if(min!=list.get(0)){
            System.out.println("So chan nho nhat la "+ min);
        }else{
            System.out.println("khong co so chan");
        }
        
        
    }
}
