import java.util.*;
class Reverse_String{

    public static String reverse(String s){

        Stack<Character> st = new Stack<>();

        int i=0;
        while(i<s.length()){
            st.push(s.charAt(i));
            i++;
        }

        StringBuilder result = new StringBuilder("");
        while(!st.isEmpty()){
            char ch = st.pop();
             result.append(ch);
        }
        return result.toString();
        
    }
    public static void main(String[] args){
        

        System.out.println(reverse("Stayam"));
    }
}