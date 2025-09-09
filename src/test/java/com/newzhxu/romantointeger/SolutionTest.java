package com.newzhxu.romantointeger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("stream")
    void romanToInt(String input, int expected) {

        int i = solution.romanToInt(input);
        Assertions.assertEquals(expected, i);

    }

    static Stream<Arguments> stream() {
        return Stream.of(
                Arguments.of("III", 3),
                Arguments.of("IV", 4),
                Arguments.of("IX", 9),
                Arguments.of("LVIII", 58),
                Arguments.of("MCMXCIV", 1994)
        );
    }
}