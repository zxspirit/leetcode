package com.newzhxu.twosum1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 代码
 * <p>
 * 测试用例
 * <p>
 * 1. 两数之和
 * 已解答
 * 简单
 * 相关标签
 * 相关企业
 * 提示
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * <p>
 * 你可以按任意顺序返回答案。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * 示例 2：
 * <p>
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 * 示例 3：
 * <p>
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * 只会存在一个有效答案
 * <p>
 * <p>
 * 进阶：你可以想出一个时间复杂度小于 O(n2) 的算法吗？
 */

public class Solution {
    public static void main(String[] args) {

        final Solution solution = new Solution();
        Arrays.stream(InputAndOutputEnum.values()).forEach(inputAndOutputEnum -> {
            int[] nums = inputAndOutputEnum.input.nums;
            int target = inputAndOutputEnum.input.target;
            int[] result = solution.twoSum1(nums, target);
            System.out.println(Arrays.toString(result));
            System.out.println(Arrays.equals(result, inputAndOutputEnum.output.nums));
        });
    }

    public int[] twoSum1(int @NotNull [] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            int otherNum = target - num;
            if (map.containsKey(otherNum)) {
                return new int[]{map.get(otherNum), i};
            } else {

                map.put(num, i);
            }
        }
        return new int[]{};
    }

    @AllArgsConstructor
    enum InputAndOutputEnum {
        INPUT_AND_OUTPUT_ENUM_1(Input.builder().nums(new int[]{2, 7, 11, 15}).target(9).build(),
                Output.builder().nums(new int[]{0, 1}).build()),
        INPUT_AND_OUTPUT_ENUM_2(Input.builder().nums(new int[]{3, 2, 4}).target(6).build(),
                Output.builder().nums(new int[]{1, 2}).build()),
        INPUT_AND_OUTPUT_ENUM_3(Input.builder().nums(new int[]{3, 3}).target(6).build(),
                Output.builder().nums(new int[]{0, 1}).build()),


        ;
        final Input input;
        final Output output;
    }

    @Data
    @Builder
    static class Input {
        final int[] nums;
        final int target;
    }

    @Data
    @Builder
    static class Output {
        final int[] nums;
    }

}
