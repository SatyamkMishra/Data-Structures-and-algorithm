public class String_reverse_iii{
    public static String rev(String s){
        StringBuilder words = new StringBuilder();
        String[] st = s.split(" ");
        for(String word: st){
            StringBuilder t = new StringBuilder(word);
            t.reverse();
            words.append(t);
            words.append(" ");
        }
        return words.toString().trim();
    }
    public static void main(String[] args){
       String s = "Hello i am Satyam";
       System.out.println(rev(s));
    }
}