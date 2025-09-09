package com.newzhxu.invertbinarytree;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("stream")
    void invertTree(TreeNode in, TreeNode out) {
        Solution solution = new Solution();
        TreeNode treeNode = solution.invertTree(in);
        Assertions.assertEquals(out, treeNode);
    }

    static Stream<Arguments> stream() {
        TreeNode a1 = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode b1 = new TreeNode(2, new TreeNode(3), new TreeNode(1));
        //
        TreeNode a2 = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7, new TreeNode(6), new TreeNode(9)));
        TreeNode b2 = new TreeNode(4, new TreeNode(7, new TreeNode(9), new TreeNode(6)), new TreeNode(2, new TreeNode(3), new TreeNode(1)));
        //
        return Stream.of(Arguments.of(a1, b1), Arguments.of(a2, b2));
    }
}