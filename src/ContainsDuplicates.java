import java.util.HashSet;

public class ContainsDuplicates {
    public static void main(String[] args) {
        /* PROBLEM:
         * Given an integer array nums, return true if any value
         * appears at least twice in the array, and return false
         * if every element is distinct.
         */
        int []nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> distinct = new HashSet<>();
        for (int i=0; i<nums.length; i++){
            if(distinct.contains(nums[i])){
                return true;
            }
            distinct.add(nums[i]);
        }
        return false;
    }

}
