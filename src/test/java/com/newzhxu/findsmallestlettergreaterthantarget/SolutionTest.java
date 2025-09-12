package com.newzhxu.findsmallestlettergreaterthantarget;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("stream")
    void nextGreatestLetter(char[] letters, char target, char expected) {
        Solution solution = new Solution();
        char c = solution.nextGreatestLetter(letters, target);
        Assertions.assertEquals(expected, c);
    }

    static Stream<Arguments> stream() {
        return Stream.of(
                Arguments.of(new char[]{'c', 'f', 'j'}, 'a', 'c'),
                Arguments.of(new char[]{'c', 'f', 'j'}, 'c', 'f'),
                Arguments.of(new char[]{'x', 'x', 'y', 'y'}, 'z', 'x')
        );
    }
}