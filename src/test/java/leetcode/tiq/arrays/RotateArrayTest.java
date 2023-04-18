package leetcode.tiq.arrays;

import leetcode.tiq.arrays.RotateArray.Solution;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {

    private static final Solution solution = new Solution();

    @Test
    void rotateArrayExample1Test() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        solution.rotate(nums, k);

        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, nums);
    }

    @Test
    void rotateArrayExample2Test() {
        int[] nums = new int[]{-1, -100, 3, 99};
        int k = 2;

        solution.rotate(nums, k);

        assertArrayEquals(new int[]{3, 99, -1, -100}, nums);
    }

    @Test
    void rotateArrayWithOneElementTest() {
        int[] nums = new int[]{-1};
        int k = 2;

        solution.rotate(nums, k);

        System.out.println(Arrays.toString(nums));
        assertArrayEquals(new int[]{-1}, nums);
    }

    @Test
    void rotateArrayWhenStepsMoreThanSizeOfArrayElementTest() {
        int[] nums = new int[]{1, 2};
        int k = 3;

        solution.rotate(nums, k);

        System.out.println(Arrays.toString(nums));
        assertArrayEquals(new int[]{2, 1}, nums);
    }


}