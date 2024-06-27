class Rearranging{
    public static int[] re(int a[]){
        int p[] = new int[a.length/2];
        int n[] = new int[a.length/2];
        int k=0;
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                p[k++] = a[i];
            }
            else{
                n[j++] = a[i];
            }
        }

        for(int i=0;i<a.length/2;i++){
            a[2*i]=p[i];
            a[2*i+1]=n[i];
        }
        return a;

    }
    public static void arr(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args){
        int a[] = {-2,-5,3,-8,6,1};
        int c[] = re(a);
        arr(c);
    }
}