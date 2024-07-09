/*The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.

For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
Given an integer n, return its complement.

 

Example 1:

Input: n = 5
Output: 2
Explanation: 5 is "101" in binary, with complement "010" in binary, which is 2 in base-10.*/
import java.util.*;
class Complement_of_Base_10_Integer {
    
    public static int bitwiseComplement(int n) {
        if(n==0){
            return 1;
        }
        Stack<Integer> s = new Stack<>();

        while(n != 0){
            s.push(n%2);
            n = n/2;
        }
        StringBuilder st = new StringBuilder();
        
        while(!s.isEmpty()){
            if(s.peek()==1){
                st.append(0);
            }else{
                st.append(1);
            }
            s.pop();
        }
        int power = 1;
        int sum = 0;
        for(int i=st.length()-1;i>=0;i--){
            int t = st.charAt(i) -'0';
            sum += (power * t);
            power = power*2;
        }

        return sum;
    }
    public static void main(String[] args) {
        System.out.println(bitwiseComplement(10));
    }
}