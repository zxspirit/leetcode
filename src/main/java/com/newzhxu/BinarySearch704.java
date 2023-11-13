package com.newzhxu;

import com.newzhxu.entity.RequestAndResult;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

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
    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    static class Input {
        private Integer[] input;
        private Integer target;
    }

    public static void main(String[] args) {

        final BinarySearch704 binarySearch7041 = new BinarySearch704();
        final var requestAndResults = List.of(RequestAndResult.<Input, Integer>builder().
                        request(Input.builder().
                                input(new Integer[]{-1, 0, 3, 5, 9, 12})
                                .target(9)
                                .build())
                        .result(4)
                        .build(),
                RequestAndResult.<Input, Integer>builder()
                        .request(Input.builder()
                                .input(new Integer[]{-1, 0, 3, 5, 9, 12})
                                .target(2)
                                .build())
                        .result(-1)
                        .build());
        System.out.println("=================" + "开始左闭右闭二分查找" + "==============");
        requestAndResults
                .forEach(e -> {
                    final int i = binarySearch7041.search(e.getRequest().input, e.getRequest().target);
                    if (i != e.getResult()) {
                        System.out.println("error" + "---" + i + "---" + e);
                        throw new RuntimeException();
                    } else {
                        System.out.println("success" + "---" + i + "---" + e);
                    }
                });
        System.out.println("=================" + "开始左闭右开二分查找" + "==============");
        requestAndResults
                .forEach(e -> {
                    final int i = binarySearch7041.search1(e.getRequest().input, e.getRequest().target);
                    if (i != e.getResult()) {
                        System.out.println("error" + "---" + i + "---" + e);
                        throw new RuntimeException();
                    } else {
                        System.out.println("success" + "---" + i + "---" + e);
                    }
                });
        System.out.println("=================" + "开始左闭右闭递归二分查找" + "==============");
        requestAndResults
                .forEach(e -> {
                    final int i = binarySearch7041.search3(e.getRequest().input, e.getRequest().target);
                    if (i != e.getResult()) {
                        System.out.println("error" + "---" + i + "---" + e);
                        throw new RuntimeException();
                    } else {
                        System.out.println("success" + "---" + i + "---" + e);
                    }
                });
        System.out.println("=================" + "开始左闭右开递归二分查找" + "==============");
        requestAndResults
                .forEach(e -> {
                    final int i = binarySearch7041.search4(e.getRequest().input, e.getRequest().target);
                    if (i != e.getResult()) {
                        System.out.println("error" + "---" + i + "---" + e);
                        throw new RuntimeException();
                    } else {
                        System.out.println("success" + "---" + i + "---" + e);
                    }
                });
        
    }

    private int search4(Integer[] input, Integer target) {
        return binary1(input, target, 0, input.length);
    }

    // 左闭右开递归
    private Integer binary1(Integer[] input, Integer target, Integer left, Integer right) {
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
    public Integer search(Integer[] nums, int target) {
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
    Integer search1(Integer[] nums, Integer target) {
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
    Integer search3(Integer[] nums, Integer target) {
        return binary(nums, target, 0, nums.length - 1);
    }

    private Integer binary(Integer[] nums, Integer target, Integer left, Integer right) {
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


}
