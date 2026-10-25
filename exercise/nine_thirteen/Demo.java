package exercise.nine_thirteen;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("first:");
        testOne();
        System.out.println("second:");
        testTwo();
        System.out.println("three:");
        testThree();
    }
    public static void testOne(){
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }

    public static void testTwo(){
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int[][] result= new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[j][n-1-i] = arr[i][j];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void testThree(){
        int n = scanner.nextInt();
        int arr[][] = new int[n][n];
        int j=0;
        for (int i = 0; i < n; i++) {
            arr[i][0]= 1;
            for (j = 1; j <=i; j++) {
                arr[i][j] = arr[i-1][j]+arr[i-1][j-1];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i+1; k++) {
                System.out.print(arr[i][k]+" ");
            }
            System.out.println();
        }
    }
}
