public class Clear_ith_bit {
    public static int i(int n , int position){
        int b = ~(1<<position);
            return n&b;
        }
    
    public static void main(String[] args){
        //10---1010---after clear ---1000==8
        System.out.println(i(10,1));

        System.out.println(i(25,3));

        System.out.println(i(5,1));    }
}
