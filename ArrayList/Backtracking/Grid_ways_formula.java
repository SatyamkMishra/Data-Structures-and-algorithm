class Grid_ways_formula{
    public static int ways(int n, int m){

        int w = fact(n-1+m-1)/(fact(n-1)*fact(m-1));

        return w;
    }

    public static int fact(int n){
        if(n==0){
            return 1;
        }

        return n*fact(n-1);
    }
    public static void main(String[] args){

        System.out.println(ways(10,10));
    }
}