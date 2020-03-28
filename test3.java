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
        int ans = 0;//���浱ǰ�õ������������Ӵ������ֵ
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {//֮���� j<= n������Ϊ�����Ӵ��� [i,j),����ҿ�
                if (allUnique(s, i, j)) {
                    ans = Math.max(ans, j - i);
                }
            }//���� ans
        }
        return ans;
    }


    public boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();//��ʼ�� hash set
        for (int i = start; i < end; i++) {//����ÿ���ַ�
            Character ch = s.charAt(i);
            if (set.contains(ch)) {
                return false;
            }//�ж��ַ��ڲ��� set ��
            set.add(ch);//���ڵĻ������ַ���ӵ� set ���
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
                map.put(s.charAt(j), j + 1);//�±� + 1 ���� i Ҫ�ƶ����¸�λ��
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
