
import java.util.Scanner;

//  gtinh tien dien
// nguyen van truong ps24083
// ngay tao : 6/1/2022, 
// bai 3 lab 2
public class bai3 {
    public static void tienDien() {
        Scanner sc = new Scanner(System.in);
        double sodien;
        do{
            System.out.println("Nhap vao so dien tieu thu : ");
            sodien =sc.nextDouble();
        }while(sodien<=0);
        if(sodien<50){
            System.out.println("Tien dien cua ban la : "+ (sodien*1000));
        }else{
            System.out.println("Tien dien cua ban la : "+( (50*1000)+(sodien-50)*1200));
        }
        
    
    
}
}
