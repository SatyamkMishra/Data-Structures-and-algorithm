public class Insert_position {
    public static int insert(int a[],int x){
        int start = 0;
        int end = a.length-1;
        int ans = a.length;

        while(start<=end){
            int mid = (start+end)/2;

            if(a[mid]>=x){
                ans = mid;
                end = mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args){

        int a[] = {1,2,4,7};
        System.out.println(insert(a,2));
    }
}
