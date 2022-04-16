
package BAI2;

public class SanPham {
    private String tenSp;
    private double gia;
    private String hang;
    
    
   public SanPham(String tenSp, double gia, String hang){
       this.tenSp= tenSp;
       this.gia = gia;
       this.hang= hang;
   }

    public SanPham() {
    }
   

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }
   
}
