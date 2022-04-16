package LAB8;

import java.util.Scanner;

public final class Xpoly {

    public static void main(String[] args) {
        menu();
    }

    public static final double sum(double... nums) {
        double sum = 0;
        for (double item : nums) {
            sum += item;
        }
        return sum;
    }

    public static final double min(double... nums) {
        double min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
        }
        return min;
    }

    public static final double max(double... nums) {
        double max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        return max;
    }

    public static final String toUpperFirstChar(String s) {
        String[] arrStr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrStr.length; i++) {
            String item = arrStr[i];
            if (!item.equals("")) {
                String inHoa = item.substring(0, 1).toUpperCase();
                item = inHoa + item.substring(1).toLowerCase();
                sb.append(item).append(" ");
            }
        }
        return sb.toString().trim();
    }


    public static final void menu() {
        String leave = "n";
        int chon;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("_________________Menu lab8______________________");
            System.out.println("\t1.Tinh Tong");
            System.out.println("\t2.Tim so nho nhat");
            System.out.println("\t3.Tim so lon nhat");
            System.out.println("\t4.In hoa kí tu dau ");
            System.out.println("\t5.Thoát");
            System.out.print("\tChon 1-5: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                   double tong =  sum(1,2,3,536,7,8,8,6,9,934343);
                    System.out.println("Tong"+ tong);
                    break;
                case 2:
                    double nho =min(1212123,343434,54656,7,67,86,22,1);
                    System.out.println("so nho nhat : "+ nho);
                    break;
                case 3:
                    double lon = max(2323,45345,6456,474,567567,5785,8);
                    System.out.println("So lon nhat"+ lon);
                    break;
                case 4:
                    System.out.print("Nhập van ho va tên: ");
                    sc = new Scanner(System.in);
                    String s = sc.nextLine();
                    System.out.println("Ten in hoa ki tu dau: "+ toUpperFirstChar(s));
                    break;
                case 5:
                    System.out.println("Thoat thanh cong");
                   System.exit(0);
                default: 
                    System.out.print("\tChon 1-5: ");

            }

        } while (true);
    }
}
