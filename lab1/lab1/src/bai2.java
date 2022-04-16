
import java.util.Scanner;
//  tinh dien tich va chu vi hcn
// nguyen van truong ps24083
// ngay tao : 6/1/2022, 
// bai 2 lab 1

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float dai, rong;
        do{
            System.out.println("Nhap chieu dai , rong va lon hon 0");
            System.out.print("Nhap vao chieu dai :");
            dai = sc.nextFloat();
            System.out.print("Nhap vao chieu rong : ");
            rong =sc.nextFloat();
        }while(dai<=0 || rong<=0);
        bai2 b2 = new bai2();
        float chuVi = b2.chuVi(dai, rong);
        float dienTich = b2.dienTich(dai, rong);
        float min = b2.min(dai, rong);

            System.out.println("Chu vi hinh chu nhat la ;"+ chuVi);
            System.out.println("dien tich hinh chu nhat la ;"+ dienTich);
            System.out.println("Canh nho nhat : "+ min);
        
    }
    public float chuVi(float a, float b){
        return (a+b)*2;
    }
    public float dienTich(float a, float b){
        return a*b;
    }
    public float min(float a, float b){
        return Math.min(a, b);
    }
    
}
