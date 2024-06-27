public class First_occ {
    public static int firstoccur(int a[] , int key, int i){
        if(i==a.length){
            return -1;
        }
        if(a[i]==key){
            return i;
        }
        return firstoccur(a,key,i+1);
    }
    public static void main(String[] args){
        int a[] = {1,2,3,4,5,5};
        System.out.println(firstoccur(a,6,0));
    }
}
