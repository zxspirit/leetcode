package com.newzhxu.maximumdepthofbinarytree104;

import com.newzhxu.TreeNode;
import lombok.AllArgsConstructor;

import java.util.Arrays;

/**
 * 104. 二叉树的最大深度
 * 简单
 * 相关标签
 * 相关企业
 * 给定一个二叉树 root ，返回其最大深度。
 * <p>
 * 二叉树的 最大深度 是指从根节点到最远叶子节点的最长路径上的节点数。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 输入：root = [3,9,20,null,null,15,7]
 * 输出：3
 * 示例 2：
 * <p>
 * 输入：root = [1,null,2]
 * 输出：2
 * <p>
 * <p>
 * 提示：
 * <p>
 * 树中节点的数量在 [0, 104] 区间内。
 * -100 <= Node.val <= 100
 */
public class Solution {
    public static void main(String[] args) {

        final Solution solution = new Solution();
        Arrays.stream(InputAndOutput.values()).forEach(inputAndOutput -> {
            final int output = solution.maxDepth(inputAndOutput.input);
            if (output != inputAndOutput.output) {
                throw new RuntimeException();
            } else {
                System.out.println("success" + output);
            }
        });
    }

    int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.getLeft()) + 1, maxDepth(root.getRight()) + 1);
    }

    @AllArgsConstructor
    enum InputAndOutput {
        CASE1(TreeNode.builder()
                .val(3)
                .left(TreeNode.builder()
                        .val(9)
                        .build())
                .right(TreeNode.builder()
                        .val(20)
                        .left(TreeNode.builder()
                                .val(15)
                                .build())
                        .right(TreeNode.builder()
                                .val(7)
                                .build())
                        .build())
                .build(), 3),
        CASE2(TreeNode.builder()
                .val(1)
                .right(TreeNode.builder()
                        .val(2)
                        .build())
                .build(), 2),
        CASE3(TreeNode.builder()
                .val(0)
                .build(), 1),
        CASE4(null, 0),
        

        ;
        final TreeNode input;
        final int output;
    }
}
