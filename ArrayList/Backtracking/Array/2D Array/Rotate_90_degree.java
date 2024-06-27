public class Rotate_90_degree {
    //brut force
    public static void s(int a[][]){
        int n = a.length;
        int b[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<a[0].length;j++){
                b[j][n-1-i]=a[i][j];
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
       int a[][] = {{1,2,3},
                    {4,5,6},
                    {7,8,9}};
       s(a);
    }
}
