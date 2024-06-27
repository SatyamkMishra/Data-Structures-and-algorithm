import java.util.ArrayList;

class Sum2 {
    public static int p(ArrayList<Integer> a){
        for(int i=0;i<a.size()-1;i++){
            if(a.get(i)>a.get(i+1)){
                return i;
            }
            
    }
    return -1;
    }
    public static void n(ArrayList<Integer> a,int t){
        int n = a.size();
        int c = p(a);
        int i=  c+1;
        int j = c;
    
    
        while(i!=j){
           int sum=a.get(i)+a.get(j);
           if(sum<t){
               i=(i+1)%n;
           }
           else if (sum>t){
               j=(n+j-1)%n;
           }
           else{
              System.out.println(a.get(i)+ " "+ a.get(j)); 
              i=(i+1)%n;
              j=(n+j-1)%n;
           }
        }
    } 
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        n(a,6);
    }
}