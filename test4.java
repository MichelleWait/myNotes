import org.junit.Test;

/**
 * @author ningfei
 * @date 2020/3/28
 */
public class test4 {
    /**  题目：有两个数组a和b，其中b有一个元素是a没有的，其他元素都相同，请找出b中这个多余的元素
     * 实际就是a[0]^b[0]^a[1]^b[1]^a[2]^b[2]^a[3]^b[3]^a[4]^b[4]^a[5]^b[5] 因为a只有5个 b有6个
     * 所以以上在和b的最后一个^
     * @param args
     */
    public static void main(String[] args) {
        int[] a = {11, 34, 9, -4, 100, 98};
        int[] b = {34, 55, 11, 9, 100, -4, 98};
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            c ^= a[i] ^ b[i];

        }
        c ^= b[b.length - 1];

        System.out.println(c);
    }

    @Test
    public void test01() {
        int a = 7, b = 9;
        a ^= b ^= a ^= b;
        System.out.println(a);


    }


    @Test
    public void test02(){
        int a = 7, b = 9;
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println(a);
    }



    @Test
    public void test03(){
        int a = 7, b = 9;
        a ^= b;
        System.out.println(a);
    }

    @Test
    public void test04(){
        int a = 7, b = 7;
        int c= a ^b;
        System.out.println(c);
        System.out.println(a&b);
    }


    @Test
    public void test05(){
        int a = 7, b = 1;
        System.out.println(a^b);
        System.out.println(a&b);
    }

    @Test
    public void test06(){
        /**
         * 取模运算，采用位运算实现：
         a % (2^n) 等价于 a & (2^n - 1)
         经典和特殊：a % 2 等价于 a & 1
         乘法运算 采用位运算实现
         a * (2^n) 等价于 a << n
         除法运算转化成位运算
         a / (2^n) 等价于 a>> n
         求相反数
         (~x+1)
        * */
        int a = 9, b = 0;
        System.out.println(a%4);
        System.out.println(a&3);
        System.out.println(~a);
        System.out.println((~a)+1);

    }
}
