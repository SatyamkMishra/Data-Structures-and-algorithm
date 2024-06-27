public class Remove_Duplicate {
    public static void d(String s, int idx, StringBuilder newStr, boolean map[]){
        if(idx==s.length()){
            System.out.println(newStr);
            return;
        }

        char curr = s.charAt(idx);


        if(map[curr-'a']==true){
            d(s,idx+1,newStr,map);
        }
        else{
            map[curr-'a']=true;
            d(s,idx+1,newStr.append(curr),map);
        }
    }
    public static void main(String[] args){
        String s = "ssssaaaatttyam";
        d(s,0,new StringBuilder(""),new boolean[26]);
    }
}
