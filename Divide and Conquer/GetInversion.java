public class GetInversion {


    public static int inversion(int a[], int start, int end) {
        int inv=0;
        if (start < end) {
        int mid = start + (end - start) / 2;
        inv+=inversion(a, start, mid);
        inv+=inversion(a, mid + 1, end);
        inv+=merge(a, mid, start, end);
        }

        return inv;
    }

    public static int merge(int a[], int mid, int start, int end) {
        int temp[] = new int[end - start + 1];

        int i = start;
        int j = mid+1;
        int k = 0;

        int inv=0;
        while (i <= mid && j <= end) {
            if (a[i] < a[j]) {
                temp[k] = a[i];
                i++;
            } else {
                temp[k] = a[j];
                inv+=(mid-i+1);
                j++;
            }
            k++;
        }

        while (i <= mid) {
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
        System.out.println(inversion(a, 0, a.length - 1));
        
    }
}
