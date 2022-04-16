
package demomang;

import java.util.Arrays;


public class DemoMang {

    
    public static void main(String[] args) {
        int[] array = {1,2,3};
        System.out.println(Arrays.toString(array));
        int[] mang = new int[array.length];
        System.arraycopy(array, 0, mang, 0, mang.length);
        System.out.println(Arrays.toString(mang));
        int[] mang2 = array.clone();
        System.out.println(Arrays.toString(mang2));
    }
    
}
