package leetcode.tiq.arrays;

/**
 * @see <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/">...</a>
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
 * Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
 * > Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially.
 * The remaining elements of nums are not important as well as the size of nums.
 * > Return k.
 * ====
 * Constraints:
 * 1) 1 <= nums.length <= 3 * 104
 * 2) -100 <= nums[i] <= 100
 * 3) nums is sorted in non-decreasing order.
 * ====
 * Exapmple 1:
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2,_]
 * Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 */

class RemoveDuplicatesFromSortedArray {
    static class Solution {
        public int removeDuplicates(int[] nums) {
            int k = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1]) {
                    nums[k] = nums[i];
                    k++;
                }
            }
            return k;
        }
    }

    private RemoveDuplicatesFromSortedArray() {
        throw new IllegalStateException();
    }
}
