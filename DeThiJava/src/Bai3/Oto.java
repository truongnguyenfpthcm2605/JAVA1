
package Bai3;

public class Oto extends PhuongTien{
    private int choNgoi;
    private String kieuDongCo;

    public Oto( String id, String hangSx, int namSx, double giaBan, String mauXe,int choNgoi, String kieuDongCo) {
        super(id, hangSx, namSx, giaBan, mauXe);
        this.choNgoi = choNgoi;
        this.kieuDongCo = kieuDongCo;
    }

    public int getChoNgoi() {
  
        return choNgoi;
    }

    public void setChoNgoi(int choNgoi) {
        this.choNgoi = choNgoi;
    }

    public String getKieuDongCo() {
        if(this.kieuDongCo ==null){
            return " ";
        }
        return kieuDongCo;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }
    @Override
    public void xuat(){
        System.out.printf("%-10s %-10s %-10d %-10.1f %-10s %-10d %s \n",getId(),getHangSx(),getNamSx(),getGiaBan(),getMauXe(),getChoNgoi(),getKieuDongCo());
    }
    

    
    
    
    
}
