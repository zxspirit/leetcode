package com.newzhxu;

import lombok.AllArgsConstructor;

import java.util.Arrays;

/**
 * 977. 有序数组的平方
 * 简单
 * 相关标签
 * 相关企业
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 * 解释：平方后，数组变为 [16,1,0,9,100]
 * 排序后，数组变为 [0,1,9,16,100]
 * 示例 2：
 * <p>
 * 输入：nums = [-7,-3,2,3,11]
 * 输出：[4,9,9,49,121]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums 已按 非递减顺序 排序
 * <p>
 * <p>
 * 进阶：
 * <p>
 * 请你设计时间复杂度为 O(n) 的算法解决本问题
 */
public class SquaresOfASortedArray {
    public static void main(String[] args) {

        SquaresOfASortedArray squaresOfASortedArray = new SquaresOfASortedArray();
        Arrays.stream(InoutAndOutput.values()).forEach(inoutAndOutput -> {
            final int[] output = squaresOfASortedArray.sortedSquares(inoutAndOutput.input);
            if (!Arrays.equals(output, inoutAndOutput.output)) {
                System.out.println("error" + "---" + Arrays.toString(output) + "---" + Arrays.toString(inoutAndOutput.input));
                throw new RuntimeException();
            } else {
                System.out.println("success" + "---" + Arrays.toString(output) + "---" + Arrays.toString(inoutAndOutput.input));
            }
        });
    }

    private int[] sortedSquares(int[] nums) {
        int right = nums.length - 1;
        int left = 0;
        int[] result = new int[nums.length];
        int index = result.length - 1;
        while (left <= right) {
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                // 正数的相对位置是不变的， 需要调整的是负数平方后的相对位置
                result[index--] = nums[left] * nums[left];
                ++left;
            } else {
                result[index--] = nums[right] * nums[right];
                --right;
            }
        }
        return result;
    }

    @AllArgsConstructor
    enum InoutAndOutput {
        CASE1(new int[]{-4, -1, 0, 3, 10}, new int[]{0, 1, 9, 16, 100}),
        CASE2(new int[]{-7, -3, 2, 3, 11}, new int[]{4, 9, 9, 49, 121}),
        ;
        final int[] input;
        final int[] output;
    }

}
