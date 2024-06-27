import java.util.*;
class Stock_and_span{
    public static void stockAndSpan(int stock[], int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for(int i=1;i<stock.length;i++){
            int currprice = stock[i];
            while(!s.isEmpty() && currprice > stock[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                stock[i] = i+1;
            }
            else{
                int prevHigh = s.peek();
                span[i] = i-prevHigh;
            }
            s.push(i);
        }
    }
    public static void main(String[] args){
        int stock[] = {100,80,60,70,60,85,100};
        int span[] = new int[stock.length];

        stockAndSpan(stock,span);

        for(int i=0;i<span.length;i++){
            System.out.print(span[i] + " ");
        }
    }
}