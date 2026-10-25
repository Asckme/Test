package exercise.one;

import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        java_3_1 exercise = new java_3_1();

        System.out.println("第一题：");
        exercise.one(n);

        System.out.println("第二题：");
        double a= scanner.nextInt();
        exercise.two(a);

        System.out.println("第三题：");
        int su[] = new int[3];
        for (int i = 0; i < 3; i++) {
            su[i] =scanner.nextInt();
        }
        exercise.three(su);

    }
}