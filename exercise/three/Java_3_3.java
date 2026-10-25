package exercise.three;

public class Java_3_3 {
    public void one(double n){
        if(n<0)return ;
        System.out.println((n/1.2>(n/3+50))?"骑车":"走路");
    }

    public void two(int[] arr){
        double sum=0;
        for(int i: arr){
            sum+=i;
        }
        System.out.printf("%.2f\n",sum/arr.length);
    }

    public void three(int n,int a){
        long result=0;
        long temp = 0;
        for (int i = 0; i < n; i++) {
            temp=temp*10+a;
            result+=temp;
        }
        System.out.println("Sn = "+result);
    }
}
