import java.util.*;
public class Shortest_path{
    public static int str(String s){
        int x = 0;
        int y = 0;
        int f = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='N'){
                y++;
            }
            else if(s.charAt(i)=='S'){
                y--;
            }
            else if(s.charAt(i)=='E'){
                x++;
            }
            else if(s.charAt(i)=='W'){
                x--;
            }
            int x2 = x*x;
            int y2 = y*y;
            f = (int)(Math.sqrt(x2+y2));
            
        }
        return f;
    }
    public static void main(String[] args){
        String s = "WNEENESENNN";
        System.out.println(str(s));
    }
}