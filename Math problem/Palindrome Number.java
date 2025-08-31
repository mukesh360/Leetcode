//gpt generated 
class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindrome
        // Also, numbers ending with 0 but not 0 itself cannot be palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reverse = 0;
        while (x > reverse) {
            int lastDigit = x % 10;
            reverse = reverse * 10 + lastDigit;
            x = x / 10;
        }

        // For even digit numbers: x == reverse
        // For odd digit numbers: x == reverse/10 (middle digit ignored)
        return (x == reverse || x == reverse / 10);
    }
}
/// class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) return false;

        int reverse = 0;
        int dup = x; // store original number

        while (x != 0) {
            int lastDigit = x % 10;

            // Overflow/Underflow check
            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
                return false;
            }
            if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
                return false;
            }

            reverse = reverse * 10 + lastDigit;
            x = x / 10;
        }

        return dup == reverse;
    }
}

