package com.newzhxu.climbingstairs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("stream")
    void climbStairs(int n, int k) {
        int result = solution.climbStairs(n);
        Assertions.assertEquals(k, result);
    }

    static Stream<Arguments> stream() {
        return Stream.of(
                Arguments.of(2, 2),
                Arguments.of(3, 3)
        );
    }
}