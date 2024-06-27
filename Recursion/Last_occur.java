public class Last_occur {
    public static int lastoccur(int a[], int key, int i){
        if(i==a.length){
            return -1;
        }
        int isfound = lastoccur(a,key,i+1);

        if(isfound==-1 && a[i]==key){
            return i;
        }
        return isfound;
    }
    public static void main(String[] args){
        int a[] ={1,2,3,4,4};
        System.out.println(lastoccur(a,4,a.length-1));
    }
}
