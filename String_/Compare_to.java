public class Compare_to{
    public static void main(String[] args){
        String f[] = {"Apple" , "Banana" , "Mango"};
        String largest = f[0];
        for(int i=1;i<f.length;i++){
            if(largest.compareTo(f[i])<0){
                largest = f[i];
            }
        } 
        System.out.println(largest);

        for(int i=1;i<f.length;i++){
            if(largest.compareToIgnoreCase(f[i])<0){
                largest = f[i];
            }
        } 
        System.out.println(largest);
    }
}