
import java.util.Scanner;
//  tich the tich hinh  khoi chu nhat dung ham Math.pow(a,b);
// nguyen van truong ps24083
// ngay tao : 6/1/2022, 
// bai 3 lab 1

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a;
        do{
        System.out.print("Nhap vao canh cua khoi lap phuong > 0: ");
        a =sc.nextFloat();
        }while(a<=0);
        System.out.println("The tich khoi cua khoi chu nhat la  "+ Math.pow(a, 3));
        
        
    }
    
}
