import java.util.*;
public class TrappedWater{
    public static void totalWater(int a[]){

    int n = a.length;
    int trapwater = 0;

    int leftmost[] = new int[n];
    int rightmost[] = new int[n];

    leftmost[0] = a[0];
    for(int i=1;i<n;i++){
        leftmost[i] = Math.max(leftmost[i-1],a[i]);
    }

    rightmost[n-1] = a[n-1];
    for(int i=n-2;i>=0;i--){
        rightmost[i] = Math.max(rightmost[i+1],a[i]);
    }

    for(int i=0;i<n;i++){
        int mini = Math.min(rightmost[i],leftmost[i]);
        trapwater = (mini-a[i])+trapwater;
    }
    System.out.println("Total trapwater is " + trapwater);
}
  
    public static void main(String[] args){
        int b[] = {5,4,3,6,4,0,5};
        totalWater(b);
    }

}
