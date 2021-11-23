import java.util.*;

public class TwoSum {
    public static void main(String[] args) {

        /* PROBLEM:
         * Given an array of integers and an integer target,
         * return indices of the two numbers such that they add up to target.
         * You may assume that each input would have exactly one solution, and
         * you may not use the same element twice.
         * You can return the answer in any order.
         */

        /* NOTE:
         * DON'T USE DOUBLE FOR LOOP BECAUSE ITS TIME COMPLEXITY IS O(N^2)
         */

        /* EXAMPLE:
         * Input: num = [2,7,11,15], target = 9
         * Output: [0,1]
         * Output: Because num[0] + num[1] == 9, we return [0, 1].
         */

        int [] num = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(bruteForceTwoSum(num, target)));
        System.out.println(Arrays.toString(twoSum(num, target)));
    }
    static int[] twoSum(int []num, int target){
        HashSet<Integer> compliment = new HashSet<Integer>();
        for (int i=0; i<num.length; i++){
            int diff = Math.abs(target - num[i]);
            if (compliment.contains(diff)){
                return new int[] {Arrays.binarySearch(num, diff), i};
            } else {
                compliment.add(num[i]);
            }
        }
        return new int[]{};
    }

    static int[] bruteForceTwoSum(int []num, int target){
        for (int i=0; i<num.length; i++){
            for (int j=i+1; j<num.length; j++){
                int compliment = Math.abs(num[i] - target);
                if (compliment == num[j]){
                    return new int[] {i, j};
                }
            }
        }
        return new int[]{};
    }
}

