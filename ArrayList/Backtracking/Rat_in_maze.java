class Rat_in_maze{
    public static boolean rat(int a[][],int row,int col,int s[][]){
        if(row==a.length-1 && col==a.length-1 && a[row][col]==1){
            s[row][col]=1;
            printA(s);
            return true;
        }

        if(isValid(a,row,col)){
            s[row][col]=1;
            if(rat(a,row+1,col,s)){
                return true;
            }
            if(rat(a,row,col+1,s)){
                return true;
            }
            s[row][col]=0;
            return false;
        }
        return false;
    }

    public static boolean isValid(int a[][], int row, int col){
        return (row<a.length && col<a.length && a[row][col]==1 && row>=0 && col>=0);
    }

    public static void printA(int a[][]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int a[][]={{1, 0, 0, 0},
                   {1, 1, 0, 1},
                   {1, 1, 0, 0},
                   {0, 1, 1, 1}};
     int s[][] = new int[a.length][a.length];
      System.out.println(rat(a,0,0,s));
    }
}