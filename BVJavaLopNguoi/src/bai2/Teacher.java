package bai2;

import java.util.Scanner;

public class Teacher extends Person {

    private double saLaRy;

    public Teacher(String name, int yearOfBirth, double saLaRy) {
        super(name, yearOfBirth);
        this.saLaRy = saLaRy;
    }

    public Teacher() {
    }
    
    

    public double getSaLaRy() {
        return saLaRy;
    }

    public void setSaLaRy(double saLaRy) {
        this.saLaRy = saLaRy;
    }

    public double getVAT() {
        if (saLaRy > 10000) {
            return (saLaRy - 10000) * 0.1;
        } else if (saLaRy > 15000) {
            return (saLaRy - 15000) * 0.15;
        }
        return 0;
    }

    public double getEarning() {
        return saLaRy - getVAT();
    }
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ten: ");
        setName(sc.nextLine());
        sc = new Scanner(System.in);
        System.out.print("Nhap vao nam sinh:");
        setYearOfBirth(sc.nextInt());
        sc = new Scanner(System.in);
        System.out.print("Nhap vao luong:");
        setSaLaRy(sc.nextDouble());

    }

    @Override
    public void output(){
        System.out.print("Ho va ten: "+ getName()+"\t");
        System.out.print("Nam sinh: "+ getYearOfBirth()+"\t");
        System.out.print("Tuoi:"+ getAge()+"\t");
        System.out.print("Luong:"+ getSaLaRy()+"\t");
        System.out.print("Thue:"+ getVAT()+"\t");
        System.out.println("Thu nhap:"+ getEarning());
        
       
    }

}
