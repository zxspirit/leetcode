package com.newzhxu.houserobberii;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("stream")
    void rob(int[] nums, int expected) {
        int rob = solution.rob(nums);
        Assertions.assertEquals(expected, rob);
    }

    static Stream<Arguments> stream() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, 2}, 3),
                Arguments.of(new int[]{1, 2, 3, 1}, 4),
                Arguments.of(new int[]{1, 2, 3}, 3)
        );
    }
}