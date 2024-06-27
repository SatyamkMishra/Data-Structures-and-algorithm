public class Odd_even {
    public static void o(int n){
        int d = 1;
        if((n&d)==0){
            System.out.println(n + " is even");
        }
        else{
            System.out.println(n + " is odd");
        }


    }
    public static void main(String[] args){
        o(5);
        o(0);
    }
}
