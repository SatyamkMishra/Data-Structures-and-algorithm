import java.util.*;

class Binary_Palindrome{

public static boolean isPalindrome(int n){
StringBuilder st = new StringBuilder();
while( n != 0){
int r = n%2;
st.append(r);
n = n/2;
}

String s = st.reverse().toString();
int i = 0;
int j = s.length()-1;

while(i<j){
if(s.charAt(i) != s.charAt(j)){
return false;
}
i++;
j--;
}
return true;
}
public static void main(String[] args){

System.out.println(isPalindrome(9));
}
}