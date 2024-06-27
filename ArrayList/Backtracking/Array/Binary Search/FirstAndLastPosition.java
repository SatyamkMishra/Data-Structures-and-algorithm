import java.util.*;
public class FirstAndLastPosition{
    public static int first(int a[],int s){
        int start = 0;
        int end = a.length-1;
        int ans = -1;
        while(start<=end){
            int mid = (start + end) /2;
            if(a[mid] == s){
                ans = mid;
                end = mid - 1;
            }

            if(a[mid]<s){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
   }


   public static int last(int a[],int s){
        int start = 0;
        int end = a.length-1;
        int ans = -1;
        while(start<=end){
            int mid = (start + end) / 2;
            if(a[mid] == s){
                ans = mid;
                start = mid + 1;
            }

            if(a[mid]<s){
                start = mid + 1;
            }
            else if(s<a[mid]){
                end = mid - 1;
            }
        }
        return ans;
   }
   public static void main(String[] args){
    int a[] = {1,2,2,3,3,3,3,3,4,5,6};
    int b = 3;
     int d = first(a,b);
     int f = last(a,b);
    System.out.println("The first position of " + b + " is " + d);
    System.out.println("The last position of " + b + " is " + f);
   }

}