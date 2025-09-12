package com.newzhxu.addstrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("stream")
    void addStrings(String num1, String num2, String expected) {
        Solution solution = new Solution();
        String s = solution.addStrings(num1, num2);
        Assertions.assertEquals(expected, s);
    }

    static Stream<Arguments> stream() {
        return Stream.of(
                Arguments.of("11", "123", "134"),
                Arguments.of("456", "77", "533"),
                Arguments.of("0", "0", "0")
        );
    }
}