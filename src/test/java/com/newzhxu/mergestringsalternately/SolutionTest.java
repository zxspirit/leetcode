package com.newzhxu.mergestringsalternately;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("stream")
    void mergeAlternately(String word1, String word2, String expect) {
        Solution solution = new Solution();
        String s = solution.mergeAlternately(word1, word2);
        Assertions.assertEquals(expect, s);
    }

    static Stream<Arguments> stream() {
        return Stream.of(
                Arguments.of("abc", "pqr", "apbqcr"),
                Arguments.of("ab", "pqrs", "apbqrs"),
                Arguments.of("abcd", "pq", "apbqcd")
        );
    }
}