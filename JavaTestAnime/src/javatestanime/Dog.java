/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatestanime;

public class Dog extends Anime {

    public Dog(String ten, int sochan) {
        super("Dog", sochan);
    }
    public Dog(){
        
    }

    @Override
    public void xuat() {
        System.out.printf("%-20s %-10d %-20s %s\n", getTen(), getSochan(),Move(),bark());
    }

    @Override
    public String Move() {
        return "di bang 4 chan";
    }

    @Override
    public String bark() {
        return "Gau Gau";
    }

}
