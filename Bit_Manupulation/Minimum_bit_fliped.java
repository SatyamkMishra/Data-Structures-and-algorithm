public class Minimum_bit_fliped {
    public static int f(int a, int b){
        int count=0;
        int ans = (a^b);

        while(ans!=0)
        {
            if((ans&1)==1){
            count++;
        }
        ans>>=1;
    }
        
        return count;
    }
    public static void main(String[] args){
        System.out.println(f(10,7));
    }
}
