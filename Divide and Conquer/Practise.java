//Merge Sort

public class Practise {
    public static void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static int mergeSort(int a[], int start, int end) {
        int inv=0;
        if (start < end) {
        int mid = start + (end - start) / 2;
        inv+=mergeSort(a, start, mid);
        inv+=mergeSort(a, mid + 1, end);
        inv+=merge(a, mid+1, start, end);
        }

        return inv;
    }

    public static int merge(int a[], int mid, int start, int end) {
        int temp[] = new int[end - start + 1];

        int i = start;
        int j = mid ;
        int k = 0;

        int inv=0;
        while (i < mid && j <= end) {
            if (a[i] < a[j]) {
                temp[k] = a[i];
                i++;
            } else {
                temp[k] = a[j];
                inv+=(mid-i);
                j++;
            }
            k++;
        }

        while (i < mid) {
            temp[k++] = a[i++];
        }

        while (j <= end) {
            temp[k++] = a[j++];
        }

        for (k = 0, i = start; k < temp.length; i++, k++) {
            a[i] = temp[k];
        }

        return inv;
    }

    public static void main(String[] args) {
        int a[] = {2, 4, 1, 3, 5};
        System.out.println(mergeSort(a, 0, a.length - 1));
        
    }
}


// // public class Practise{
//     public static void print(int a[]){
//         for(int i=0;i<a.length;i++){
//             System.out.print(a[i] + " ");
//         }
//     }

//     public static void quickSort(int a[], int start, int end){
//         if(start>=end){
//             return;
//         }

//         int pidx = partition(a, start, end);

//         quickSort(a,start,pidx-1);
//         quickSort(a,pidx+1,end);
//     }


//     public static int partition(int a[], int start, int end){

//         int pivot= a[end];
         

//         int i=start-1;

//         for(int j=start;j<=end;j++){

//             if(a[j]<=pivot){
//             i++;
//             int temp = a[i];
//             a[i] =a[j];
//             a[j]= temp;
//         }
//            i++;
//             int temp = pivot;
//             a[end] =a[i];
//             a[i]= temp; 
//             return i;

//         }



//     }
//     public static void main(String[] args){

//         int a[] = {3,1,4,2,5};
//         quickSort(a, 0,a.length-1);
//         print(a);
//     }
// }