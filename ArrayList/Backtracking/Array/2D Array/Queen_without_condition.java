class Queen_without_condition{
    public static void nQueen(String a[][], int row){
        if(row==a.length){
            System.out.println("..............Board...............");
            printA(a);
            return;
        }

        for(int i=0;i<a.length;i++){
            
            a[row][i]="Q";
            nQueen(a,row+1);
            a[row][i]="X";
        }
    }

    public static void printA(String a[][]){
        int s = a.length;
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                System.out.print(a[i][j]  + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int s=2;
        String a[][] = new String[s][s];
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                a[i][j]="X";
            }
        }

        nQueen(a,0);
    }
}