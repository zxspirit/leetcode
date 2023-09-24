package com.newzhxu;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Arrays;

/**
 * 27. 移除元素
 * 简单
 * 相关标签
 * 相关企业
 * 提示
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * <p>
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * <p>
 * <p>
 * <p>
 * 说明:
 * <p>
 * 为什么返回数值是整数，但输出的答案是数组呢?
 * <p>
 * 请注意，输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
 * <p>
 * 你可以想象内部操作如下:
 * <p>
 * // nums 是以“引用”方式传递的。也就是说，不对实参作任何拷贝
 * int len = removeElement(nums, val);
 * <p>
 * // 在函数里修改输入数组对于调用者是可见的。
 * // 根据你的函数返回的长度, 它会打印出数组中 该长度范围内 的所有元素。
 * for (int i = 0; i < len; i++) {
 * print(nums[i]);
 * }
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [3,2,2,3], val = 3
 * 输出：2, nums = [2,2]
 * 解释：函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。你不需要考虑数组中超出新长度后面的元素。例如，函数返回的新长度为 2 ，而 nums = [2,2,3,3] 或 nums = [2,2,0,0]，也会被视作正确答案。
 * 示例 2：
 * <p>
 * 输入：nums = [0,1,2,2,3,0,4,2], val = 2
 * 输出：5, nums = [0,1,4,0,3]
 * 解释：函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。注意这五个元素可为任意顺序。你不需要考虑数组中超出新长度后面的元素。
 * <p>
 * <p>
 * 提示：
 * <p>
 * 0 <= nums.length <= 100
 * 0 <= nums[i] <= 50
 * 0 <= val <= 100
 */
public class RemoveElement27 {
    public static void main(String[] args) {
        RemoveElement27 removeElement27 = new RemoveElement27();
        Arrays.stream(InputAndOutput.values()).forEach(e -> {
            System.out.println(Arrays.toString(e.input.nums));
            int afterRemoveLength = removeElement27.removeElement(e.input.nums, e.input.targetToRemove);
            if (afterRemoveLength != e.output) {
                System.out.println("error" + "---" + afterRemoveLength + "---" + Arrays.toString(e.input.nums));
                throw new RuntimeException();
            } else {
                System.out.println("success" + "---" + afterRemoveLength + "---" + Arrays.toString(e.input.nums));
            }
        });
    }

    public int removeElement(int[] nums, int val) {


        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != val) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }

    @AllArgsConstructor
    enum InputAndOutput {
        CASE1(Input.builder()
                .nums(new int[]{3, 2, 2, 3})
                .targetToRemove(3)
                .build(), 2),
        CASE2(Input.builder()
                .targetToRemove(2)
                .nums(new int[]{0, 1, 2, 2, 3, 0, 4, 2})
                .build(), 5),
        ;
        final Input input;
        final int output;
    }

    @Data
    @Builder
    static class Input {
        int[] nums;
        int targetToRemove;
    }
}
