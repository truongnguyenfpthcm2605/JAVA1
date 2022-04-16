
import java.util.Scanner;

public class BAI1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap vao so n;");
        n = sc.nextInt();
        if (KTsont(n) == true) {
            System.out.println(n + " phai la so nguyen");
        } else {
            System.out.println(n + " Khong phai la so nguyen to");
        }
    }

    public static boolean KTsont(int n) {
        boolean a = true;
        if(n<2) a=false;
        double b = Math.ceil(Math.sqrt(n));
        for (int i = 2; i <= b; i++) {
            if (n % i == 0) {
                a = false;
                break;
            }
        }
        return a;

    }
}
