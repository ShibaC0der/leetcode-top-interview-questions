package leetcode.tiq.arrays;

import leetcode.Uninstantiable;

import java.util.*;

/**
 * @see <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/">...</a>
 * Intersection of Two Arrays II
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must appear as many times as it shows in both arrays
 * and you may return the result in any order.
 * ===
 * Constraints:
 * > 1 <= nums1.length, nums2.length <= 1000
 * > 0 <= nums1[i], nums2[i] <= 1000
 * ===
 * Follow up:
 * 1. What if the given array is already sorted? How would you optimize your algorithm?
 * 2. What if nums1's size is small compared to nums2's size? Which algorithm is better?
 * 3. What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 */

class IntersectionOfTwoArrays2 extends Uninstantiable {
    static class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            int i = 0, j = 0;
            List<Integer> list = new ArrayList<>();
            while (i < nums1.length && j < nums2.length) {
                if (nums1[i] == nums2[j]) {
                    list.add(nums1[i]);
                    i++;
                    j++;
                } else if (nums1[i] > nums2[j]) {
                    j++;
                } else {
                    i++;
                }
            }
            int[] result = new int[list.size()];
            for(int k = 0;  k < result.length; k++){
                result[k] = list.get(k);
            }
            return result;
        }
    }
}
