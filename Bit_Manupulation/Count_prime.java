import java.util.*;
public class Count_prime {
    public static int p(int n){
        if(n<2){
            return 0;
        }

        boolean a[] = new boolean[n+1];
        Arrays.fill(a,true);
        a[0] = false;
        a[1] = false;

        for(int i=2;i*i<=n;i++){
            for(int j=2*i;j<=n;j+=i){
                a[j] = false;
            }
        }
        int count = 0;
        for(int i=0;i<n;i++){
            if(a[i]==true){
                count++;
            }
        }
        return count;

    }

    //Second method;
    public static int c(int n){
        int count=0;
        boolean a[] = new boolean[n+1];
        
        Arrays.fill(a,true);
        a[0]=false;
        a[1]=false;
        
        for(int i=2;i<=n;i++){
            if(a[i]==true)
            for(int j=i*i;j<=n;j+=i){
                a[j]=false;
            }
        }
        for(int i=0;i<=n;i++){
            if(a[i]==true){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int n = 10;
        System.out.println(p(10));
    }
}
