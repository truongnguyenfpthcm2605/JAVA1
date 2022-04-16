
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class QuanLyNhanVien {
  
    ArrayList<NhanVien> list = new ArrayList<>();
    
    public void nhap(){
        
        NhanVien nv[] = new NhanVien[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhap nhan vien thu "+ (i+1));
            nv[i] = new NhanVien();
            nv[i].nhap();
            list.add(nv[i]);
            
        }
    }
    public void xuat(){
        System.out.println("Xuat thong tin nhan vien");
        System.out.printf("%-20s %-20s %s\n","Ma NV","Ho ten Nhan vien","He So");
        for (NhanVien item : list) {
            item.xuat();
        }
    }
    public void findMin(){
        double min = list.get(0).getHeSo();
        int idx =0;
        for (int i=0;i<list.size();i++) {
            if(list.get(i).getHeSo()< min){
                idx= i;
            }
        }
        list.get(idx).xuat();
        
    }
    public void giamDan(){
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
               if(o2.getHeSo() > o1.getHeSo()){
                   return 1;
               }
               return -1;
            }
        };
        Collections.sort(list, comp);
        xuat();
       
    }
    public void tbHeSo(){
        double tb=0;
        int idx=1;
        
        for (NhanVien item : list) {
            tb+=item.getHeSo();
            idx++;
        }
        double avger = tb/idx;
        System.out.println("Trung binh he so la :"+ avger);
        boolean check =false;
        for (NhanVien item : list) {
            if(item.getHeSo()> avger){
                item.xuat();
                check =true;
            }
        }
        if(check==false){
            System.out.println("Khong co nhan vien nao co he so lown hon trung binh");
        }
    }
   
}
