public class Remove_duplicates_string {
    public static String n(String s){
        String sc = new String();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(sc.indexOf(c)==-1){
                sc+=c;
            }
        }
        return sc;
     }
     public static void main(String[] args) {
         String s = "ppprrgggp";
         System.out.println(n(s));
}
}