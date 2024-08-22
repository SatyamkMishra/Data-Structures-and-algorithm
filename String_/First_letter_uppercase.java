import java.util.*;
public class First_letter_uppercase{
    public static String upp(String s){
        StringBuilder st = new StringBuilder("");

        char ch =Character.toUpperCase(s.charAt(0));

        st.append(ch);

        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == ' ' && i<s.length()-1){
                st.append(s.charAt(i));
                i++;
                st.append(Character.toUpperCase(s.charAt(i)));
            }
            else{
                st.append(s.charAt(i));
            }
        }
        return st.toString();
    }
    public static void main(String[] args){
        String s = "hi i am satyam ";
        System.out.println(upp(s));
        //upp(s);
    }
}