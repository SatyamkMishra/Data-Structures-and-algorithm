public class Divide_without_divide_sign {
    public static int divide(int dividend, int divisor){
        int res = 0;
        
        if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        int sign = (dividend>0)==(divisor>0) ? 1:-1;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        
        while(dividend-divisor>=0){
            int count=1;
            int temp = divisor;
            while(dividend-(temp<<1)>=0){
                temp<<=1;
                count<<=1;
            }
            res+=count;
            dividend-=temp;
        }
        return sign*res;
    }
    public static void main(String[] args) {
        System.out.println(divide(10,3));
    }
}
