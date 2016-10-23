package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by chengzhicai on 2016/10/6.
 */
public class AaBbCc {
    public static void main(String[] args) throws Exception{
            ArrayList al = new ArrayList(){};

            al.add("a");
            al.add("b");
            al.add("c");
            al.add("d");
            al.add("e");
            al.add("f");
            al.add("g");
//al.add("b");
            System.out.println(al);
            Collections.reverse(al);
            System.out.println(al);
//            System.out.println(Arrays.toString(i));
//            Arrays.sort(i);
//            System.out.println(Arrays.toString(al));
//            StringBuffer sb = new StringBuffer();

//            Collections.reverse(Arrays.reverse(i));
//            System.out.println();
    }

}
