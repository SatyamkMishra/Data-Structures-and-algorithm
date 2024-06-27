public class Koko_banana {
    public static int maxi(int a[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            max=Math.max(max,a[i]);
        }
        return max;
    }

    public static int n(int a[], int mid){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=Math.ceil(a[i]/mid);
        }
        return sum;
    }

    public static int p(int a[],int h){
        int start =1;
        int end = maxi(a);

        while(start<=end){
            int mid = (start+end)/2;

            int total = n(a,mid);

            if(h<=total){
                start=mid+1;
            }
            else{
                end = mid-1;
            }
            
        }
        return start;
    }
    public static void main(String[] args){
        int a[]= {3,6,7,11};
        System.out.println(p(a,8));
    }
}
