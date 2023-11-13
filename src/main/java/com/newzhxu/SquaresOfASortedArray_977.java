package com.newzhxu;

import com.newzhxu.entity.RequestAndResult;

import java.util.Arrays;
import java.util.List;

/**
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
public class SquaresOfASortedArray_977 {
    public static void main(String[] args) {
        final SquaresOfASortedArray_977 squaresOfASortedArray977 = new SquaresOfASortedArray_977();
        List.of(RequestAndResult.<Integer[], Integer[]>builder()
                                .request(new Integer[]{-4, -1, 0, 3, 10})
                                .result(new Integer[]{0, 1, 9, 16, 100})
                                .build(),
                        RequestAndResult.<Integer[], Integer[]>builder()
                                .request(new Integer[]{-7, -3, 2, 3, 11})
                                .result(new Integer[]{4, 9, 9, 49, 121})
                                .build())
                .forEach(e -> {
                    final Integer[] ints = squaresOfASortedArray977.sortedSquares(e.getRequest());
                    if (Arrays.equals(ints, e.getResult())) {
                        System.out.println("success" + "---" + Arrays.toString(ints));
                    } else {
                        System.out.println("error" + "---" + Arrays.toString(ints));
                        throw new RuntimeException();
                    }
                });
    }


    public Integer[] sortedSquares(Integer[] nums) {

        int left = 0;
        int right = nums.length - 1;
        Integer[] result = new Integer[nums.length];
        int index = nums.length - 1;
        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[index] = nums[left] * nums[left];
                left++;
            } else {
                result[index] = nums[right] * nums[right];
                right--;
            }
            index--;
        }
        return result;
    }
}
