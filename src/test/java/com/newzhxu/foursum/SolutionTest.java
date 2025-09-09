package com.newzhxu.foursum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("stream")
    void fourSum(int[] nums, int target, List<List<Integer>> expected) {
        List<List<Integer>> lists = solution.fourSum(nums, target);
        Assertions.assertEquals(expected, lists);
    }

    static Stream<Arguments> stream() {
        return Stream.of(
                Arguments.of(new int[]{1, 0, -1, 0, -2, 2}, 0, List.of(
                        List.of(-2, -1, 1, 2),
                        List.of(-2, 0, 0, 2),
                        List.of(-1, 0, 0, 1)
                )),
                Arguments.of(new int[]{2, 2, 2, 2, 2}, 8, List.of(
                        List.of(2, 2, 2, 2)
                ))
        );
    }
}