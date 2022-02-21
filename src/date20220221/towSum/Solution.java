package date20220221.towSum;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wugang
 * @date 2020/12/8 10:14
 */
public class Solution {
    public int[] getTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0, length = nums.length; i < length; ++i){
            if (numMap.containsKey(target - nums[i])){
                return new int[] {numMap.get(target - nums[i]), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[] {0};
    }
}
