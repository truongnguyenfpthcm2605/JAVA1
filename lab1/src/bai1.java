
import java.util.Scanner;
//  nhap xua ten(String) va diem trung binh
// nguyen van truong ps24083
// ngay tao : 6/1/2022, 
// bai 1 lab 1

public class bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        double pointTB;
        System.out.print("Nhap vao ho va ten cua ban : ");
        name = sc.nextLine();
        System.out.print("Nhap vao diem trung binh cua ban: ");
        pointTB = sc.nextDouble();

        if (pointTB >= 0 && pointTB <= 10) {
            System.out.print("Diem Trung Binh hop le :" + pointTB);

        } else {
            System.out.print(pointTB + " diem trung binh khong hop le");
        }
        System.out.printf("\n %s \n %.2f diem", name, pointTB);

    }
}
