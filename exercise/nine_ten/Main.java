package exercise.nine_ten;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Exercise exercise =new Exercise();
        Scanner scanner = new Scanner(System.in);

        System.out.println("first:");
        int n=scanner.nextInt();
        int a=scanner.nextInt();
        exercise.One(n,a);

        System.out.println("Second:");
        int n1=scanner.nextInt();
        int[] arr= new int[n1];
        for (int i = 0; i < n1; i++) {
            arr[i] = scanner.nextInt();
        }
        int m= scanner.nextInt();
        exercise.Two(n1,arr,m);

        System.out.println("Third:");
        int q1=scanner.nextInt();
        int q2=scanner.nextInt();
        int[] w1=new int[q1];
        int[] w2= new int[q2];
        for (int i = 0; i < q1; i++) {
            w1[i] =scanner.nextInt();
        }
        for (int i = 0; i < q2; i++) {
            w2[i]= scanner.nextInt();
        }
        exercise.Three(q1,q2,w1,w2);
    }
}
