class Lower_bond{
    public static int lowerbond(int a[], int x){
        int start = 0;
        int end = a.length-1;
        int ans = -1;
        


        while(start<=end){
            int mid = (start+end)/2;
            if(a[mid]>=x){
                ans = mid;
                end = mid - 1;
            }
            else {
                start=mid+1;
            }
           
        }
        return ans;
    }
    public static void main(String[] args){
        int a[] = {3,5,8,15,19};
        System.out.println(lowerbond(a,5));

    }
}