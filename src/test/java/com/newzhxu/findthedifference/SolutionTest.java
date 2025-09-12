package com.newzhxu.findthedifference;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("stream")
    void findTheDifference(String s, String t, char expected) {
        Solution solution = new Solution();
        char theDifference = solution.findTheDifference(s, t);
        Assertions.assertEquals(expected, theDifference);
    }

    static Stream<Arguments> stream() {
        return Stream.of(
                Arguments.of("abcd", "abcde", 'e'),
                Arguments.of("", "y", 'y')
        );
    }
}