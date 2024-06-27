public class Get_ith_bit {
    public static int i(int n,int position){
        int d = (1<<position);

        if((n&d)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args){
        //5---101
        System.out.println(i(5,1));

        System.out.println(i(25,3));
    }
}
