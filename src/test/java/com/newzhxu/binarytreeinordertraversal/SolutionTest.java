package com.newzhxu.binarytreeinordertraversal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("stream")
    void inorderTraversal(TreeNode treeNode, List<Integer> expected) {
        List<Integer> integers = solution.inorderTraversal(treeNode);
        Assertions.assertEquals(expected, integers);
    }

    static Stream<Arguments> stream() {
        return Stream.of(
                Arguments.of(new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null)),
                        List.of(1, 3, 2)),
                Arguments.of(new TreeNode(1), List.of(1)),
                Arguments.of(null, List.of())
        );
    }
}