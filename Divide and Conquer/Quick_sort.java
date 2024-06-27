public class Quick_sort {
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // public static void quickSort(int arr[], int start, int end){
    // if(start>=end){
    // return;
    // }

    // int pidx = partition(arr,start,end);
    // quickSort(arr,start,pidx-1);
    // quickSort(arr,pidx+1,end);
    // }

    // public static int partition(int arr[],int start,int end){
    // int pivot = arr[end];

    // int i= start-1;

    // for(int j=start;j<end;j++){
    // if(arr[j]<=pivot){
    // i++;
    // int temp = arr[j];
    // arr[j] = arr[i];
    // arr[i] = temp;
    // }
    // }

    // i++;
    // int temp = pivot;
    // arr[end] = arr[i];
    // arr[i] = temp;

    // return i;
    // }

    public static void quickSort(int a[], int s, int e) {
        if (s >= e) {
            return;
        }

        int pIdx = partition(a, s, e);
        quickSort(a, s, pIdx - 1);
        quickSort(a, pIdx + 1, e);
    }

    public static int partition(int a[], int s, int e) {

        int pivot = a[e];
        int i = s - 1;
        for (int j = s; j < e; j++) {
            if (a[j] <= pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }

        }

        i++;
        int temp = pivot;
        a[e] = a[i];
        a[i] = pivot;
        return i;
    }

    public static void main(String[] args) {

        int a[] = { 5, 3, 2, 1, 4 };
        quickSort(a, 0, a.length - 1);
        print(a);
    }
}
