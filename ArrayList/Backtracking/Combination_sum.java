import java.util.ArrayList;
import java.util.List;

class Combination_sum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(candidates, 0, target, ans, new ArrayList<>());
        return ans;
    }

    public static void helper(int[] a, int i, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (i == a.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if (a[i] <= target) {
            ds.add(a[i]);
            helper(a, i, target - a[i], ans, ds);
            ds.remove(ds.size() - 1);
        }
        helper(a, i + 1, target, ans, ds);
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 6, 7};
        int target = 7;
        Combination_sum combinationSum = new Combination_sum();
        List<List<Integer>> ls = combinationSum.combinationSum(arr, target);
        System.out.println("Combinations are: ");
        for (int i = 0; i < ls.size(); i++) {
            for (int j = 0; j < ls.get(i).size(); j++) {
                System.out.print(ls.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
