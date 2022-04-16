package bai1;

import java.util.Scanner;

public class bai1 {

    int arrays[] = new int[6];

    public static void main(String[] args) {
        bai1 b1 = new bai1();
        b1.nhap();
        b1.xuat();
        b1.giaTri();
        b1.SoNDfirst();

    }

    public void nhap() {
        String exit = "y";
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arrays.length; i++) {
            do {
                try {
                    System.out.printf("arrays[%d] = ", i);
                    arrays[i] = sc.nextInt();

                    if (Data(arrays[i]) == true) {
                        break;

                    }

                } catch (Exception e) {
                    sc = new Scanner(System.in);
                    System.out.print("nhap sai dinh dang  du lieu nhap lai hoac thoát(y/n): ");

                    exit = sc.nextLine();
                    if (exit.equalsIgnoreCase("y")) {
                        break;
                    }
                }

            } while (true);
        }
    }

    public boolean Data(int a) {
        String as = String.valueOf(a);
        String mau = "([1-9]{1})[0-9]{2,}";
        return as.matches(mau);

    }

    public void xuat() {
        System.out.println("Xuat Mang");
        for (int i = 0; i < arrays.length; i++) {
            System.out.printf("arrays[%d] =%d\n", i, arrays[i]);

        }

    }

    public void giaTri() {
        System.out.println("Cac phan tu co gia tri tu 100-200");
        Boolean check = true;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] >= 100 && arrays[i] <= 200) {
                System.out.printf("arrays[%d] = %d\n", i, arrays[i]);
                check = true;
            }
        }
        if (check == false) {
            System.out.println("Khong co gia tri do");
        }

    }
    public void SoNDfirst(){
        System.out.println("Phan Tu chia het cho 50 dau tien");
        
        boolean check =false;
        for (int i = 0; i < arrays.length; i++) {
            if(arrays[i]%50==0){
                System.out.printf("arrays[%d]= %d",i,arrays[i]);
                check=true;
                break;
            }
        }
        if(check==false){
            System.out.println("Khong co so nd chia het cho 50");
        }
    }
}
