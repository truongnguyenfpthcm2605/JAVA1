
import java.util.ArrayList;
import java.util.Scanner;


public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        double a;
        for(int i=0 ;i<10 ;i++){
            System.out.print("Nhap So: ");
            a =sc.nextDouble();
            list.add(a);
        }
        for (Double item : list) {
            System.out.println(item);
        }
    }
}
