package com.newzhxu.invertbinarytree;

/*
 * 226. 翻转二叉树
 * 树
 * 深度优先搜索
 * 广度优先搜索
 * 二叉树
 * https://leetcode.cn/problems/invert-binary-tree/description/?envType=study-plan-v2&envId=top-100-liked
 * */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }


}