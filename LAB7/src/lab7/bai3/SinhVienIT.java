
package lab7.bai3;

public class SinhVienIT extends SinhVienPoly{
    private double java,html,css;

    public SinhVienIT(double java, double html, double css, String hoTen) {
        super(hoTen, "IT");
        this.java = java;
        this.html = html;
        this.css = css;
    }

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }

    public double getHtml() {
        return html;
    }

    public void setHtml(double html) {
        this.html = html;
    }

    public double getCss() {
        return css;
    }

    public void setCss(double css) {
        this.css = css;
    }
 
    @Override
    public double getDiem() {
        double diem = (2*java + html +css)/4;
        return diem;
    }
    
}
