/**
 * @author ningfei
 * @date 2020/3/22
 */
public class AutoUnboxingTest {
    //需要注意的是f1、f2、f3、f4四个变量都是Integer对象引用，所以下面的 == 运算比较的不是值而是引用。
    // 如果整型字面量的值在-128到127之间，那么不会new新的Integer对象，而是直接引用常量池中的Integer对象，
    // 所以上面的面试题中f1==f2的结果是true，而f3==f4的结果是false。

        public static void main(String[] args) {
            Integer a = new Integer(3);
            // 将3自动装箱成Integer类型
            Integer b = 3;
            int c = 3;
            // false 两个引用没有引用同一对象
            System.out.println(a == b);
            // true a自动拆箱成int类型再和c比较
            System.out.println(a == c);

            Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;
            // true
            System.out.println(f1 == f2);
            // false
            System.out.println(f3 == f4);
        }
    }

