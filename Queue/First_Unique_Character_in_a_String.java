import java.util.*;

class First_Unique_Character_in_a_String {
    public static void firstUniqChar(String s) {
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            q.add(c);
            freq[c - 'a']++;

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }
            if (q.isEmpty()) {
                System.out.println(-1 + " ");
            } else {
                System.out.println(q.peek() + " ");
            }
        }
        
    }

    public static void main(String[] args) {
        String s = "aabbcxxyc";
        firstUniqChar(s);
    }
}
