public class Power {
    public static int square(int num , int pow){
        if(pow==0){
            return 1;
        }

        return num*square(num, pow-1);
    }
    public static void main(String[] args){
        System.out.println(square(2,4));
    }
}
