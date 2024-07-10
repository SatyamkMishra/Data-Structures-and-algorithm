/*Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

 

Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"*/
class Defanging_an_IP_Address {
    
    public static String defangIPaddr(String a) {
        StringBuilder st = new StringBuilder();

        String[] str = a.split("\\.");

        for(int i=0;i<str.length;i++){
            st.append(str[i]);
            if(i!=str.length-1){
                st.append("[.]");
            }
        }

        return st.toString();
    }
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }
}