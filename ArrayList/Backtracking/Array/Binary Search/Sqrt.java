import java.util.*;
public class Sqrt{
    public static int tempsol(int n ){
        int s = 0;
        int e = n;
        int ans = 0;
        int mid;
        while(s<=e){
            mid = (s+e)/2;
            if(mid*mid == n){
                return mid;
            }
            if((mid*mid)<n){
                ans=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;
    }
    public static double morepresize(int n , int presize,int tempsol){
        double factor = 1;
        double ans = tempsol;

        for(double i=0;i<presize;i++){
            factor = factor/10;
            for(double j=ans;j*j<n;j=j+factor){
                ans = j;
            }
        }
        return ans;
    }


    public static void main(String[] args){
        int t = 101;
        int p = tempsol(t);
        System.out.println(p);
        System.out.println(morepresize(t,3,p));
    }
}