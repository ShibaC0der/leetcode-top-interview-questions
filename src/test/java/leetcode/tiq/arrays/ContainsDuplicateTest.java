package leetcode.tiq.arrays;

import leetcode.tiq.arrays.ContainsDuplicate.Solution1;
import leetcode.tiq.arrays.ContainsDuplicate.Solution2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsDuplicateTest {

    private final Solution1 solution1 = new Solution1();
    private final Solution2 solution2 = new Solution2();

    @Test
    void example1Test() {
        int[] array = new int[]{1, 2, 3, 1};

        assertTrue(solution1.containsDuplicate(array), "Solution1. Array contains duplicate");
        assertTrue(solution2.containsDuplicate(array), "Solution2. Array contains duplicate");
    }

    @Test
    void example2Test() {
        int[] array = new int[]{1, 2, 3, 4};

        assertFalse(solution1.containsDuplicate(array), "Solution1. Array contains distinct values");
        assertFalse(solution2.containsDuplicate(array), "Solution2. Array contains distinct values");
    }

    @Test
    void example3Test() {
        int[] array = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        assertTrue(solution1.containsDuplicate(array), "Solution1. Array contains duplicate");
        assertTrue(solution2.containsDuplicate(array), "Solution2. Array contains duplicate");
    }

    @Test
    void emptyArrayTest(){
        int[] array = new int[]{};

        assertFalse(solution1.containsDuplicate(array), "Solution1");
        assertFalse(solution2.containsDuplicate(array), "Solution2");
    }

}