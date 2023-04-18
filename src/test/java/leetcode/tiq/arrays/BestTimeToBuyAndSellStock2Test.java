package leetcode.tiq.arrays;

import leetcode.tiq.arrays.BestTimeToBuyAndSellStock2.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStock2Test {

    private static final Solution solution = new Solution();

    @Test
    void maxProfitExample1() {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};

        int maxProfit = solution.maxProfit(prices);

        assertEquals(7, maxProfit);
    }

    @Test
    void maxProfitExample2() {
        int[] prices = new int[]{1, 2, 3, 4, 5};

        int maxProfit = solution.maxProfit(prices);

        assertEquals(4, maxProfit);
    }

    @Test
    void noPositiveProfitExample3() {
        int[] prices = new int[]{7, 6, 4, 3, 1};

        int maxProfit = solution.maxProfit(prices);

        assertEquals(0, maxProfit);
    }
}