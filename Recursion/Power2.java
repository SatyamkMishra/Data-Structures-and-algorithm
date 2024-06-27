public class Power2 {
    public static int sq(int num, int pow){
        if(pow==0){
           return 1;
        }
        int s = sq(num,pow/2);
        int sqr = s*s;
        
        if(pow%2!=0){
            sqr*=num;
        }
        
        return sqr;
    }
    public static void main(String[] args){
        System.out.println(sq(2,4));
    }
}
