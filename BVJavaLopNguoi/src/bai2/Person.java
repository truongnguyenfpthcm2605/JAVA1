package bai2;

import java.util.Scanner;

public class Person {

    private String name;
    private int yearOfBirth;

    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public Person() {
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ten: ");
        setName(sc.nextLine());
        sc = new Scanner(System.in);
        System.out.print("Nhap vao nam sinh:");
        setYearOfBirth(sc.nextInt());

    }
    public int getAge(){
        return 2022- getYearOfBirth();
    }
    public void output(){
        System.out.println("Ho va ten : "+ getName());
        System.out.println("Nam sinh : "+ getYearOfBirth());
        System.out.println("Tuoi: "+ getAge());
        
       
    }
 

}
