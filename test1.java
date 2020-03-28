import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ningfei
 * @date 2020/3/24
 */
public class test1 {
   /* LeetCode题解001：两数之和:暴力法*/

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }

            }

        }
        throw new IllegalArgumentException("no sum of nums equals to target");
    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(i, nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            int completion = target - nums[i];
            if (map.containsKey(completion) && map.get(completion) != i) {
                return new int[]{i, map.get(completion)};
            }
        }
        return null;
    }

    @Test
    public void test_01() {
        long time_1 = System.currentTimeMillis();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        long time_2=System.currentTimeMillis();
        System.out.println("结果是:" + result[0] + "," + result[1]);
        System.out.println("time "+ (time_2 -time_1));

    }

    @Test
    public void test_02(){
        long time_1= System.currentTimeMillis();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum2(nums, target);
        long time_2= System.currentTimeMillis();
        System.out.println("结果是:" + result[0] + "," + result[1]);
        System.out.println("time is "+ (time_2 - time_1));

    }

}

