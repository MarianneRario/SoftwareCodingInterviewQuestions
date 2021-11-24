import java.util.HashSet;

public class FirstDuplicates {
    public static void main(String[] args) {
        /* PROBLEM:
         *  Given an array a that contains only numbers in the
         *  range from 1 to a.length , find the first duplicate
         *  number for which the second occurrence has the minimal index.
         *  In other words, if there are more than 1 duplicated numbers,
         *  return the number for which the second occurrence has a smaller
         *  index than the second occurrence of the other number does.
         *  If there are no such elements, return -1.
         */

        /* EXAMPLE:
         * For a = [2, 1, 3, 5, 3, 2], the output should be firstDuplicate(a) = 3.
         * There are 2 duplicates: numbers 2 and 3. The second occurrence of 3 has a smaller index than the second occurrence of 2 does, so the answer is 3.
         * For a = [2, 2], the output should be firstDuplicate(a) = 2;
         * For a = [2, 4, 3, 5, 1], the output should be firstDuplicate(a) = -1
         */

        // NOTE:
        // For this problem, we'll be using "hashset", whenever you hear duplicates or unique values, use Hashset.
        // Hashset helps us store data in one convenient place. It is build specifically for unique values.
        // Hashset also takes no time to access back the values that we stored in (constant time).

        /* PSEUDOCODE:
         * > loop through the array of numbers one by one
         * > add them to the hashset
         * > the first time we see a duplicate in the hashset
         * > that is the first duplicate that we see, return it.
         */

        int [] a = {2, 1, 3, 5, 3, 2};
        int [] b = {2, 4, 3, 5, 1};
        System.out.println(firstDuplicates(a));
        System.out.println(firstDuplicates(b));

    }
    static int firstDuplicates(int []a){
        HashSet<Integer> seenValues = new HashSet<Integer>();
        for (int i=0; i<a.length; i++){
            if (seenValues.contains(a[i])){
                return a[i];
            } else {
                seenValues.add(a[i]);
            }
        }
        return -1;
    }
}
