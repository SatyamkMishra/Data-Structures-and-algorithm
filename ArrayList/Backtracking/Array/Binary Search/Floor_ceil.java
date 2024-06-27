public class Floor_ceil {
    public static int floor(int a[], int x){
        int start = 0;
        int end = a.length-1;
        int ans = -1;
        
        while(start<=end){
            int mid = (start+end)/2;

            if(a[mid]<=x){
                ans = a[mid];
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }

    public static int ceil(int a[], int x){
        int start=0;
        int end=a.length-1;
        int ans = a.length;

        while(start<=end){
            int mid = (start+end)/2;


            if(a[mid]>=x){
                ans = a[mid];
                end = mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return ans;
    }

    public static void main(String[] args){
        int a[] = {3,4,4,7,8,10};
        System.out.println(floor(a,5));
        System.out.println(ceil(a,5));
    }
}
