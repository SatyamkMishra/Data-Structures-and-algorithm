public class Sentence_to_mobile_no {
    public static String n(String s){
        String str[]
             = { "2",    "22",  "222", "3",   "33", "333",
                 "4",    "44",  "444", "5",   "55", "555",
                 "6",    "66",  "666", "7",   "77", "777",
                 "7777", "8",   "88",  "888", "9",  "99",
                 "999",  "9999" };
                 String st = new String();
                 for(int i=0;i<s.length();i++){
                     if(s.charAt(i)==' '){
                         st+="0";
                     }
                     else{
                         int p = s.charAt(i)-'A';
                         st+=str[p];
                     }
                 }
                 return st;
     }
     public static void main(String[] args) {
         String s = "HEY U";
         System.out.println(n(s));
     }
}
