
package bai3;

public class SanPham {
    private String tenSp;
    private double gia;
    
    public SanPham(){
        
    }
    public SanPham(String tenSp, double gia){
        this.tenSp =tenSp;
        this.gia =gia;
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

}
