
import java.util.Scanner;
//  giai phuong trinh bac hai , ham Math.sqrt(a);
// nguyen van truong ps24083
// ngay tao : 6/1/2022, 
// bai 4 lab 1

public class bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c;
        do {
            System.out.print("Nhap vao a # 0:");
            a = sc.nextDouble();
        } while (a == 0);
        System.out.print("Nhap vao b : ");
        b = sc.nextDouble();
        System.out.print("Nhap vao c :");
        c = sc.nextDouble();
        System.out.println("a =" + a);
        System.out.println("b =" + b);
        System.out.println("c =" + c);
        double delta = Math.pow(b, 2) - 4 * a * c;
        double k, x1, x2;
        if (delta < 0) {
            System.out.println("Phuong trinh vo ngiem");

        } else if (delta == 0) {
            k = -b / (2 * a);
            System.out.println("Puong Trinh co nghiem kep: " + k);

        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co 2 nghiem phan biet");
            System.out.println("x1 =" + x1);
            System.out.println("x2 =" + x2);
        }
    }
}
