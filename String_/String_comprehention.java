import java.util.*;
public class String_comprehention{
    public static String str(String s){
        String st = "";
        for(int i=0;i<s.length();i++){
            Integer count = 1;
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                count++;
                i++;
            }
            st+=s.charAt(i);
            if(count>1){
                st+=count.toString();
            }
        }
        return st;
    }
    public static void main(String[] args){
        String s = "aaabbbcccdd";
        System.out.println(str(s));
    }
}