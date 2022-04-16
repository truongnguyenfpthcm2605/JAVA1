
import java.util.Scanner;


public class BAI5 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        System.out.println("NHAP VAO SO LUONG SINH VIEN: ");
        n = sc.nextInt();
        double diem[]=new double[n];
        String ten[]= new String[n];

        nhap(ten, diem, n);
        xuat(ten, diem, n);
        SapXep(ten, diem, n);
        
        
    }
    public static void nhap(String ten[], double diem[], int n){
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien thu nhat : "+ (i+1));
            System.out.println("Nhap vao ten: ");
            ten[i]=  sc.next();
            System.out.println("Nhap vao diem sinh vien : ");
            diem[i] =sc.nextDouble();
   
        }
    }
    public static void xuat(String ten[], double diem[], int n){
        for (int i = 0; i < n; i++) {
            System.out.println("TEN : "+ ten[i] + " - DIỂM: "+ diem[i]+ " -HỌC LUC: "+ hocLuc(diem[i])  );
            
        }
    }
    public static String hocLuc(double diem){
        String xeploai;
        if(diem<5){
            xeploai = "YẾU";
        }else if(diem < 6.5){
            xeploai = "TRUNG BINH";
        }else if(diem< 7.5){
            xeploai ="KHÁ";
        }else if(diem<9){
            xeploai = "GIỎI";
        }else{
            xeploai = "XUẤT SẮC";
        }
        return xeploai;
        
    }
    public static void SapXep(String ten[], double diem[], int n){
        System.out.println(" SAP XEP GIAM DAN ");
        double d;
        String t;
        for(int i =0 ;i< n-1;i++){
            for(int j =i+1;j<n;j++){
                if(diem[i]<diem[j]){
                    d = diem[j];
                    diem[j] =diem[i];
                    diem[i] = d;
                    t= ten[j];
                    ten[j]= ten[i];
                    ten[i]= t;
                }
            }
        }
        xuat(ten, diem, n);
    }
    
}
