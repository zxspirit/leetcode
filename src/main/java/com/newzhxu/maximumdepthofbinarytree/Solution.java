package com.newzhxu.maximumdepthofbinarytree;

/**
 * 104. 二叉树的最大深度
 * <a href="https://leetcode.cn/problems/maximum-depth-of-binary-tree/">...</a>
 * 树
 * 深度优先搜索
 * 广度优先搜索
 * 二叉树
 */
class Solution {
    public int maxDepth(TreeNode root) {
        // 如果节点为空则返回0
        if (root == null) {
            return 0;
        }
        // 左边的最大深度
        int left = maxDepth(root.left);
        // 右边的最大深度
        int right = maxDepth(root.right);
        // 返回两边的最大深度加1
        return Math.max(left, right) + 1;
    }
}