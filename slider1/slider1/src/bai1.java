
import java.util.Scanner;

/*
viet chuong trinh nhap 2 so tu ban phim 
tinhs tong va xuat tong ra man hinh
*/
public class bai1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a,b;
        System.out.println("Nhap vao a: ");
        a= sc.nextInt();
        System.out.println("Nhap vao b :");
        b=sc.nextInt();
        System.out.println("tong cua ab la :"+ (a+b));
    }
}
