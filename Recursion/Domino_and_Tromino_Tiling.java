public class Domino_and_Tromino_Tiling {
    public static int numTilings(int n){
        int mod = (int)(Math.pow(10,9)+7);
       if(n<=2){
            return n;
        }
        if(n==3){
          return 5;
        }
        int a= (2 * numTilings(n-1))%mod;
        int b=numTilings(n-3);
        return (a+b)%mod;
     
  }
    public static void main(String[] args) {
        
       System.out.println(numTilings(3));
    }
}
