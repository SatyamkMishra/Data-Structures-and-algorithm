public class Peak_element {
    public static int max(int a[][], int n, int m, int col) {
        int max = 0;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (a[i][col] > max) {
                max = a[i][col];
                index = i;
            }
        }
        return index;
    }

    public static void n(int a[][]) {
        int n = a.length;
        int m = a[0].length;
        int start = 0;
        int end = m - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            int maxRowIndex = max(a, n, m, mid);

            int left = (mid - 1 >= 0) ? a[maxRowIndex][mid - 1] : -1;
            int right = (mid + 1 < m) ? a[maxRowIndex][mid + 1] : -1;

            if (a[maxRowIndex][mid] > left && a[maxRowIndex][mid] > right) {
                System.out.println(maxRowIndex + " " + mid);
                return;
            } else if (a[maxRowIndex][mid] < left) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(-1 + " " + -1);
    }

    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        n(a);
    }
}
