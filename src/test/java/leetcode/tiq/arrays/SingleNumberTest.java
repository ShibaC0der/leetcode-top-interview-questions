package leetcode.tiq.arrays;

import leetcode.tiq.arrays.SingleNumber.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

    private final Solution solution = new Solution();

    @Test
    void example1Test() {
        int[] nums = new int[]{2, 2, 1};

        assertEquals(1, solution.singleNumber(nums));
    }

    @Test
    void example2Test() {
        int[] nums = new int[]{4, 1, 2, 1, 2};

        assertEquals(4, solution.singleNumber(nums));
    }

    @Test
    void example3Test() {
        int[] nums = new int[]{1};

        assertEquals(1, solution.singleNumber(nums));
    }
}
