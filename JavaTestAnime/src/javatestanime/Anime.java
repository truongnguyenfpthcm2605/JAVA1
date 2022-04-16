
package javatestanime;

import java.util.Scanner;


public abstract class Anime {
   private  String ten;
   private int sochan;

    public Anime(String ten, int sochan) {
        this.ten = ten;
        this.sochan = sochan;
    }

    public Anime() {
    }
    

   

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSochan() {
        return sochan;
    }

    public void setSochan(int sochan) {
        this.sochan = sochan;
    }
   
   public void nhap(){
      Scanner sc =new Scanner(System.in);
       System.out.print("Nhap vao ten:");
       setTen(sc.nextLine());   
       sc =new Scanner(System.in);
       System.out.print("Nhap vao so chan: ");
       setSochan(sc.nextInt());
   }
   public void xuat(){
       System.out.printf("%-20s %d\n",getTen(),getSochan());
   }
   public abstract String Move();
   public abstract String bark();
   
   
       
   
}
