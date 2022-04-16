package BAI3;

import java.util.Scanner;

public class SinhVien {

    private String hoTen;
    private String email;
    private String sdt;
    private String cmnd;

    public SinhVien(String hoTen, String email, String sdt, String cmnd) {
        this.hoTen = hoTen;
        this.email = email;
        this.sdt = sdt;
        this.cmnd = cmnd;
    }

    public SinhVien() {
    }
    

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        do {

            System.out.print("Nhap ho va ten:");
            hoTen = sc.nextLine();
            if (hoTen == null || hoTen.isEmpty()) {
                System.out.println("Khong hop le");
            } else {
                break;
            }
        } while (true);
        Data data = new Data();
        do {
            sc = new Scanner(System.in);
            System.out.print("Nhap email :");
            email = sc.nextLine();
            if (data.ktEmail(email)) {
                break;
            }
            System.out.println("Khong hop le");

        } while (true);
        do {
            sc = new Scanner(System.in);
            System.out.print("Nhap So dien thoai :");
            sdt = sc.nextLine();
            if (data.ktsdt(sdt)) {
                break;
            }
            System.out.println("Khong hop le");

        } while (true);
        do {
            sc = new Scanner(System.in);
            System.out.print("Nhap cmnd :");
            cmnd = sc.nextLine();
            if (data.ktCmnd(cmnd)) {
                break;
            }
            System.out.println("Khong hop le");
        

        } while (true);

    }
    public void xuat(){
        System.out.printf("%-20s %-30s %-20s %s\n",getHoTen(),getEmail(),getSdt(),getCmnd());
    }

}
