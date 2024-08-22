import java.util.*;
public class Reverse_word{
    public static String rev(String s){
        String result = new String();
        int i = 0;
        int n = s.length();
        while(i<n){
            while(i<n && s.charAt(i)==' '){
                i++;
            }
            if(i>=n){
              break;
                }

            int j = i+1;
            while(j<n && s.charAt(j)!=' '){
                j++;
            }
            String r = s.substring(i,j);
            if(result.length()==0){
                result = r;
            }
            else{
                result = r + " " + result;
                 
            }
           i=j+1;
            
        }
        return result;
    }
    public static void main(String[] args){
        String s = "i am satyam  ";
        System.out.println(rev(s));
    }
}