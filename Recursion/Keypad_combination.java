class Keypad_combination{
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void n(String s, int i, String st){
        if(i==s.length()){
            System.out.println(st);
            return;
        }

        char c = s.charAt(i);
        String map = keypad[c-'0'-1];

        for(int j=0;j<map.length();j++){
            n(s,i+1,st+map.charAt(j));
        }
    }
    public static void main(String[] args){
        String s = "2";
        n(s,0,"");
    }
}