package com.newzhxu.binarytreeinordertraversal;

import java.util.ArrayList;
import java.util.List;

/**
 * 94. 二叉树的中序遍历
 * <a href="https://leetcode.cn/problems/binary-tree-inorder-traversal/"></a>
 * 栈
 * 树
 * 深度优先搜索
 * 二叉树
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        dfs(result, root);


        return result;

    }

    private void dfs(List<Integer> result, TreeNode root) {
        if (root == null) return;
        dfs(result, root.left);
        result.add(root.val);
        dfs(result, root.right);
    }
}