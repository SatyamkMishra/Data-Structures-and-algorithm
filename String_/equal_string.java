public class equal_string{
    public static void main(String[] args){
        String s1 = "satyam";
        String s2 = "satyam";
        String s3 = new String("satyam");
        if(s1.equals(s2)){
            System.out.println("Strings are equal ");
        }
        if(s1.equals(s3)){
            System.out.println("Strings are equal ");
        }
        else{
           System.out.println("Strings are not equal "); 
        }
    }
}