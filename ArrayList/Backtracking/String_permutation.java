class String_permutation{
    public static void p(String s,String st){
        if(s.length()==0){
            System.out.println(st);
            return;
        }
        for(int j=0;j<s.length();j++){
            String newStr = s.substring(0,j)+s.substring(j+1);
            p(newStr,st+s.charAt(j));
        }
    }
    public static void main(String[] args){
        String s = "abc";
        p(s,"");
    }
}