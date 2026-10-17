package exercise.nine_twelve;

import java.util.Random;
import java.util.Scanner;

public class nine_12 {
    public Scanner scanner = new Scanner(System.in);

    void testOne(){
        int n= scanner.nextInt();
        scanner.close();
        int start = 0;
        int end =100;
        while((start+end)/2!=n){
            int mid =(start+end)/2;
            if(mid>n){
                System.out.print(mid);
                System.out.println(" 大");
                end = mid;
            }
            else {
                System.out.print(mid);
                System.out.println(" 小");
                start =mid;
            }
        }
        System.out.println((start+end)/2+"正确");
    }

    void test2(){
        int n =scanner.nextInt();
        int m =scanner.nextInt();
        scanner.close();
        int res = 0;
        for (int i = 2; i <= n; i++) {
            res = (res+m)%i;
        }
        System.out.println(res+1);
    }

    void test3(){
        int n =scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] =scanner.nextInt();
        }
        scanner.close();

        int[] result = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean ps =false;
            for (int j = 0; j < count; j++) {
                if(arr[i] == arr[j]){
                    ps =true;
                    break;
                }
            }
            if(!ps){
                result[count] = arr[i];
                count++;
            }
        }
        for (int i = 0; i < n; i++) {
            if(result[i]!=0){
                System.out.print(result[i]+" ");
            }
        }
    }
}
