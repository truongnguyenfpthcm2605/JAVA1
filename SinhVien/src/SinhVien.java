
import java.util.Scanner;


public class SinhVien {
    private String hoVaTen;
    private double diemTB;
    
    public SinhVien(){
    }
    public SinhVien(String hoVaten, double diemTB){
        this.hoVaTen =hoVaten;
        this.diemTB = diemTB;
    }
    public String getHoVaTen(){
        return hoVaTen;
    }
    public void setHoVaTen(String hoVaTen){
        this.hoVaTen = hoVaTen;
    }
    public double getDiemTB(){
        return diemTB;
    }
    public void setDiemTB(double diemTB){
        this.diemTB = diemTB;
    }
    public String XepLoai(double diemTB){
        if(diemTB < 5){
            return "Yeu";
        }else if(diemTB <7){
            return "Kha";
        }else{
            return "Gioi";
        }
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten :");
         hoVaTen = sc.nextLine();
        System.out.println("Nhap diem :");
        diemTB = sc.nextDouble();
    }
    public void Xuat(){
        System.out.println("Ten : "+ hoVaTen);
        System.out.println("Diem :"+ diemTB);
        System.out.println("Xep Loai "+ XepLoai(diemTB));
    }
}
