/*ou are given a 0-indexed integer array nums and an integer k.

Return an integer that denotes the sum of elements in nums whose corresponding indices have exactly k set bits in their binary representation.

The set bits in an integer are the 1's present when it is written in binary.

For example, the binary representation of 21 is 10101, which has 3 set bits.
 

Example 1:

Input: nums = [5,10,1,5,2], k = 1
Output: 13
Explanation: The binary representation of the indices are: 
0 = 0002
1 = 0012
2 = 0102
3 = 0112
4 = 1002 
Indices 1, 2, and 4 have k = 1 set bits in their binary representation.
Hence, the answer is nums[1] + nums[2] + nums[4] = 13.*/
import java.util.*;
class SumIndices {
    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;

        for(int i=0;i<nums.size();i++){
            if(count(i)==k){
                sum += nums.get(i);
            }
        }

        return sum;
    }

    public static int count(int n){
        int c = 0;

        while(n != 0){
            if((n&1)==1){
                c++;
            }
            n = n>>1;
        }

        return c;
    }

public static void main(String[] args) {

List<Integer> l = new ArrayList<>();
l.add(5);
l.add(10);
l.add(1);
l.add(5);
l.add(2);

        System.out.println(sumIndicesWithKSetBits(l,1));
    }
}