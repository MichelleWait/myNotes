import org.junit.Test;

/**
 * @author ningfei
 * @date 2019/1/3
 */
public class stringTest {

// 字符串反转
    public String stringRerverse(String  string){
        if(null == string || string.length() <0 ){
            return string;
        }
         return new StringBuffer(string).reverse().toString();
    }

    public boolean repeatedSubstringPattern(String s) {
        int l = s.length();
        int[] next = new int[l];
        next[0] = -1;
        int i, j = -1;
        for (i = 1; i < l; i++) {
            while (j >= 0 && s.charAt(i) != s.charAt(j + 1)) {
                j = next[j];
            }
            if (s.charAt(i) == s.charAt(j + 1)) {
                j++;
            }
            next[i] = j;
        }
        int lenSub = l - 1 - next[l - 1];
        return lenSub != l && l % lenSub ==0;
    }


    @Test
    public void test_01(){
        String myTest = "abcabcd";
        System.out.println(stringRerverse(myTest));
    }

    @Test
    public void test_02(){
        String myTest = "abcabcabcabc";
        System.out.println(repeatedSubstringPattern(myTest));

    }
}
