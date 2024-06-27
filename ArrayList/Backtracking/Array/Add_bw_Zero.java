import java.util.*;
public class Add_bw_Zero{

    public static ArrayList<Integer> sumA(int a[]){
        ArrayList<Integer> ans = new ArrayList<>();

        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum += a[i];
            if(a[i]==0 && i>0){
                ans.add(sum);
                sum = 0;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int a[] = {0,1,2,0,3,0,2,3,0};

        ArrayList<Integer> ans = sumA(a);

        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }
    }
}