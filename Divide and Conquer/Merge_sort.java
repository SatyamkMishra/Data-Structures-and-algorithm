import java.util.ArrayList;

public class Merge_sort {
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // public static void mergeSort(int arr[], int start, int end) {
    // if (start >= end) {
    // return;
    // }

    // int mid = start + (end - start) / 2;
    // mergeSort(arr, start, mid);
    // mergeSort(arr, mid + 1, end);
    // merge(arr, start, mid, end);
    // }

    // public static void merge(int arr[], int start, int mid, int end) {
    // int temp[] = new int[end - start + 1];

    // int i = start;
    // int j = mid + 1;
    // int k = 0;

    // while (i <= mid && j <= end) {
    // if (arr[i] < arr[j]) {
    // temp[k] = arr[i];
    // i++;
    // } else {
    // temp[k] = arr[j];
    // j++;
    // }
    // k++;
    // }

    // while (i <= mid) {
    // temp[k++] = arr[i++];
    // }

    // while (j <= end) {
    // temp[k++] = arr[j++];
    // }

    // for (k = 0, i = start; k < temp.length; k++, i++) {
    // arr[i] = temp[k];
    // }

    // }
    public static void mergeSort(int a[], int s, int e) {
        if (s >= e) {
            return;
        }

        int mid = (s + e) / 2;
        mergeSort(a, s, mid);
        mergeSort(a, mid + 1, e);
        merge(a, s, mid, e);
    }

    public static void merge(int a[], int s, int mid, int e) {

        ArrayList<Integer> arr = new ArrayList<>();
        int j = mid + 1;
        int i = s;

        while (i <= mid && j <= e) {
            if (a[i] < a[j]) {
                arr.add(a[i]);
                i++;
            } else {
                arr.add(a[j]);
                j++;
            }
        }

        while (i <= mid) {
            arr.add(a[i]);
            i++;
        }
        while (j <= e) {
            arr.add(a[j]);
            j++;
        }

        for (int k = 0; k < arr.size(); k++) {
            a[s+k] = arr.get(k);
        }
    }

    public static void main(String[] args) {
        int a[] = { 5, 3, 2, 1, 4 };
        mergeSort(a, 0, a.length - 1);
        print(a);
    }
}