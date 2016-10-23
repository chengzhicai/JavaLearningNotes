package Test;

//import java.util.Scanner;
import java.util.*;


/**
 * Created by chengzhicai on 2016/10/11.
 */
public class Palindrome {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入： ");
            String word = sc.next();
            int i = word.length();
            int j = 0;
            while (j <= (i / 2) -1 && word.charAt(j) == word.charAt(i - j - 1))
                j++;
            if (j == i / 2)
                System.out.println("是回文数");
            else
                System.out.println("不是回文数");
           sc.close();
        }
    }
}
