package exercise.twe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Java_3_2 exercise = new Java_3_2();
        Scanner scanner =new Scanner(System.in);

        System.out.println("Number one:");
        exercise.first(3);

        System.out.println("Number two:");
        int arr[]= new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = scanner.nextInt();
        }
        exercise.sceond(arr);

        System.out.println("Number three");
        exercise.thrid(23);
    }
}
