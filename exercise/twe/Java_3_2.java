package exercise.twe;

public class Java_3_2 {
    public void first(double n){
        System.out.printf("%.2f\n",n*n-3.14*(n/2)*(n/2));
    }

    public void sceond(int arr[]){
        int max = arr[0];
        for (int i = 1; i <arr.length; i++) {
            if(max<arr[i])max = arr[i];
        }
        System.out.println(max);
    }

    public void thrid(int n){
        if(n<0)return ;
        System.out.println((n<=10)?n*6:(n<=20)?(n-10)*2+60:(60+20+(n-20)));
    }
}
