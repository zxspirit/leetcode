package com.newzhxu.链表.回文链表_234;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("stringStream")
    void isPalindrome(ListNode head, boolean expected) {
        boolean palindrome = solution.isPalindrome(head);
        Assertions.assertEquals(expected, palindrome);
    }

    static Stream<Arguments> stringStream() {
        ListNode a1 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        ListNode a2 = new ListNode(1, new ListNode(2));
        return Stream.of(Arguments.of(a1, true), Arguments.of(a2, false));
    }
}