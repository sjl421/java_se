package com.thinktik.demo30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个包含 n 个整数的数组  nums ，判断  nums 中是否存在三个元素  a，b，c ， 使得  a + b + c =  0 ？找出所有满足条件且不重复的三元组。
 * <p>
 * 注意：答案中不可以包含重复的三元组。
 * <p>
 * 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 * <p>
 * 满足要求的三元组集合为：
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 * <p>
 * 思路：这道题与两数之和有一定区别，两数之和可以直接用list放置，但是三数和这么做时间复杂度过高O(n^2).  因此先将数组排序，得到的有序数组中，设置一个目标target=0-a，然后再对剩下的
 * 两个数字进行筛选。  递增数组可以选择二分查找，两根指针的方法，此处使用双指针的方法。
 * 注意点： 由于不包含重复元素，因此要去重。只要有两个元素重复，则跳过。  代码如下：
 */
public class GetTriEleArrays {
    List<List<Integer>> res = new ArrayList();
    
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0)
                break;                             //简化，如果>0则说明该三数之和不可能为0
            if (i > 0 && nums[i] == nums[i - 1])
                continue;            //去重
            int target = 0 - nums[i];
            int l = i + 1, r = len - 1;                          //此处必须对i后面的数字进行筛选，不能重复
            while (l < r) {
                List<Integer> list = new ArrayList();
                if (nums[l] + nums[r] == target) {
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    res.add(list);
                    while (r > l && nums[l + 1] == nums[l])
                        l++;          //这个地方改成l-1只会出现一个结果了
                    while (r > l && nums[r] == nums[r - 1])
                        r--;
                    l++;
                    r--;
                } else if (nums[l] + nums[r] > target)
                    r--;
                else
                    l++;
            }
        }
        return res;
    }
}
