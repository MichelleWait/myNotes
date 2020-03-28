import org.junit.Test;

/**
 * @author ningfei
 * @date 2020/3/25
 */
public class test2 {

    public int solution(int x) {
        int y = Math.abs(x);
        int result = 0;
        while (y > 0) {
            int pop = y % 10;

            y /= 10;
            // 大于等于Integer的正整数的最大值返回0
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            // 小于等于Integer的负整数的最大值返回0
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }


            result = pop + result * 10;

        }
        return (x > 0?result:-result);
    }

    public int solution2(int x){
        int y = Math.abs(x);
       String s = Integer.toString(y);
        s = new StringBuffer(s).reverse().toString();
        int result = Integer.valueOf(s);
        return (x > 0?result:-result);

    }


    @Test
    public void test_01() {
        int x = 321456;
        int y = solution(x);
        System.out.println(y);

    }

    @Test
    public void test_02() {
        int x = -321456;
        int y = solution(x);
        System.out.println(y);

    }

    @Test
    public void test_03() {
        int x = -321456;
        int y = solution2(x);
        System.out.println(y);

    }

}
