package exercise.one;

import java.util.Scanner;

public class java_3_1 {

    public void one(int n){
        System.out.println("个位："+n%10+"\n十位："+n/10%10+"\n百位："+n/100);
    }

    public void two(double n){
        System.out.println((n/1.2 < n/3+50) ? "走路":"骑车");
    }

    public void three(int []su){
        int max = su[0];
        for(int i=1;i<su.length;i++){
            if(su[i]>max)max=su[i];
        }
        System.out.println(max);
    }
}
