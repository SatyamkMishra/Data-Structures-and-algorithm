/*Given a string s, you can transform every letter individually to be lowercase or uppercase to create another string.

Return a list of all possible strings we could create. Return the output in any order.

 

Example 1:

Input: s = "a1b2"
Output: ["a1b2","a1B2","A1b2","A1B2"]
Example 2:

Input: s = "3z4"
Output: ["3z4","3Z4"]
  */
import java.util.*;

public class Letter_Case_Possibilities {

    public static void letterPos(String s, int i,List<String> l , StringBuilder st){
        if(i==s.length()){
            l.add(st.toString());
            return;
        }
        
        char c = s.charAt(i);
         
        if(Character.isLetter(c)){
            st.append(Character.toLowerCase(c));
            letterPos(s, i+1, l, st);
            st.deleteCharAt(st.length()-1);
            st.append(Character.toUpperCase(c));
            letterPos(s, i+1, l, st);
            st.deleteCharAt(st.length()-1);
        }else{
            st.append(c);
            letterPos(s, i+1, l, st);
            st.deleteCharAt(st.length()-1);
        }
    }
    public static void main(String[] args) {
        String s = "a1b2";
        List<String> l = new ArrayList<>();
        letterPos(s,0,l , new StringBuilder());
        System.out.println(l);
        
    }
}
