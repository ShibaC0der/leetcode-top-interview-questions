package leetcode.tiq.arrays;

import leetcode.Uninstantiable;

/**
 * @see <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/567/">...</a>
 * Move Zeroes:
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 * ===
 * Constraints:
 * > 1 <= nums.length <= 104
 * > -231 <= nums[i] <= 231 - 1
 *
 */

public class MoveZeroes extends Uninstantiable {
    static class Solution {
        public void moveZeroes(int[] nums) {
            int i = 0;
            int j = 0;
            while (i < nums.length) {
                if (nums[i] != 0) {
                    nums[j++] = nums[i];
                }
                i++;
            }
            for(int k = j; k < nums.length; k++){
                nums[k] = 0;
            }
        }
    }
}
