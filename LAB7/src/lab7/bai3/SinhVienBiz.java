
package lab7.bai3;

public class SinhVienBiz extends SinhVienPoly{
    private  double marketing;
    private double sales;

    public SinhVienBiz(String hoTen,double marketing,double sales) {
        super(hoTen,"Biz");
        this.marketing = marketing;
        this.sales = sales;
    }

    public double getMarketing() {
        return marketing;
    }

    public void setMarketing(double marketing) {
        this.marketing = marketing;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }
    
    

    @Override
    public double getDiem() {
        double diem = (2*marketing + sales)/3;
        return diem;
    }
    
    
}
