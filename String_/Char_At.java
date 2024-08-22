import java.util.*;
public class Char_At{
    public static void main(String[] args){
        String s = "Satyam Kumar";
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));
        System.out.println(s.charAt(6));
        System.out.println(s.charAt(8));

        //or 
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
    }
}