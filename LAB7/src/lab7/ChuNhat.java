
package lab7;


public class ChuNhat {
    private double dai;
    private double rong;

    

    public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }
    public double getChuVi(){
        
        return (getDai()+getRong())*2;
    }
    public double getDienTich(){
        return getDai()*getRong();
    }
    public void xuat(){
        System.out.printf("\tChieu dai:%.1f\tChieu rong:%.1f\tChu vi:%.1f\tDien Tích: %.1f\n",getDai(),getRong(),getChuVi(),getDienTich());
    }


    
    
    
            
}
