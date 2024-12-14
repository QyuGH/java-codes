public class Solution {
    public static boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        int orig = x;
        int reverseNum = 0;
        while (x > 0){
            int digit = x % 10;
            reverseNum = reverseNum * 10 + digit;
            x /= 10;
        }
        return orig == reverseNum;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(13531));
    }
}
