public class Remove_Consecutive_Characters {
    public static String n(String s){
        StringBuilder s1 = new StringBuilder();
       for(int i=0;i<s.length();i++){
           while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
               i++;
           }
           s1.append(s.charAt(i));
       }
            return s1.toString();
    }
    public static void main(String[] args) {
        String s = "aaaaabbaa";
        System.out.println(n(s));
    }
}
