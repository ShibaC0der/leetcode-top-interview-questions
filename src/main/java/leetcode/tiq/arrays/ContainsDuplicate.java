package leetcode.tiq.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

final class ContainsDuplicate {
    static final class Solution1 {
        public boolean containsDuplicate(int[] nums) {
            Arrays.sort(nums);
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == nums[i - 1]) {
                    return true;
                }
            }
            return false;
        }
    }

    static final class Solution2 {
        public boolean containsDuplicate(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                if (set.contains(num)) {
                    return true;
                }
                set.add(num);
            }
            return false;
        }
    }

    private ContainsDuplicate() {
        throw new IllegalStateException();
    }
}
