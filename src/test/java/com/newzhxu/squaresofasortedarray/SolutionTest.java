package com.newzhxu.squaresofasortedarray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("stream")
    void sortedSquares(int[] nums, int[] expected) {
        int[] ints = solution.sortedSquares(nums);
        Assertions.assertArrayEquals(expected, ints);
    }

    static Stream<Arguments> stream() {
        return Stream.of(
                Arguments.of(new int[]{-4, -1, 0, 3, 10}, new int[]{0, 1, 9, 16, 100}),
                Arguments.of(new int[]{-7, -3, 2, 3, 11}, new int[]{4, 9, 9, 49, 121})
        );
    }
}