/**
 * Find_position_of_set_bit
 */
public class Find_position_of_set_bit {

    public static int findPosition(int n) {
        // code here
        int count = 0;

        // Check if n is a power of 2
        if (n > 0 && (n & (n - 1)) == 0) {
            while (n > 0) {
                if ((n & 1) == 0) {
                    ++count;
                }
                n >>= 1;
            }
            return count+1;
        }

        return -1;
    }
    public static void main(String[] args) {
        System.out.println(findPosition(4));
    }
}