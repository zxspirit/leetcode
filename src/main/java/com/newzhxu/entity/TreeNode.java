package com.newzhxu.entity;

import lombok.Builder;
import lombok.Data;

/**
 * 二叉树实体类
 */
@Data
@Builder
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
}
