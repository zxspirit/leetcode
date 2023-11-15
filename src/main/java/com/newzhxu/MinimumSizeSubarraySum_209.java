package com.newzhxu;

import com.newzhxu.entity.RequestAndResult;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * 209. 长度最小的子数组
 * 给定一个含有 n 个正整数的数组和一个正整数 target 。
 * <p>
 * 找出该数组中满足其总和大于等于 target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：target = 7, nums = [2,3,1,2,4,3]
 * 输出：2
 * 解释：子数组 [4,3] 是该条件下的长度最小的子数组。
 * 示例 2：
 * <p>
 * 输入：target = 4, nums = [1,4,4]
 * 输出：1
 * 示例 3：
 * <p>
 * 输入：target = 11, nums = [1,1,1,1,1,1,1,1]
 * 输出：0
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= target <= 109
 * 1 <= nums.length <= 105
 * 1 <= nums[i] <= 105
 * <p>
 * <p>
 * 进阶：
 * <p>
 * 如果你已经实现 O(n) 时间复杂度的解法, 请尝试设计一个 O(n log(n)) 时间复杂度的解法。
 */
public class MinimumSizeSubarraySum_209 {
    public static void main(String[] args) {
        MinimumSizeSubarraySum_209 minimumSizeSubarraySum209 = new MinimumSizeSubarraySum_209();
        List.of(RequestAndResult.<Input, Integer>builder().request(Input.builder().target(7).nums(new int[]{2, 3, 1, 2, 4, 3}).build()).result(2).build(),
                        RequestAndResult.<Input, Integer>builder().request(Input.builder().target(4).nums(new int[]{1, 4, 4}).build()).result(1).build(),
                        RequestAndResult.<Input, Integer>builder().request(Input.builder().target(11).nums(new int[]{1, 1, 1, 1, 1, 1, 1, 1}).build()).result(0).build())
                .forEach(e -> {
                    final int i = minimumSizeSubarraySum209.minSubArrayLen(e.getRequest().getTarget(), e.getRequest().getNums());
                    if (i != e.getResult()) {
                        System.out.println("error" + "---" + i + "---" + e.getRequest());
                        throw new RuntimeException();
                    } else {
                        System.out.println("success" + "---" + i + "---" + e.getRequest());
                    }
                });

    }

    // 滑动窗口
    public int minSubArrayLen(int s, int[] nums) {
        int left = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= s) {
                result = Math.min(result, right - left + 1);
                sum -= nums[left++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }

    @Data
    @Builder
    static class Input {
        private int target;
        private int[] nums;
    }
}
