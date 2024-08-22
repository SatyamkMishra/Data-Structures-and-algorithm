import java.util.*;
public class Longest_prefix {
    public static String pe(String[] s){
      StringBuilder n = new StringBuilder();
     Arrays.sort(s);
     String f = s[0];
     String l = s[s.length-1];
     for(int i=0;i<Math.min(f.length() , l.length());i++){
        if(f.charAt(i)!=l.charAt(i)){
            return n.toString();
        }
        n.append(f.charAt(i));
     }
     return n.toString();
    }
    public static void main(String[] args){
      String[] s = {"flower","flow","flight"};
     
      System.out.println(pe(s));
    }
}
