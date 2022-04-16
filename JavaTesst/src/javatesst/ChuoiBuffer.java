
package javatesst;

import java.util.Scanner;

public class ChuoiBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Nguyen Van Truong Nguyen";
        String name2 = "Nguyen";
        // doi tuong tai vi tri charAt
        System.out.println(name.charAt(5));
        // so sanh chuoi voi chuoi khac CompareTo,compareToIgnoreCase
        System.out.println(name2.compareToIgnoreCase(name));
        // noi chuoi concat
        String name3 = name.concat(name2);
        System.out.println(name3);
        // vi tri xua t hien dau tien indexOf
        System.out.println(name3.lastIndexOf("Nguyen"));
        // tra ve do dai chuoi lenght
        System.out.println(name3.length());
        // cat chuoi thanh nhieu chuoi split[];
        String[] arrStr = name.split(" ");
        String firstName = arrStr[arrStr.length-1];
        String lastName = arrStr[0];
        String fullName = lastName.concat(" ").concat(firstName);
        System.out.println(fullName);
        for (String string : arrStr) {
            System.out.println(string);
        }
        // tra ve vi tri cho truoc substring(star, end);
        System.out.println(name.substring(8));
        // xoa khoang trang truoc sau trim();
        System.out.println(name.trim());
        
        StringBuilder s= new StringBuilder();
        // ham noi chuoi chong nhau
        s.append("hello");
        s.append("wworld");
        // ham them chuoi tai vi tri insert
        s.insert(2, " Truong ");
       
        // ham  thay the chuoi replace
        s.replace(0, 3, "trung");
         
         // xoa chuoi theo vi tri delete
         s.delete(0, 5);
        
         // dao nguoc chuoi reverse
         s.reverse();
         
          // kiem tra dung luong capaty();
          s.capacity();
           System.out.println(s.capacity());


         
        

        
    }
}
