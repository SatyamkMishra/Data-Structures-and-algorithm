class Move_x_to_last{
    public static void n(String s,int i,String st,int count){
        if(i==s.length()){
            for(i=0;i<count;i++){
                st+='x';
            }
            System.out.println(st);
            return;
        }
        if(s.charAt(i)!='x'){
            st+=s.charAt(i);
        }
        else{
            count++;
        }
        
        n(s,i+1,st,count);
     
     }
     public static void main(String[] args) {
         String s ="abxxbxbx";
         n(s,0,"",0);
     }
}