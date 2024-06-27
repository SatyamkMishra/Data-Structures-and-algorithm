import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Four_sum {
    public static List<List<Integer>> quadlet(int[] a, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(a);

        for (int i = 0; i < a.length - 3; i++) {
            if (i > 0 && a[i] == a[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < a.length - 2; j++) {
                if (j > i + 1 && a[j] == a[j - 1]) {
                    continue;
                }

                int k = j + 1;
                int l = a.length - 1;

                while (k < l) {
                    int sum = a[i] + a[j] + a[k] + a[l];

                    if (sum > target) {
                        l--;
                    } else if (sum < target) {
                        k++;
                    } else {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(a[i]);
                        temp.add(a[j]);
                        temp.add(a[k]);
                        temp.add(a[l]);
                        ans.add(temp);

                        while(k<l && a[k]==a[k-1]) k++;
                        while(k<l && a[l]==a[l+1]) l--;

                        k++;
                        l--;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = { 1, 0, -1, 0, -2, 2 };
        List<List<Integer>> ans = quadlet(a, 0);

        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
}
