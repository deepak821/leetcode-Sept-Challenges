//Given a non-empty array of numbers, a0, a1, a2, … , an-1, where 0 ≤ ai < 231.

//Find the maximum result of ai XOR aj, where 0 ≤ i, j < n.

//Example:

//Input: [3, 10, 5, 25, 2, 8]

//Output: 28

//Explanation: The maximum result is 5 ^ 25 = 28.
import java.util.*;
class Solution {
    public int findMaximumXOR(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int xor=nums[i]^nums[j];
                if(xor>max)
                    max=xor;
                
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int ans=findMaximumXOR(nums);
        System.out.println(ans);
    }
}