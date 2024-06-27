class Num_to_str{
    static String s[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        
    public static void c(int n){
        if(n==0){
            return;
        }
     
        int l = n%10;
        c(n/10);
        System.out.print(s[l] + " ");
        }
    public static void main(String[] args) {
        c(1234);
}
}