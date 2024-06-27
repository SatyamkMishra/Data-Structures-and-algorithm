public class Swap_without_3rd_var {
    public static void s(int a , int b){
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a + " " + b);
    }
    public static void main(String[] args){
        s(4,5);
    }
}
