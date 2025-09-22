class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;      // just add 1
                return digits;    // no carry, done
            }
            digits[i] = 0; // digit was 9 → becomes 0, carry continues
        }

        // If we reach here, all digits were 9 → e.g. [9,9,9] → [1,0,0,0]
        int[] res = new int[n + 1];
        res[0] = 1;  // automatically fills rest with 0
        return res;
    }
}
