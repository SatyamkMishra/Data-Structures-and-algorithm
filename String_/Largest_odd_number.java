public class Largest_odd_number{
    public static String lar(String s){
        for(int i=s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            if(c%2==1){
                return s.substring(0,i+1);
            }
        }
        return "";
    }
    public static void main(String[] args){
        String s = "345680";
        System.out.println(lar(s));
    }
}