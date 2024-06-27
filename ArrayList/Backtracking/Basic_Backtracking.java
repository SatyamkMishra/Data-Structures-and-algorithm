public class Basic_Backtracking{
    public static void n(int a[], int i, int value){

        if(i==a.length){
            printA(a);
            return;
        }

        a[i]=value;
        n(a,i+1,value+1);
        a[i]=a[i]-2;
    }

    public  static void printA(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){

        int a[] = new int[6];
        n(a,0,1);
        printA(a);
    }
}