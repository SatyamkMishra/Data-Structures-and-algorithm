import java.util.*;
public class Palindrome{
public static boolean str(String s){
    for(int i=0;i<=s.length()/2;i++){
        if(s.charAt(i)==s.charAt(s.length()-i-1)){
             
        }
        else{
            System.out.println("String is not palindorme ");
            return false;
        }
    }
    System.out.println("String is palindrome ");
        return true;
}
public static void main(String[] args){
    String s = "racecar";
    str(s);

}
  }