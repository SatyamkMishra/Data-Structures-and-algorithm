public class Friends_pairing {

    public static int pair(int n){
        if(n==1 || n==2){
            return n;
        }

        int single = pair(n-1);
        int paired = (n-1)*pair(n-2);

        return single+paired;
    }
    public static void main(String[] args){
        System.out.println(pair(3));
    }
}
