package SecondCode;

import java.util.Arrays;

/**
 * Created by chengzhicai on 2016/9/21.
 */

public class SuShu {
    public static void main(String[] args) {
        //boolean tag = true;
        //int i = 1; i <= 9; i++
        int[] a={8,6,2,6,5};
        int[] b= Arrays.copyOf(a,6);

        for (int i = 1; i <= 9; i++) {
            //int j = 1; j <= i; j++
            int j=1;
//            for(;j<i;j++){
//                System.out.print("\t\t");
//            }
            for (; j <= 9; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }

}



//one
//public class SuShu {
//    public static void main(String[] args) {
//
//        for ( int i = 1; i <= 9; i++) {
//
//            for (int j = 1; j <= i; j++) {
//
//                System.out.print(i + "*" + j + "=" + i * j + " ");
//            }
//            System.out.println();
//
//        }
//    }
//
//}
