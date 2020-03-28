import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author ningfei
 * @date 2020/3/28
 */
public class test3 {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;//保存当前得到满足条件的子串的最大值
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {//之所以 j<= n，是因为我们子串是 [i,j),左闭右开
                if (allUnique(s, i, j)) {
                    ans = Math.max(ans, j - i);
                }
            }//更新 ans
        }
        return ans;
    }


    public boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();//初始化 hash set
        for (int i = start; i < end; i++) {//遍历每个字符
            Character ch = s.charAt(i);
            if (set.contains(ch)) {
                return false;
            }//判断字符在不在 set 中
            set.add(ch);//不在的话将该字符添加到 set 里边
        }
        return true;
    }


        public int Solution2(String s) {
            int n = s.length(), ans = 0;
            Map<Character, Integer> map = new HashMap<>();
            for (int j = 0, i = 0; j < n; j++) {
                if (map.containsKey(s.charAt(j))) {
                    i = Math.max(map.get(s.charAt(j)), i);
                }
                ans = Math.max(ans, j - i + 1);
                map.put(s.charAt(j), j + 1);//下标 + 1 代表 i 要移动的下个位置
            }
            return ans;
        }

    @Test
    public void test() {
        String s = "abcabcdegg";
        int t = lengthOfLongestSubstring(s);
        System.out.println(t);
    }


    @Test
    public void test_02() {
        String s = "abcabcbb";
        int t = Solution2(s);
        System.out.println(t);
    }
}
