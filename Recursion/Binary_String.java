public class Binary_String {
    public static void w(int n,int lastP,String s){
        if(n==0){
            System.out.println(s);
            return;
        }

        w(n-1,0,s+"0");
        if(lastP==0){
            w(n-1,1,s+"1");
        }
    }
    public static void main(String[] args){
        w(3,0,"");
    }
}
