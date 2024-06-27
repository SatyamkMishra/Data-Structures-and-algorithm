public class Set_ith_bit {
    public static int i(int n , int position){
        int b = (1<<position);
            return n|b;
        }
    
    public static void main(String[] args){
        //5---101---after set ---111==7
        System.out.println(i(5,1));

        System.out.println(i(25,3));
    }
}
