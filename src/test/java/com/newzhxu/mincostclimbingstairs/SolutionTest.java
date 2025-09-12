package com.newzhxu.mincostclimbingstairs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("stream")
    void minCostClimbingStairs(int[] cost, int expected) {
        int i = solution.minCostClimbingStairs(cost);
        Assertions.assertEquals(expected, i);
    }

    static Stream<Arguments> stream() {
        return Stream.of(
                Arguments.of(new int[]{10, 15, 20}, 15),
                Arguments.of(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}, 6)
        );
    }
}