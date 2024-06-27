public class Pascal_find_at_position {
    public static int combination(int n,int r){
        int ans = 1;
        for(int i=0;i<r;i++){
            ans*=(n-i);
            ans/=i+1;
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println(combination(5, 3));
    }
}