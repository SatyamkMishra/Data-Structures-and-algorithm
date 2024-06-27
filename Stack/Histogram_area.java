import java.util.*;
class Histogram_area{
    public static int maxiArea(int a[]){
        int nsl[] = new int[a.length];
        int nsr[] = new int[a.length];
        int maxArea = 0;

        Stack<Integer> s = new Stack<>();

        for(int i=a.length-1;i>=0;i--){
            while(!s.isEmpty() && a[i]<=a[s.peek()]){
                s.pop();
            }

            if(s.isEmpty()){
                nsr[i] = a.length;
            }
            else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        s = new Stack<>();

        for(int i=0;i<a.length;i++){

            while(!s.isEmpty() && a[i]<=a[s.peek()]){
                s.pop();
            }

            if(s.isEmpty()){
                nsl[i] = -1;
            }
           else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        for(int i=0;i<a.length;i++){
            int height = a[i];
            int width = nsr[i] - nsl[i] - 1;
            int area = height*width;
            maxArea = Math.max(maxArea,area);
        }
        return maxArea;
    }
    public static void main(String[] args){

        int a[] = {2,1,5,6,2,3};
        System.out.println(maxiArea(a));
    }
}