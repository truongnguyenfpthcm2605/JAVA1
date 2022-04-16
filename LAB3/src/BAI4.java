/*
mang
nguyen van truong ps24083 ; ngay 10/1/2022;
bai 4 lab 3;

 */
import java.util.Scanner;

public class BAI4 {

    static Scanner sc = new Scanner(System.in);
    static String name[] = new String[50];
    static double diemTB[] = new double[50];
    static int index =0;


    public static void main(String[] args) {
        inputs();
        outputs();
        SXgiamdan();

    }

    public static void inputs() {
        int flag =1;
        do{
            System.out.println("Nhap vao ten:");
            name[index]=  sc.next();
            System.out.println("Nhap vao diem sinh vien : ");
            diemTB[index] =sc.nextDouble();
            System.out.println("tiep tuc chon 1 hoac nhan so bat ki de thoat");
            index++;
            flag= sc.nextInt();
        }while(flag ==1);
        
    }

    public static void outputs() {
        for (int i = 0; i < index; i++) {
            System.out.println("Name: " + name[i] + "-" + " DIEM:" + diemTB[i] + "- HOC LUC:" + hocLuc(diemTB[i]));

        }
    }

    public static String hocLuc(double diem) {
        String xepLoai;
        if (diem < 5) {
            xepLoai = "YEU";
        } else if (diem < 6.5) {
            xepLoai = "TRUNG BINH";
        } else if (diem < 7.5) {
            xepLoai = "KHA";
        } else if (diem < 9) {
            xepLoai = "GIOI";
        } else {
            xepLoai = "XUAT SAC";
        }
        return xepLoai;

    }

    public static void SXgiamdan() {
        System.out.println("_________sau khi sap xep ___________");
        double point;
        String ten;
        for (int i = 0; i < index - 1; i++) {
            for (int j = i + 1; j < index; j++) {
                if (diemTB[i] < diemTB[j]) {
                    point = diemTB[j];
                    diemTB[j] = diemTB[i];
                    diemTB[i] = point;
                    ten = name[j];
                    name[j] = name[i];
                    name[i] = ten;
                }

            }

        }
        outputs();
    }

}
