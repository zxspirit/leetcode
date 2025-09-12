package com.newzhxu.removeelement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("stream")
    void removeElement(int[] nums, int val, int[] expect, int k) {
        int i = solution.removeElement(nums, val);
        Assertions.assertEquals(k, i);
        Assertions.assertEquals(
                Arrays.stream(expect).limit(k).boxed().collect(Collectors.toSet()),
                Arrays.stream(nums).limit(i).boxed().collect(Collectors.toSet())
        );

    }

    static Stream<Arguments> stream() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 2, 3}, 3,
                        new int[]{2, 2, 0, 0}, 2),
                Arguments.of(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2,
                        new int[]{0, 1, 4, 0, 3, 0, 0, 0}, 5)
        );
    }
}