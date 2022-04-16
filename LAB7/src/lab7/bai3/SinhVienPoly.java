
package lab7.bai3;

public abstract class SinhVienPoly {
    private String hoTen;
    private String nganh;

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    
    
    public abstract double getDiem();

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
   public String hocLuc(){
       if(getDiem() >= 9){
           return "Xuat Săc";
       }else if(getDiem()>= 7.5){
           return "Gioi";
       }else if(getDiem() >= 6.5){
           return "Kha";
       }else if(getDiem()>=5){
           return "Trung Binh";
       }else{
           return "Yeu";
       }
   }
   public void xuat(){
       System.out.printf("%-10s %-10s %-10.1f %s\n",getHoTen(),getNganh(),getDiem(),hocLuc());
   }
}
