public class Array_rotation {
    public static void swap(int a[],int start,int end){
        int temp = 0;
        while(start<end){
            temp = a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }

    public static int[] rotate(int a[] ,int n){
        n=n%a.length;
        swap(a,0,a.length-n-1);
        swap(a,a.length-n,a.length-1);
        swap(a,0,a.length-1);
        return a;
        }

        public static void printarray(int a[]){
            for(int i=0;i<a.length;i++){
                System.out.print(a[i] + " ");
            }
        }
    public static void main(String[] args){
        int a[] = {1, 2, 3, 4, 5, 6};
        int[] rotatedArray = rotate(a, 3);
        printarray(rotatedArray);
    }
}
