public class All_Occurrence {
    public static void o(int a[], int n, int i){
        if(i==a.length){
            return;
        }
        if(n==a[i]){
            System.out.print(i + " ");
        }
        o(a,n,i+1);
    }
    public static void main(String[] args){
        int a[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        o(a,2,0);
    }
}
