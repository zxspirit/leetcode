package com.newzhxu.minimumdepthofbinarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("stream")
    void minDepth(TreeNode root, int expected) {
        Solution solution = new Solution();
        int i = solution.minDepth(root);
        Assertions.assertEquals(expected, i);
    }

    static Stream<Arguments> stream() {
        return Stream.of(
                Arguments.of(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7))), 2),
                Arguments.of(new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4, null, new TreeNode(5, null, new TreeNode(6))))), 5)
        );
    }
}