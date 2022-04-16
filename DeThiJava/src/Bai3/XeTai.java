
package Bai3;

public class XeTai extends PhuongTien{
    private double trongTai;

    public XeTai( String id, String hangSx, int namSx, double giaBan, String mauXe,double trongTai) {
        super(id, hangSx, namSx, giaBan, mauXe);
        this.trongTai = trongTai;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }
    @Override
    public void xuat(){
        System.out.printf("%-10s %-10s %-10d %-10.1f %-10s %.1f \n",getId(),getHangSx(),getNamSx(),getGiaBan(),getMauXe(),getTrongTai());
    }
    
    
    
    
}
