package com.newzhxu.feibonaqishulielocf;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("stream")
    void fib(int n, int expected) {
        int fib = solution.fib(n);
        Assertions.assertEquals(expected, fib);
    }

    static Stream<Arguments> stream() {
        return Stream.of(
                Arguments.of(2, 1),
                Arguments.of(3, 2),
                Arguments.of(4, 3),
                Arguments.of(45, 134903163),
                Arguments.of(60, 8745084)

        );
    }
}