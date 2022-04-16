package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class MangChuoiMssv {

    ArrayList<String> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void intput() {
        String exit = "y";
        do {
            do {
                System.out.print("Nhập vao mssv =");
                String mssv = sc.nextLine();
                if(Data(mssv)){
                    list.add(mssv);
                    break;
                }
                System.out.println("Không hợp lệ nhập lại");
            } while (true);
            sc = new Scanner(System.in);
            System.out.print("Nhâp (y/n) để thoat va tiep tuc: ");
            exit = sc.nextLine();
            if(exit.equalsIgnoreCase("y")) break;
        } while (true);
    }
    public void output(){
        int idx=1;
            for (String item : list) {
                System.out.printf(" Masv %d = %s\n",idx,item);
                idx++;
            }
    }

    public boolean Data(String ms) {
        String form = "PS[0-9]{5}";
        return ms.matches(form);
    }
    public static void main(String[] args) {
        MangChuoiMssv m = new MangChuoiMssv();
         m.intput();
         m.output();
    }
}
