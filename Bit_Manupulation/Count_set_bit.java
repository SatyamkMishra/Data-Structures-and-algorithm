public class Count_set_bit {
    public static int c(int n){
        int count=0;
        while(n!=0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String[] args){
      int a = 15;
      System.out.println(c(a));
    }
}
