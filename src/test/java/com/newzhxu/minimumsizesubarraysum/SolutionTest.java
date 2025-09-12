package com.newzhxu.minimumsizesubarraysum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("stream")
    void minSubArrayLen(int target, int[] nums, int expected) {
        Solution solution = new Solution();
        int i = solution.minSubArrayLen(target, nums);
        Assertions.assertEquals(expected, i);
    }

    static Stream<Arguments> stream() {
        return Stream.of(
                Arguments.of(7, new int[]{2, 3, 1, 2, 4, 3}, 2),
                Arguments.of(4, new int[]{1, 4, 4}, 1),
                Arguments.of(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1}, 0)
        );
    }
}