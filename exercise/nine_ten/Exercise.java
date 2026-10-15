package exercise.nine_ten;

public class Exercise {
    public void One(int n,int a){
        if(n<=1||n>=9||a<1||a>9){
            System.out.println("输入范围错误");
            return ;
        }
        long temp=0;
        long Sn = 0;

        for (int i = 0; i < n; i++) {
            temp=temp*10+a;
            Sn+=temp;
        }

        System.out.println(Sn);
    }

    public void Two(int n,int[] arr,int m){
        m=m%n;
        twoAid(0,n-m-1,arr);
        twoAid(n-m,n-1,arr);
        twoAid(0,n-1,arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    void twoAid(int start,int end,int[] arr){
        while(start<=end){
            int temp =arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void Three(int n1,int n2,int[] a1,int[] a2){
        int[] result = new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(a1[i]<=a2[j]){
                result[k] = a1[i];
                k++;
                i++;
            }
            else {
                result[k] = a2[j];
                k++;
                j++;
            }
        }
        while(i<n1){
            result[k]= a1[i];
            i++;
            k++;
        }
        while (j<n2){
            result[k] = a2[j];
            j++;
            k++;
        }

        for(int y:result){
            System.out.print(y+" ");
        }
    }
}
