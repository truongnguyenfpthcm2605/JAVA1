
public class Vidu1 {
    public static void main(String[] args) {
        String truong = "Nguyen Van Truong";
        String nam = "Tran Hoai Nam";
        // chuoi truoc tru chuoi sau
        System.out.println("truong voi nam"+ truong.compareTo(nam));
        // ham so sanh them so luong ki tu
        String ten = "Nguyen";
        
        System.out.println("so sanh truong voi ten : "+ truong.regionMatches(0, ten, 0, 6));
        
        // kiem tra gia tri băt đầu;
        String sdt = "0377379249";
        System.out.println(sdt.startsWith("037"));
        System.out.println(sdt.startsWith("077"));
        
        String file1 = "hinh.jpg";
        String file2 = "hinh.jpg";
        System.out.println(file1.endsWith(file2));
        
        System.out.println(ten.indexOf(truong));
        
        System.out.println(ten.replaceAll("truong", "trung"));
        
        compe
    }
}
