public class Tiling_prob {
    public static int t(int n){
        if(n==0 || n==1){
            return 1;
        }

        int vert = t(n-1);

        int hori = t(n-2);

        return vert + hori;
    }
    public static void main(String[] args){
        System.out.println(t(4));
    }
}
