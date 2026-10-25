package exercise.three;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Java_3_3 e = new Java_3_3();

        System.out.println("first:");
        Scanner scanner =new Scanner(System.in);
        double n =scanner.nextInt();
        e.one(n);

        System.out.println("Second:");
        int m=scanner.nextInt();
        int[] arr= new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = scanner.nextInt();
        }
        e.two(arr);

        System.out.println("Third:");
        int s=scanner.nextInt(),a=scanner.nextInt();
        e.three(s,a);
    }
}
