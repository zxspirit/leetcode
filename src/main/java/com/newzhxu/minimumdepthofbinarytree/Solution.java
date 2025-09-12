package com.newzhxu.minimumdepthofbinarytree;

/**
 * 111. 二叉树的最小深度
 * <a href="https://leetcode.cn/problems/minimum-depth-of-binary-tree/">...</a>
 * 树
 * 深度优先搜索
 * 广度优先搜索
 * 二叉树
 */
class Solution {
    public int minDepth(TreeNode root) {
        // 如果节点为空则返回0
        if (root == null) {
            return 0;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);

        if (root.left == null && root.right != null) {// 左边为空，右边不为空，返回右边的深度加1
            return right + 1;
        } else if (root.left != null && root.right == null) {// 右边为空，左边不为空，返回左边深度加1
            return left + 1;
        } else {// 左右都不为空，返回两边深度的最小值加1
            return Math.min(left, right) + 1;
        }
    }
}