package com.newzhxu.链表.反转链表_206;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("stringStream")
    void reverseList(ListNode in, ListNode out) {
        ListNode listNode = solution.reverseList(in);
        Assertions.assertEquals(out, listNode);

    }

    static Stream<Arguments> stringStream() {
        ListNode in1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode out1 = new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1)))));
        //
        ListNode in2 = new ListNode(1, new ListNode(2));

        ListNode out2 = new ListNode(2, new ListNode(1));
        //
        return Stream.of(Arguments.of(in1, out1),
                Arguments.of(in2, out2),
                Arguments.of(null, null)

        );
    }


}