public class M_bucket {
    public static int m(int a[],int mid,int m,int k){
        int count=0;
        int bucket=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<=mid){
                count++;
            }
            else{
                bucket+=count/k;
                count=0;
            }
        }
        bucket+=count/k;
        if(bucket>=m){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int p(int a[],int m,int k){
        int val = m * k;
        int n = a.length; 
        if (val > n) return -1; 


        int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, a[i]);
            mini = Math.min(mini, a[i]);
        }

        int start = mini;
        int end = maxi;

        while(start<=end){
            int mid = (start+end)/2;
            int t = m(a,mid,m,k);

            if(t==0){
                end = mid-1;
            }
            else{
                start=mid+1;
            }
        
        }
        return start;

    }
    
    public static void main(String[] args){
        int[] arr = {1,10,3,10,2};
        int k = 3;
        int m = 1;
        int ans = p(arr, k, m);
        System.out.println(ans);
    }
}
