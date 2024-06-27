class Grid_ways{
    public static int ways(int row , int col,int m, int n){
        if(row==m || col==n){
            return 0;
        }
        if(row==m-1 && col==n-1){
            return 1;
        }

        int t1 = ways(row+1,col,m,n);
        int t2 = ways(row,col+1,m,n);

        return t1+t2;
    }

    public static void main(String[] args){
        System.out.println(ways(0,0,3,3));
    }
}