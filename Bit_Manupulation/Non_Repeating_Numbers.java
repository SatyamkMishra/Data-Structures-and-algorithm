public class Non_Repeating_Numbers {
    public static int[] n(int a[]) {
        int x = 0;
        for (int i = 0; i < a.length; i++) {
            x ^= a[i];
        }
        int p = 0;
        for (int i = 0; i <= 32; i++) {
            int c = 1 << i;
            if ((x & c) !=0) { 
                p = c;
                break;
            }
        }

        int x1 = 0;
        int x2 = 0;
        for (int i = 0; i < a.length; i++) {
            if ((a[i] & p) != 0) { 
                x1 ^= a[i];
            } else {
                x2 ^= a[i];
            }
        }
        if(x1<=x2){
            return new int[]{x1, x2};
        }
        return new int[]{x2,x1}; 
    }

    public static void main(String[] args) {
        int a[] = {7, 6, 25, 4, 25, 15, 15, 7, 4, 3, 29, 6};
        int result[] = n(a);
        System.out.println(result[0] + " " + result[1]);
    }
}


