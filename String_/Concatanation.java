import java.util.*;
public class Concatanation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name ");
        String s = sc.next();
        System.out.println("Enter your last name ");
        String s2 = sc.next();

        String s3 = s + " " + s2;
        System.out.println("Your full name is " + s3);
    }
}