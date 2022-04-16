
import java.util.Scanner;

// menu lab2
// nguyen van truong ps24083
// ngay tao : 6/1/2022, 
// bai 4 menu lab 2
public class bai4menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int so;
        double a,b;
        String lap;
        do {
        System.out.println("________________________________________");
        System.out.println("\t1.Giai Phuong Trinh Bac nhat ");
        System.out.println("\t2.Giai Phuong Trinh Bac hai");
        System.out.println("\t3.Tinh tien dien ");
        System.out.println("\t4.Thoat Chuong trinh");
        System.out.println("________________________________________");
        
            System.out.println("Moi ban chon chuc nang 1-4 ");
            so = sc.nextInt();

            switch (so) {
                case 1:
                    System.out.println("\t1.Giai Phuong Trinh Bac nhat ");
                    sc = new Scanner(System.in);
                    System.out.print("Nhap vao a: ");
                    a =sc.nextDouble();
                    System.out.print("Nhap vao b: ");
                    b = sc.nextDouble();
                    BAI1.ptBacNhat(a,b);
                    break;
                case 2:
                    System.out.println("\t2.Giai Phuong Trinh Bac hai");
                    bai2.ptBacHai();

                    break;
                case 3:
                    System.out.println("\t3.Tinh tien dien ");
                    bai3.tienDien();
                    break;
                case 4:
                     sc = new Scanner(System.in);
                    System.out.println("Ban co chắt muon thoat chuong trinh khong");
                    System.out.print("Nhap y de thoat: ");
                    lap =sc.nextLine();
                    if(lap.equalsIgnoreCase("y")){
                        System.out.println("Cam on ban da su dung chuong tirnh");
                        System.exit(0);
                    }

            }
                  
        } while (so < 0 || so > 4);

    }

}
