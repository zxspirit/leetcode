package com.newzhxu.besttimetobuyandsellstockii;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("stream")
    void maxProfit(int[] prices, int expected) {
        Solution solution = new Solution();
        int i = solution.maxProfit(prices);
        Assertions.assertEquals(expected, i);
    }

    static Stream<Arguments> stream() {
        return Stream.of(
                Arguments.of(new int[]{7, 1, 5, 3, 6, 4}, 7),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 4),
                Arguments.of(new int[]{7, 6, 4, 3, 1}, 0)
        );
    }
}