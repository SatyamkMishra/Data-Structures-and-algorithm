
public class Count_good_no {
    
    public static int c(int n){
        int even = (n+1)/2;
        int odd = n/2;

        return pow(5,even)*pow(4,odd);
    }

    public static int pow(int x, int n){
        if(n==0){
            return 1;
        }

        int temp = pow(x,n/2);

        if(n%2==0){
            return temp*temp;
        }
        else{
            return x*temp*temp;
        }
    }

    public static long pow(int x , int n){
       
    }
    public static void main(String[] args){
        System.out.println(c(4));
    }
}
