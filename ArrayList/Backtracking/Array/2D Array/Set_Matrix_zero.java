

public class Set_Matrix_zero{
    public static void s(int arr[][]){
        int r[] = new int[arr.length];
        int c[] = new int[arr[0].length];
        int n = arr.length;
        int m = arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    r[i]=1;
                    c[j]=1;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(r[i]==1 || c[j]==1){
                    arr[i][j]=0;

                }
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    
                    System.out.print(arr[i][j] +" ");
                }
                System.out.println();
            }
        }
        
    public static void main(String[] args){
       int arr[][] = {{1,0,1},
                        {2,3,4},
                         {3,4,5}};
        s(arr);
    }
}