package exercise.nine_eight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println("first:");
        Java_four_3 e = new Java_four_3();
        e.one();

        System.out.println("second:");
        Scanner scanner = new Scanner(System.in);
        double M = scanner.nextInt();
        int N = scanner.nextInt();e.two(M,N);

        System.out.println("three:");
        int day = scanner.nextInt();
        System.out.println(e.three(day));
    }
}
