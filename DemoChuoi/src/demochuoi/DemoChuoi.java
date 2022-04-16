
package demochuoi;

import java.util.Scanner;

public class DemoChuoi {


    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String user, pass;
//        System.out.printf("Nhập Username :");
//        user =sc.next();
//        sc = new Scanner(System.in);
//        System.out.printf("Nhập Passwork: ");
//        pass = sc.next();
//        DemoChuoi dm = new DemoChuoi();
//        if(dm.login(user, pass)==true){
//            System.out.println("Đăng Nhập thành công");
//        }else{
//            System.out.println("Đăng Nhập Thất Bại");
//        }
//       String str1 ="hello", str2 = "kkk";
//       
//     String s=  str1.concat(str2);
//        System.out.println(s);
//        
//        String date = "01/12/2000";
//        String[] arrdate = date.split("/");
//        System.out.println("thang :"+ arrdate[0]);
//        int idx = date.length();
//        System.out.println(idx);
//        int a = date.charAt(5);
//        System.out.println(a);
//        String[] arrStr = {"hello","chao","hahah"};
//        String c = str1.join(",", arrStr);
//        System.out.println(c);
//    String str = "Xin chao cac ban";
//    String newStr = str.replace("Xin", "Hello");
//        System.out.println("newStr = " + newStr);
        String hoTen = "Nguyen Van Truong";
        System.out.println("Độ dài :"+ hoTen.length());
//        String[] arrStr = hoTen.split(" ");
//        
//        String ho = arrStr[0].toUpperCase();
//        String ten = arrStr[arrStr.length-1].toUpperCase();
//        System.out.printf("Họ : %s ,Tên : %s",ho,ten);
//        String tenDem="";
//        for (int i = 1; i < arrStr.length-1; i++) {
//            tenDem+=arrStr[i];
//            
//        }
//        System.out.println("Tên Điệm : "+ tenDem);
          for (int i = 0; i < hoTen.length(); i++) {
              System.out.println(i +":"+ hoTen.charAt(i));
        }
          char[] arr = new char[20];
          
          hoTen.getChars(0,13 , arr, 0);
          for (int i = 0; i < arr.length; i++) {
              System.out.println(i + ":" + arr[i]);
        }
          byte[] arraybype = hoTen.getBytes();
          for (byte b : arraybype) {
              System.out.println(b);
        }
        
    }
    public boolean login(String name, String pass){
        
        if(name.equals("Truong") && pass.length() ==6){
            return true;
        }
        return false;
       
    }
    
}
