class Subsequence{
    public static void n(String s,int i, String st){
        if(i==s.length()){
            System.out.println(st);
            return;
        }
        char c = s.charAt(i);
        n(s,i+1,st+c);
        n(s,i+1,st);
    }
    public static void main(String[] args) {
        String s = "abc";
        n(s,0,"");
    }
}