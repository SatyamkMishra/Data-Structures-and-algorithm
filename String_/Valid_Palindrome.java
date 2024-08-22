public class Valid_Palindrome {
    public static boolean s(String s){
        s=s.toLowerCase();
        StringBuilder s1 = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                s1.append(s.charAt(i));
            }
        }
        System.out.println(s1);
        for(int i=0;i<s1.length()/2;i++){
            if(s1.charAt(i)!=s1.charAt(s1.length()-1-i)){
                return false;
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
       String s1 = "A man, a plan, a canal: Panama";
       System.out.println(s(s1));
    }
    
}
