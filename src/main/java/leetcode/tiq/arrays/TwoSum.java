package leetcode.tiq.arrays;

import leetcode.Uninstantiable;

import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/546/">...</a>
 * Two Sum:
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * Constraints:
 * > 2 <= nums.length <= 10^4
 * > -10^9 <= nums[i] <= 10^9
 * > -10^9 <= target <= 10^9
 * > Only one valid answer exists
 */
class TwoSum extends Uninstantiable {
    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                Integer diff = target - nums[i];
                if (map.containsKey(diff)) {
                    return new int[]{map.get(diff), i};
                }
                map.put(nums[i], i);
            }
            return new int[2];
        }
    }
}
