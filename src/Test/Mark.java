package Test;

import java.util.Arrays;

/**
 * Created by chengzhicai on 2016/9/29.
 */
public class Mark {
    public static void main(String[] args) {
        int[] Arr = new int[]{1,98,27,10,200,999,300};


        for (int number : Arr) {
            System.out.println("Number = " + number);
        }
        System.out.println("...........................");
        Arrays.sort(Arr,1,7);
        Arr = Arrays.copyOfRange(Arr,1,6);
        for (int number : Arr) {
            System.out.println("Number = " + number);
        }

        /*int N = Arr.length;
        int[] Arr1 = new int[N];

        for(int i = 0 ; i < N;i++) {
            Arr1[i] = Arr[i];//复制一个新的数组
        }
        Arr1 = Arrays.copyOfRange(Arr,1,18);//拿掉最大最小的数
        System.out.print("排序后：----------- ");

        for(int i=0;i<Arr.length;i++){

            System.out.print(Arr[i] + "\t");

        }
        System.out.println();
        System.out.print("拿掉最大最小的数后：");
        for(int i=0;i<Arr1.length;i++){
            System.out.print(Arr1[i] + "\t");
        }
        System.out.println();
        double sum = 0.0;
        for(int i=0;i<Arr1.length;i++){
            sum += Arr1[i];
        }
        System.out.println("总和为：----------- " + sum);
        double average = sum/(Arr1.length);
        System.out.println("平均数为：--------- "+average);*/

    }
}
