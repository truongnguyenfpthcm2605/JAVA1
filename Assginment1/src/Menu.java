
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose;
        String text = "y";
        Menu m = new Menu();

        do {

            System.out.println("____________________Menu______________________________________________");
            System.out.println("\t1.Nhap danh sach sinh vien tu ban phim");
            System.out.println("\t2.Xuat danh sach sinh vien ra man hinh");
            System.out.println("\t3.Tim va hien thi nhan vien theo ma nhap tu ban phim");
            System.out.println("\t4.Xoa nhan vien theo ma nhap tu ban phim");
            System.out.println("\t5.Cap nhat thong tin nhan vien theo ma nhap tu ban phim");
            System.out.println("\t6.Tim cac nhan vien theo khoang luong nhap va tu ban phim");
            System.out.println("\t7.Sap xep nhan vien theo ho va ten");
            System.out.println("\t8.Sap xep nhan vien theo thu nhap ");
            System.out.println("\t9.Xuat 5 nhan vien co thu nhap cao nhat");
            System.out.println("\t10.Thoat chuong trinh");
            System.out.println("______________________________________________________________________");
            System.out.print("chon chuc nang tu 1 - 10: ");
            choose = sc.nextInt();

            switch (choose) {
                case 1:
                    m.nhap();
                    break;
                case 2:
                    m.xuat();

                    break;
                case 3:
                    m.timTheoMa();
                    break;
                case 4:
                    m.xoaTheoMa();
                    break;
                case 5:
                    m.capNhatThongTin();
                    break;
                case 6:
                    m.timTheoLuong();
                    break;
                case 7:
                    m.SXhoTen();
                    break;
                case 8:
                    m.SxthuNhap();
                    break;
                case 9:
                    m.thuNhapCaoNhat();
                    break;
                case 10:
                    sc = new Scanner(System.in);
                    System.out.println("Ban co chat muon thoat khong, nhap 'y' de thoat");
                    text = sc.nextLine();
                    if (text.equalsIgnoreCase("y")) {
                        System.out.println("Thoát chương trình thành công");
                        System.exit(0);
                    }
                default:
                    System.out.println("Nhập từ 1-10 ");

            }
        } while (true);

    }

    ArrayList<NhanVien> list = new ArrayList<>();

    public NhanVien nhap1nv() {
        String chon;

        NhanVien nv;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Nhân Viên\t Tiếp Thị\t Trưởng Phòng\t (nv,tt,tp): ");
        chon = sc.nextLine();
        sc = new Scanner(System.in);
        System.out.print("Nhập ma nhan vien: ");
        String maNv = sc.nextLine();
        sc = new Scanner(System.in);
        System.out.print("Nhập Tên: ");
        String ten = sc.nextLine();
        sc = new Scanner(System.in);
        System.out.print("Nhập lương: ");
        double luong = sc.nextDouble();
        if (chon.equalsIgnoreCase("nv")) {
            nv = new NhanVien(maNv, ten, luong);
        } else if (chon.contentEquals("tt")) {

            sc = new Scanner(System.in);
            System.out.print("Nhâp Doanh So:");
            double doanhSo = sc.nextDouble();
            sc = new Scanner(System.in);
            System.out.print("Nhâp Huê Hồng: ");
            double hh = sc.nextDouble();
            nv = new TiepThi(maNv, ten, luong, doanhSo, hh);

        } else {
            sc = new Scanner(System.in);
            System.out.print("Nhâp Trach Nhiem:");
            double trachNhiem = sc.nextDouble();
            nv = new TruongPhong(maNv, ten, luong, trachNhiem);
        }
        return nv;

    }

    public void nhap() {
        String stop = "y";
        System.out.println("Nhap danh sach sinh vien tu ban phim");
         Scanner sc = new Scanner(System.in);
        do {
           
            NhanVien nv = nhap1nv();
            list.add(nv);
            sc = new Scanner(System.in);
            System.out.printf("chọn y/n để tiếp tục : ");
            stop = sc.nextLine();
            if (stop.equalsIgnoreCase("n")) { 
                System.out.println("Nhập dữ liệu thành công");
                break;
            }

        } while (true);

    }

    public void xuat() {

        System.out.printf("%-10s %-10s %-10s %-10s %s\n", "Mã", "Tên", "Luong", "Thuế", "Thu Nhập");
        for (NhanVien item : list) {

            item.xuatThongTin();

        }

    }

    public void timTheoMa() {
        System.out.println("Tim va hien thi nhan vien theo ma nhap tu ban phim");
        int idx = find();
        if (idx >= 0) {
            list.get(idx).xuatThongTin();
        } else {
            System.out.println("Không tim thấy");
        }

    }

    public void xoaTheoMa() {
        System.out.println("Xoa nhan vien theo ma nhap tu ban phim");
        int idx = find();
        if (idx >= 0) {
            list.remove(idx);
            System.out.println("Xoa Thanh Công");
        } else {
            System.out.println("Không tim thấy");
        }

    }

    public void capNhatThongTin() {
        System.out.println("Cap nhat thong tin nhan vien theo ma nhap tu ban phim");
        int idx = find();
        if (idx >= 0) {
            list.set(idx, nhap1nv());
            System.out.println("cập Nhật thanh Công");
        } else {
            System.out.println("Không Tim thấy");
        }
    }

    public void timTheoLuong() {
        System.out.println("Tim cac nhan vien theo khoang luong nhap va tu ban phim");

        double star, end;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Luong bắt đầu :");
            star = sc.nextDouble();
            System.out.print("Luong kết Thuc: ");
            end = sc.nextDouble();
            if (star < end) {
                break;
            }
        } while (true);

        for (NhanVien item : list) {
            if (item.getThuNhap() >= star && item.getThuNhap() <= end) {
                item.xuatThongTin();
            }
        }
    }

    public void SXhoTen() {
        System.out.println("Sap xep nhan vien theo ho va ten");
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getHoVaTen().compareTo(o2.getHoVaTen());

            }
        };
        Collections.sort(list, comp);

        xuat();
    }

    public void SxthuNhap() {
        System.out.println("Sap xep nhan vien theo thu nhap ");
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                if (o1.getThuNhap() > o2.getThuNhap()) {
                    return 1;
                }
                return -1;

            }
        };
        Collections.sort(list, comp);
        xuat();
    }

    public void thuNhapCaoNhat() {
        System.out.println("Xuat 5 nhan vien co thu nhap cao nhat");
        Comparator<NhanVien> com = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                if (o1.getThuNhap() > o2.getThuNhap()) {
                    return 1;
                }
                return -1;

            }
        };
        Collections.sort(list, com);
        Collections.reverse(list);
        
        int i = 0;
        for (NhanVien item : list) {
            if (i >= 5) {
                break;
            }
            System.out.printf("%-10s %-10s %-10.1f %-10.1f %.1f\n", item.getMaNV(), item.getHoVaTen(), item.getLuong(), item.getThueTN(), item.getThuNhap());
            i++;
        }
    }

    public int find() {
        Scanner sc = new Scanner(System.in);
        String find;
        int idx = -1;
        System.out.print("Nhập ma nhan vien: ");
        find = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaNV().equalsIgnoreCase(find)) {
                idx = i;
            }
        }

        return idx;

    }
}
