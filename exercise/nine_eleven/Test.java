package exercise.nine_eleven;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    void testOne(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m= scanner.nextInt();
        int sum =0;
        for (int i = 1; i <= n; i++) {
            if(i == m)sum=i+1;
        }
        System.out.println(sum);
    }
    void testTwo(){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] result = new int[N];
        int count =0;
        for (int i = 0; i < N; i++) {
            boolean ps = false;
            for (int j = 0; j < count; j++) {
                if(arr[j] == arr[i]){
                    ps =true;
                    break;
                }
            }
            if(!ps){
                result[count] = arr[i];
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            if(result[i] != 0) System.out.print(result[i]+" ");
        }
        scanner.close();
    }

    void testThree(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*(n-i-1)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
