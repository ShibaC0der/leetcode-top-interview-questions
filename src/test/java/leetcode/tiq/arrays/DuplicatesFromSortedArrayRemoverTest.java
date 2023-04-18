package leetcode.tiq.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DuplicatesFromSortedArrayRemoverTest {

    private final static DuplicatesFromSortedArrayRemover remover = new DuplicatesFromSortedArrayRemover();

    @Test
    void removeFromArrayWithOneElementTest() {
        int[] input = new int[]{1};

        int result = remover.removeDuplicates(input);

        assertEquals(1, result);
        assertArrayEquals(input, new int[]{1});
    }

    @Test
    void removeFromArrayWithSameElements() {
        int[] input = new int[]{1, 1, 1};

        int result = remover.removeDuplicates(input);

        assertEquals(1, result);
        assertArrayEquals(input, new int[]{1, 1, 1});
    }

    @Test
    void removeFromArrayWithDuplicates() {
        int[] input = new int[]{1, 1, 2, 2, 3, 3};

        int result = remover.removeDuplicates(input);

        System.out.println(Arrays.toString(input));

        assertEquals(3, result);
        assertArrayEquals(input, new int[]{1, 2, 3, 2, 3, 3});
    }
}