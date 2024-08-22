import java.util.Arrays;

public class Anagram {
    public static boolean a(String s1, String s2){
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        
        if(s1.length() == s2.length()) {
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            
            return Arrays.equals(c1, c2);
        }
        
        return false;
    }
    
    public static void main(String args[]){
        String s1 = "race";
        String s2 = "acer";
        System.out.println(a(s1, s2));
    }
}
