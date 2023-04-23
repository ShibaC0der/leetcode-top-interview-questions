package leetcode.tiq.arrays;

import leetcode.Uninstantiable;

/**
 * @see <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/559/">...</a>
 * Plus One:
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
 * The digits are ordered from most significant to least significant in left-to-right order.
 * The large integer does not contain any leading 0's.
 * Increment the large integer by one and return the resulting array of digits.
 * ===
 * Constraints:
 * > 1 <= digits.length <= 100
 * > 0 <= digits[i] <= 9
 * > digits does not contain any leading 0's.
 */

class PlusOne extends Uninstantiable {
    static class Solution {
        public int[] plusOne(int[] digits) {
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                }
                digits[i] = 0;
            }
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            return newDigits;
        }
    }
}
