package exercise.nine_eight;

public class Java_four_3 {
    public void one (){
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.printf("%d * %d = %-4d",j,i,j*i);
            }
            System.out.println();
        }
    }

    public void two(double m,int n){
        if(n==0){
            System.out.println("m  0");
            return ;
        }
        double temp= 2;
        double sum = 0;
        double tempt = m;
        double result_high=0;
        for (int i = 0; i < n; i++) {
            result_high = m/temp;
            sum+=tempt+result_high;
            temp*=2;
            tempt = result_high;
        }
        System.out.printf("%.2f  %.2f\n",result_high,sum);
    }

    public int three(int n){
        if(n==1||n==2) return 1;
        else return three(n-1)+three(n-2);
    }

}
