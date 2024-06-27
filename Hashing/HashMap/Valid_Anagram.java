import java.util.HashMap;

public class Valid_Anagram {

    public static boolean isValidAnagram(String s1, String s2){
        HashMap<Character, Integer> h = new HashMap<>();

        for(int i=0;i<s1.length();i++){
            if(h.containsKey(s1.charAt(i))){
                h.put(s1.charAt(i), h.get(s1.charAt(i)) + 1);
            }
            else{
                h.put(s1.charAt(i),1);
            }
        }

        for(int i=0;i<s2.length();i++){
            if(h.get(s2.charAt(i)) != null){
                if(h.get(s2.charAt(i)) == 1){
                    h.remove(s2.charAt(i));
                }
                else{
                    h.put(s2.charAt(i) , h.get(s2.charAt(i)) -1);
                }
            }
            else{
                return false;
            }
            
        }
        return h.isEmpty();
    }
    public static void main(String[] args){
        System.out.println(isValidAnagram("race", "acer"));
    }
}
