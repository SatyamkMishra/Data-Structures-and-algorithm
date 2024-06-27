import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_sum2 {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates, target, 0, ans, new ArrayList<>());
        return ans;
    }

    public static void helper(int a[], int target, int i, List<List<Integer>> ans, List<Integer> ds) {
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int j = i; j < a.length; j++) {
            if (j > i && a[j] == a[j - 1]) {
                continue;
            }

            if (a[j] > target) {
                break;
            }

            ds.add(a[j]);
            helper(a, target - a[j], j + 1, ans, ds); 
            ds.remove(ds.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;

        List<List<Integer>> result = combinationSum2(candidates, target);

        System.out.println("Combination Sum 2 for target " + target + ":");
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }
}
