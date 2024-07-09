/*You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.

Return the number of consistent strings in the array words.

 

Example 1:

Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
*/
import java.util.*;
class Count_the_Number_of_Consistent_Strings {
    public static int countConsistentStrings(String a, String[] words) {
        HashSet<Character> h = new HashSet<>();

        for(int i=0;i<a.length();i++){
            h.add(a.charAt(i));
        }
        int count = 0;

        for(int i=0;i<words.length;i++){
            if(isTrue(words[i],h)){
                count++;
            }
        }

        return count;
    }
    public static boolean isTrue(String s, HashSet<Character> h){
        for(int i=0;i<s.length();i++){
           if(!h.contains(s.charAt(i))){
                return false;
            }
        }
            

        return true;
    }
    
    public static void main(String[] args) {
        
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        System.out.println(countConsistentStrings(allowed,words));
    }
}