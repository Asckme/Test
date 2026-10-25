package exercise.nine_nine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Exercise exercise = new Exercise();

        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        System.out.println("first:");
        exercise.testOne(n,arr,m);

        System.out.println("Second:");
        int n1=scanner.nextInt();
        exercise.testTwo(n1);

        System.out.println("Third:");
        int n2= scanner.nextInt();
        exercise.testThree(n2);
    }

}
