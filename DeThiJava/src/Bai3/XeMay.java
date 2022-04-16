
package Bai3;

public class XeMay extends  PhuongTien{
    private double conSuat;

    public XeMay(String id, String hangSx, int namSx, double giaBan, String mauXe, double conSuat) {
        super(id, hangSx, namSx, giaBan, mauXe);
        this.conSuat =conSuat;
    }

    public double getConSuat() {
        return conSuat;
    }

    public void setConSuat(double conSuat) {
        this.conSuat = conSuat;
    }
    @Override
    public void xuat(){
        System.out.printf("%-10s %-10s %-10d %-10.1f %-10s %.1f \n",getId(),getHangSx(),getNamSx(),getGiaBan(),getMauXe(),getConSuat());
    }
    
    
    
}
