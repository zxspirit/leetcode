package com.newzhxu;

import lombok.AllArgsConstructor;

import java.util.Arrays;

/**
 * 111. 二叉树的最小深度
 * 简单
 * 相关标签
 * 相关企业
 * 给定一个二叉树，找出其最小深度。
 * <p>
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 * <p>
 * 说明：叶子节点是指没有子节点的节点。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：root = [3,9,20,null,null,15,7]
 * 输出：2
 * 示例 2：
 * <p>
 * 输入：root = [2,null,3,null,4,null,5,null,6]
 * 输出：5
 * <p>
 * <p>
 * 提示：
 * <p>
 * 树中节点数的范围在 [0, 105] 内
 * -1000 <= Node.val <= 1000
 */
public class MinimumDepthOfBinaryTree111 {
    public static void main(String[] args) {

        MinimumDepthOfBinaryTree111 minimumDepthOfBinaryTree111 = new MinimumDepthOfBinaryTree111();
        Arrays.stream(InputAndOutput.values()).forEach(inputAndOutput -> {
            final int output = minimumDepthOfBinaryTree111.minDepth(inputAndOutput.input);
            if (output != inputAndOutput.output) {
                System.out.println("error" + "---" + output + "---" + inputAndOutput.input);
                throw new RuntimeException();
            } else {
                System.out.println("success" + "---" + output + "---" + inputAndOutput.input);
            }
        });
    }

    int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if (root.left == null && root.right != null) {
            return right + 1;
        } else if (root.left != null && root.right == null) {
            return left + 1;
        } else {
            return Math.min(left, right) + 1;
        }
    }

    @AllArgsConstructor
    enum InputAndOutput {
        CASE1(TreeNode.builder()
                .val(3)
                .left(TreeNode.builder()
                        .val(9)
                        .build()
                ).right(TreeNode.builder()
                        .val(20)
                        .left(TreeNode.builder()
                                .val(15)
                                .build())
                        .right(TreeNode.builder()
                                .val(7)
                                .build())
                        .build()
                ).build(), 2),
        CASE2(TreeNode.builder()
                .val(1)
                .right(TreeNode.builder()
                        .val(2)
                        .build()
                ).build(), 2),
        CASE3(TreeNode.builder()
                .val(0)
                .build(), 1),
        CASE4(null, 0),
        CASE5(TreeNode.builder()
                .val(2).right(TreeNode.builder()
                        .val(3)
                        .right(TreeNode.builder()
                                .val(4).right(TreeNode.builder()
                                        .val(5).right(TreeNode.builder().val(6).build()).build()
                                ).build()
                        ).build()
                ).build(), 5
        ),

        ;
        final TreeNode input;
        final int output;
    }
}
