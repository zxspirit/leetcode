package com.newzhxu.palindromenumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("stream")
    void isPalindrome(int num, boolean expected) {
        boolean palindrome = solution.isPalindrome(num);
        Assertions.assertEquals(expected, palindrome);
    }

    static Stream<Arguments> stream() {
        return Stream.of(
                Arguments.of(121, true),
                Arguments.of(-121, false),
                Arguments.of(10, false)
        );
    }
}