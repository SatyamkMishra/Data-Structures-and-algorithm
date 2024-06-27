import java.util.*;


class Duplicate_parenthesis{
    public static boolean isDuplicate(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            
            if(c==')'){
                int count = 0;
                while(!st.isEmpty() && st.peek()!='('){
                    count++;
                    st.pop();
                }

                if(count<1){
                    return true;
                }
                else{
                    st.pop();
                }
            }
            else{
                st.push(c);
            }
        }
        return false;
    }
    public static void main(String[] args){
        String s = "((a+b))";
        System.out.println(isDuplicate(s));

    }
}