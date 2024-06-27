public class N_queen{
    public static void nQueen(StringBuilder s[][],int row){
        if(row==s.length){
            System.out.println("...............Borard..................");
            printA(s);
            return;
        }

        for(int i=0;i<s.length;i++){
            if(isValid(s,i,row)){
                s[row][i]= new StringBuilder("Q");
                nQueen(s,row+1);
                s[row][i]= new StringBuilder("X");
            }
            
        }
    }

    public static boolean isValid(StringBuilder s[][], int i, int row){
        for(int j=row-1;j>=0;j--){
            if(s[j][i].toString().equals("Q")){
                return false;
            }
        }

        for(int j=row-1,n=i-1;j>=0 && n>=0;j--,n--){
            if(s[j][n].toString().equals("Q")){
                return false;
            }
        }

        for(int j=row-1,n=i+1;j>=0 && n<s.length;j--,n++){
            if(s[j][n].toString().equals("Q")){
                return false;
            }
        }

        return true;
    }

    public static void printA(StringBuilder s[][]){
        for(int i=0;i<s.length;i++){
            for(int j=0;j<s.length;j++){
                System.out.print(s[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n = 4;
        StringBuilder s[][] = new StringBuilder[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                s[i][j] = new StringBuilder("X");
            }
        }

        nQueen(s,0);
    }
}