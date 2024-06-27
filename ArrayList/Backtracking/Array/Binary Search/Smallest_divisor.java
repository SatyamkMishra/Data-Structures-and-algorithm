class Smallest_divisor{
    public static int a(int a[], int mid){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=Math.ceil((double)a[i]/mid);
        }
        return sum;
    }

    public static int n(int a[], int t){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            max=Math.max(max,a[i]);
        }

        if(a.length>t){
            return -1;
        }
        int start = 1;
        int end = max;
        while(start<=end){
            int mid =(start+end)/2;
            int p = a(a,mid);
            if(p<=t){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    public static void main(String[] args){
        int a[] = {1,2,5,9};
        System.out.println(n(a,6));
    }
}