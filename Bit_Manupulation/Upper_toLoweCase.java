public class Upper_toLoweCase {
    public static void main(String[] args){
        for(char c='A';c<='Z';c++){
            System.out.print((char)(c | ' '));
        }
    }
}
