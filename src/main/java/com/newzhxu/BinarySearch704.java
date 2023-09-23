package com.newzhxu;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Arrays;

/**
 * 704. 二分查找
 * 已解答
 * 简单
 * 相关标签
 * 相关企业
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [-1,0,3,5,9,12], target = 9
 * 输出: 4
 * 解释: 9 出现在 nums 中并且下标为 4
 * 示例 2:
 * <p>
 * 输入: nums = [-1,0,3,5,9,12], target = 2
 * 输出: -1
 * 解释: 2 不存在 nums 中因此返回 -1
 * <p>
 * <p>
 * 提示：
 * <p>
 * 你可以假设 nums 中的所有元素是不重复的。
 * n 将在 [1, 10000]之间。
 * nums 的每个元素都将在 [-9999, 9999]之间。
 */
public class BinarySearch704 {
    public static void main(String[] args) {
        BinarySearch704 binarySearch704 = new BinarySearch704();
        System.out.println("=================" + "开始左闭右闭二分查找" + "==============");
        Arrays.stream(InputAndOutput.values()).forEach(e -> {
            final int output = binarySearch704.search(e.input.getInput(), e.input.getTarget());
            if (output != e.output) {
                System.out.println("error" + "---" + output + "---" + e.input);
                throw new RuntimeException();
            } else {
                System.out.println("success" + "---" + output + "---" + e.input);
            }
        });
        System.out.println("=================" + "开始左闭右开二分查找" + "==============");
        Arrays.stream(InputAndOutput.values()).forEach(e -> {
            final int output = binarySearch704.search1(e.input.getInput(), e.input.getTarget());
            if (output != e.output) {
                System.out.println("error" + "---" + output + "---" + e.input);
                throw new RuntimeException();
            } else {
                System.out.println("success" + "---" + output + "---" + e.input);
            }
        });
        System.out.println("=================" + "开始左闭右闭递归二分查找" + "==============");
        Arrays.stream(InputAndOutput.values()).forEach(e -> {
            final int output = binarySearch704.search3(e.input.getInput(), e.input.getTarget());
            if (output != e.output) {
                System.out.println("error" + "---" + output + "---" + e.input);
                throw new RuntimeException();
            } else {
                System.out.println("success" + "---" + output + "---" + e.input);
            }
        });
        System.out.println("=================" + "开始左闭右开递归二分查找" + "==============");
        Arrays.stream(InputAndOutput.values()).forEach(e -> {
            final int output = binarySearch704.search4(e.input.getInput(), e.input.getTarget());
            if (output != e.output) {
                System.out.println("error" + "---" + output + "---" + e.input);
                throw new RuntimeException();
            } else {
                System.out.println("success" + "---" + output + "---" + e.input);
            }
        });
    }

    private int search4(int[] input, int target) {
        return binary1(input, target, 0, input.length);
    }

    // 左闭右开递归
    private int binary1(int[] input, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int middle = (left + right) >>> 1;
        if (input[middle] > target) {
            return binary1(input, target, left, middle - 1);
        } else if (input[middle] < target) {
            return binary(input, target, middle, right);
        } else {
            return middle;
        }
    }

    // 左闭右闭
    public int search(int[] nums, int target) {
//        System.out.println("左闭右闭");
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = (left + right) >>> 1;
            if (nums[middle] > target) {
                right = middle - 1;

            } else if (nums[middle] < target) {
                left = middle + 1;

            } else {
                return middle;
            }
        }
        return -1;
    }

    // 左闭右开
    int search1(int[] nums, int target) {
//        System.out.println("左闭右开");
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int middle = (left + right) >>> 1;
            if (nums[middle] < target) {
                left = middle + 1;
            } else if (nums[middle] > target) {
                right = middle;
            } else {
                return middle;
            }
        }
        return -1;
    }

    // 递归二分查找
    int search3(int[] nums, int target) {
        return binary(nums, target, 0, nums.length - 1);
    }

    private int binary(int[] nums, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int middle = (left + right) >>> 1;
        if (nums[middle] > target) {
            return binary(nums, target, left, middle - 1);
        } else if (nums[middle] < target) {
            return binary(nums, target, middle + 1, right);
        } else {
            return middle;
        }

    }

    @AllArgsConstructor
    enum InputAndOutput {
        CASE1(Input.builder().input(new int[]{-1, 0, 3, 5, 9, 12}).target(9).build(), 4),
        CASE2(Input.builder().input(new int[]{-1, 0, 3, 5, 9, 12}).target(2).build(), -1),
        ;
        final Input input;
        final int output;
    }

    @Data
    @Builder
    static class Input {
        final int[] input;
        final int target;
    }
}
