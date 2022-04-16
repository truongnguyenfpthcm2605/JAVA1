package javatesst;

public class TestComparable implements Comparable<TestComparable> {
    public static void main(String[] args) {
        TestComparable ts = new TestComparable("ps2", "Nguyen van troung", "it17320", 9);
        TestComparable te = new TestComparable("ps2", "Nguyen van trung", "it17320", 10);
       
        System.out.println(ts.compareTo(te));
        System.out.println( ts.toString());
        
        
    }

    private String maSv;
    private String hoTen;
    private String lop;
    private double diem;

    public TestComparable(String maSv, String hoTen, String lop, double diem) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.lop = lop;
        this.diem = diem;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public int compareTo(TestComparable sv) {
        return(int)(this.diem - sv.diem);

    }

    @Override
    public String toString() {
        return "TestComparable{" + "maSv=" + maSv + ", hoTen=" + hoTen + ", lop=" + lop + ", diem=" + diem + '}';
    }
    
}
