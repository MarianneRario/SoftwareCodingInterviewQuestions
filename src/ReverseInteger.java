public class ReverseInteger {
    public static void main(String[] args) {

        /*
        PROBLEM:
           Given a signed 32-bit integer x, return x with its digits reversed.
           If reversing x causes the value to go outside the signed 32-bit
           integer range [-231, 231 - 1], then return 0.
         */

        /*
        EXAMPLE 1:
           Input: x = 123
           Output: 321

        EXAMPLE 2:
           Input: x = -123
           Output: -321

       EXAMPLE 3:
           Input: x = 120
           Output: 21
         */

        System.out.println(reverse(123));

    }
    static int reverse(int x){
        int reverse = 0;
        int remainder;
        while(x != 0){
            remainder = x%10;
            x/=10;
            reverse = (reverse * 10) + remainder;
        }
        return reverse;
    }
}
