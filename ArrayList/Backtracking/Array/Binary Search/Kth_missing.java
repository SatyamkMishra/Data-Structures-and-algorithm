public class Kth_missing {
    public static int brutforce(int a[], int k){
        for(int i=0;i<a.length;i++){
            if(a[i]<k){
                k++;
            }
            else{
                break;
            }
        }
        return k;
    }

    public static int optimal(int a[], int k){
        int start=0;
        int end = a.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            int miss = a[mid]-(mid+1);
            if(miss<k){
                start=mid+1;
            }
            else{
                end = mid-1;
            }
                
        
        }
        return start+k;

    }
    public static void main(String[] args){
        int n[] = {2,3,4,7,11};
        System.out.println(brutforce(n, 5));
        System.out.println(optimal(n, 5));
    }
}
