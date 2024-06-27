public class Update_ith_bit{
    public static int i(int n, int position, int u_value){
          if(u_value==1){
            int d = (1<<position);
            return n|d;
          }

          if(u_value==0){
            int d = ~(1<<position);
            return d&n;
          }
          return 0;
    }
    public static void main(String[] args){
        System.out.println(i(10,1,0));
    }
}