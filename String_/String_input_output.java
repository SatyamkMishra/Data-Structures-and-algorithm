import java.util.*;
public class String_input_output{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //only one word means not any space
        System.out.println("Enter your first name ");
        String s = sc.next();
        System.out.println("Your name is : " + s);
        


        //whole line 
        System.out.println("Enter your full name ");
        String sp = sc.nextLine();
        System.out.println("Your full name is : " + sp);
    }
}