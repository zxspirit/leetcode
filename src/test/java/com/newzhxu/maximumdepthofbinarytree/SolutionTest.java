package com.newzhxu.maximumdepthofbinarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("stream")
    void maxDepth(TreeNode root, int expected) {
        Solution solution = new Solution();
        int i = solution.maxDepth(root);
        Assertions.assertEquals(expected, i);

    }

    static Stream<Arguments> stream() {
        return Stream.of(
                Arguments.of(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(20))), 3),
                Arguments.of(new TreeNode(1, null, new TreeNode(2)), 2)
        );
    }
}