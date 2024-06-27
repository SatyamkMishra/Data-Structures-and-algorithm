public class Clear_last_ith_bit {

    public static int c(int n, int i){
      int b = (-1<<i);
      return n&b;
    }
    public static void main(String[] args){
        System.out.println(c(15,2));
    }
}
