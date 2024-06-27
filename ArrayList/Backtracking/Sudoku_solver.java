class Sudoku_solver{
    public static boolean sudoku(int a[][], int row, int col){
        if(row==9){
            return true;
        }
        int newRow = row;
        int newCol = col+1;
        if(col+1==9){
            newRow = row+1;
            newCol = 0;
        }
        if(a[row][col]!=0){
            return sudoku(a,newRow,newCol);
        }

        for(int digit=1;digit<=9;digit++){
            if(isValid(a,row,col,digit)){
                a[row][col] = digit;
                if(sudoku(a,newRow,newCol)){
                    return true;
                }
                a[row][col] = 0;
            }
        }
        return false;
    }
    public static boolean isValid(int a[][], int row, int col, int digit){
        for(int i=0;i<9;i++){
            if(a[row][i]==digit){
                return false;
            }
        }

        for(int i=0;i<9;i++){
            if(a[i][col]==digit){
                return false;
            }
        }

        int sr = (row/3)*3;
        int sc = (col/3)*3;

        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(a[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }

    public static void printS(int a[][]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int sudoku_c[][] = { 
        { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
        { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
        { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
        { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
        { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
        { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
        { 0, 0, 5, 2, 0, 6, 3, 0, 0 } 
    };


    if(sudoku(sudoku_c,0,0)){
        System.out.println("Sol exists");
        printS(sudoku_c);
    }
    else{
        System.out.println("Sol doesn't exists");
    }
    
    }
}