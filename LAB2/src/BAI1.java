
import java.util.Scanner;

//  giai phuong trinh bac nhat
// nguyen van truong ps24083
// ngay tao : 6/1/2022, 
// bai 1 lab 2
public class BAI1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        
        System.out.print("Nhap vao a: ");
        a = sc.nextDouble();
        System.out.print("Nhap vao b: ");
        b = sc.nextDouble();
        ptBacNhat(a, b);
    }

    public static void ptBacNhat(double a, double b) {

        double x;

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong Trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh nghiem");
            }
        } else {
            x = -b / a;
            System.out.println("Nghiem cua phuong trinh la x =" + x);
        }

    }

}
