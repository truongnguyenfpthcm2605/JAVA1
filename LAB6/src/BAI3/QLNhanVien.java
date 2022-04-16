
package BAI3;


public class QLNhanVien {
    public static void main(String[] args) {
        SinhVien[] sv = new SinhVien[3];
        int count=1;
        for(int i= 0;i<sv.length;i++){
            System.out.println("Person"+ count);
           sv[i] = new SinhVien();
           sv[i].nhap();
           count++;
        }
        for(int i= 0;i<sv.length;i++){
            sv[i].xuat();
        }
    }
}
