class Substring_count_1st_last_similar_char{
    public static int n(String s, int i, int j,int n){
        if(n==1){
            return 1;
        }
        if(n<=0){
            return 0;
        }

        int res = n(s,i+1,j,n-1)+n(s,i,j-1,n-1)-n(s,i+1,j-1,n-2);

        if(s.charAt(i)==s.charAt(j)){
            res++;
        }
        return res;
    }
    public static void main(String[] args){
        String s = "abcab";
        System.out.println(n(s,0,s.length()-1,s.length()));
    }
    
}