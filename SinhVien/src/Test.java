
public class Test {
    public static void main(String[] args) {

        
        SinhVien sv[]= new SinhVien[3];
        for (int i = 0; i < sv.length; i++) {
            sv[i]=new SinhVien();
            sv[i].Nhap();
        }
        for (int i = 0; i < 3; i++) {
            sv[i].Xuat();
            
        }
    }
    
}
