import java.util.*;
public class Substring{
    public static String ppp(String st,int s ,int e){
        String p = "";
        for(int i=s;i<e;i++){
            p+=st.charAt(i);
        }
        return p;
    }
    public static void main(String[] args){
        String s = "HelloWorld";
        System.out.println(s.substring(0,5));
        //normal method
        System.out.println(ppp(s,0,5));

    }

}