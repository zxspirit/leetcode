package com.newzhxu.houserobberiii;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("stream")
    void rob(TreeNode treeNode, int expected) {
        int rob = solution.rob(treeNode);
        Assertions.assertEquals(expected, rob);
    }

    static Stream<Arguments> stream() {
        return Stream.of(
                Arguments.of(new TreeNode(3, new TreeNode(2, null, new TreeNode(3)),
                        new TreeNode(3, null, new TreeNode(1))), 7),
                Arguments.of(new TreeNode(3, new TreeNode(4, new TreeNode(1), new TreeNode(3)), new TreeNode(5, null, new TreeNode(1))), 9)
        );
    }
}