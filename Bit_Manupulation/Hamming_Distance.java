/*The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, return the Hamming distance between them.
Input: x = 1, y = 4
Output: 2
Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑
The above arrows point to positions where the corresponding bits are different. */

public class Hamming_Distance {
    public static int hammingDistance(int x, int y) {
        int diff = (x^y);
        int count = 0;
        while(diff != 0){
            if(get(diff,0) == 1){
                count++;
            }
            diff = diff>>1;
        }
        return count;
    }

    public static int get(int n, int i){
        int d = (1<<i);

        if((d&n)==0){
            return 0;
        }else{
            return 1;
        }
    }

    public static void main(String[] args){
        System.out.println(hammingDistance(10,7));
    }
}
