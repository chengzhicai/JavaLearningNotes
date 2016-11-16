package Test;

import java.util.Scanner;

/**
 * Created by chengzhicai on 2016/11/9.
 */
public class TestInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(true){
            count++;//表示输入的次数
            System.out.println("请输入num1：");
            int num1 = sc.nextInt();
            System.out.println("请输入num2：");
            int num2 = sc.nextInt();
            System.out.println(num1*num2);
            if (count==5){
                break;
            }
        }
        System.out.println("5次结束了");
    }
}
