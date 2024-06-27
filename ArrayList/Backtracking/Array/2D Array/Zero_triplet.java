import java.util.*;
public class Zero_triplet {
    public static List<List<Integer>> triplet(int a[]){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            if(i>0 && a[i]==a[i-1]){
                continue;
            }

            int j = i+1;
            int k = a.length-1;
            while(j<k){
            int sum = a[i] + a[j] + a[k];

            if(sum<0){
                j++;
            }
            else if(sum>0){
                k--;
            }
            else{
                List<Integer> temp = Arrays.asList(a[i], a[j], a[k]);
                ans.add(temp);
                j++;
                k--;
            
                while (j < k && a[j] == a[j - 1]) j++;
                while (j < k && a[k] == a[k + 1]) k--;
            }
        }
      }
        return ans;
    }

    public static void main(String[] args){

        int a[] = { -1, 0, 1, 2, -1, -4};
        List<List<Integer>> ans = triplet(a);
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
