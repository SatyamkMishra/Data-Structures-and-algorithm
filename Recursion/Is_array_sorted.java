public class Is_array_sorted {
    public static boolean issorted(int a[] , int i){
        if(i==a.length-1){
            return true;
        }
        if(a[i]>a[i+1]){
            return false;
        }
        return issorted(a,i+1);
    }
    public static void main(String args[]){
        int a[]  = {1,2,3,4,4};
        System.out.println(issorted(a,0));
    }
}
