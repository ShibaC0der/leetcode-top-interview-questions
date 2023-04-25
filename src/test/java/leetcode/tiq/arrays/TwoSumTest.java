package leetcode.tiq.arrays;

import leetcode.tiq.arrays.TwoSum.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    private final Solution solution = new Solution();

    @Test
    void example1Test() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        int[] result = solution.twoSum(nums, target);

        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void example2Test() {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;

        int[] result = solution.twoSum(nums, target);

        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    void example3Test() {
        int[] nums = new int[]{3, 3};
        int target = 6;

        int[] result = solution.twoSum(nums, target);

        assertArrayEquals(new int[]{0, 1}, result);
    }
}