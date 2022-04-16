
package BAI3;

public class Data {
    public boolean ktEmail(String e){
        String parttern = "^\\w{3,}@\\w{2,}(\\.[a-zA-Z]{2,3}){1,2}$";
        return e.matches(parttern);
    }
    public boolean ktsdt(String s){
        String parttern = "0[932]\\d{8,9}";
        return s.matches(parttern);
    }
    public boolean ktCmnd(String c){
        String parttern = "\\d{9,12}";
        return c.matches(parttern);
        
    }
}
