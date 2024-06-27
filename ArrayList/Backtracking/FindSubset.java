class FindSubset{
    public static void n(String s ,int i,String st){
        if(i==s.length()){
            if(i==0){
                System.out.println("");
            }
            System.out.println(st);
            return;
        }
        n(s,i+1,st+s.charAt(i));
        n(s,i+1,st);
    }
    public static void main(String[] args){
        String s = "abc";
        n(s,0,"");
    }
}