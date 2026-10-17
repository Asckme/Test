package exercise.nine_nine;

import java.util.Scanner;

public class Exercise {
    public void testOne(int n,int[] arr,int m){
        m= m % n;
        assistOne(0,n-m-1,arr);
        assistOne(n-m,n-1,arr);
        assistOne(0,n-1,arr);
        for(int i:arr){
            System.out.printf("%d ",i);
        }
        System.out.println();
    }
    void assistOne(int start,int end,int[] arr){
        while(end >= start){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            end--;
            start++;
        }
    }

    public void testTwo(int n){
        for(int i=0;i<=n;i++){
            if(ps(i)==1){
                System.out.println(i);
            }
        }
    }
    int ps(int n){
        if(n<=1)return 0;
        else if (n==2)return 1;
        else if(n%2==0)return 0;

        for(int i=3;i<=Math.sqrt(n);i+=2){
            if(n%i==0)return 0;
        }
        return 1;
    }

    public void testThree(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <2*i+1 ; j++) {
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
