public class Rotated_Sorted {
    public static int search(int arr[], int key, int start , int end){

        if(start>end){
            return -1;
        }
        int mid = start+(end-start)/2;

        if(arr[mid] == key){
            return mid;
        }


        if(arr[start]<=arr[mid]){
            if(arr[start]<=key && key<=arr[mid]){
                return search(arr,key,start,mid-1);
            }

            else{
                return search(arr,key,mid+1,end);
            }
        }


        else{
            if(arr[mid]<=key && key<=arr[end]){
            return search(arr,key,mid+1,end);
        }
        else{
            return search(arr,key,start,mid-1);
        }
    }
        
    }
    public static void main(String[] args){
        int a[] = {4,5,6,1,2,3};
        int result = search(a,6,0,a.length-1);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
