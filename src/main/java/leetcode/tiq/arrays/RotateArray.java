package leetcode.tiq.arrays;

/**
 * @see <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/">...</a>
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 * ===
 * Constraints:
 * > 1 <= nums.length <= 105
 * > -231 <= nums[i] <= 231 - 1
 * > 0 <= k <= 105
 * ===
 * > Example 1:
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * > Example 2:
 * Input: nums = [-1,-100,3,99], k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 */

final class RotateArray {
    static final class Solution {
        public void rotate(int[] nums, int k) {
            int steps = k % nums.length;
            if (steps == 0) return;
            reverse(nums, 0, nums.length);
            reverse(nums, 0, steps);
            reverse(nums, steps, nums.length);
        }

        private static void reverse(int[] arr, int from, int to) {
            int left = from;
            int right = to - 1;
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    private RotateArray() {
        throw new IllegalStateException();
    }
}
