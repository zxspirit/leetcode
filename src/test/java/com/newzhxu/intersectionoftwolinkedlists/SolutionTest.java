package com.newzhxu.intersectionoftwolinkedlists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class SolutionTest {

    Solution a = new Solution();

    @ParameterizedTest
    @MethodSource("listNodeProvider")
    void getIntersectionNode(ListNode headA, ListNode headB, ListNode expected) {
        ListNode intersectionNode = a.getIntersectionNode(headA, headB);
        Assertions.assertEquals(expected, intersectionNode);
    }

    static Stream<Arguments> listNodeProvider() {
        ListNode a1 = ListNode.build(4, 1);
        ListNode b1 = ListNode.build(5, 6, 1);
        ListNode p1 = ListNode.build(8, 4, 5);
        ListNode.connectTail(a1, p1);
        ListNode.connectTail(b1, p1);
        //
        ListNode a2 = ListNode.build(1, 9, 1);
        ListNode b2 = ListNode.build(3);
        ListNode p2 = ListNode.build(2, 4);
        ListNode.connectTail(a2, p2);
        ListNode.connectTail(b2, p2);
        //
        ListNode a3 = ListNode.build(2, 6, 4);
        ListNode b3 = ListNode.build(1, 5);
        return Stream.of(Arguments.of(a1, b1, p1),
                Arguments.of(a2, b2, p2),
                Arguments.of(a3, b3, null)
        );
    }
}