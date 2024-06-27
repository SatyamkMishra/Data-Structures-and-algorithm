public class Product_of_array_without_self {
    public static void p(int a[]){
        int left[] = new int[a.length];
        left[0] = 1;
        
        for(int i=1;i<a.length;i++){
            left[i] = a[i-1]*left[i-1];
        }
        
        int right[] = new int[a.length];
        right[a.length-1]= 1;
        
        for(int j=a.length-2;j>-1;j--){
            right[j] = a[j+1]*right[j+1];
        }
        int s[] = new int[a.length];
        for(int k=0;k<a.length;k++){
           s[k] = left[k]*right[k]; 
        }
        for(int i=0;i<a.length;i++){
            System.out.print(s[i] + " ");
        }
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        p(a);
    }
}
