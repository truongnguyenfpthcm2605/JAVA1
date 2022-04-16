package lab7;

public class Vuong extends ChuNhat {

    private double canh;

    public Vuong(double canh) {
        super(canh, canh);
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    @Override
    public double getChuVi() {

        return 4*getCanh();
    }

    @Override
    public double getDienTich() {
        return Math.pow(canh, 2);
    }

    @Override
    public void xuat() {
        System.out.printf("\tCanh:%.1f\tChu vi:%.1f\tDien Tích: %.1f\n", getCanh(), getChuVi(), getDienTich());
    }

}
