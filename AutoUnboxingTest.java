/**
 * @author ningfei
 * @date 2020/3/22
 */
public class AutoUnboxingTest {
    //��Ҫע�����f1��f2��f3��f4�ĸ���������Integer�������ã���������� == ����ȽϵĲ���ֵ�������á�
    // ���������������ֵ��-128��127֮�䣬��ô����new�µ�Integer���󣬶���ֱ�����ó������е�Integer����
    // �����������������f1==f2�Ľ����true����f3==f4�Ľ����false��

        public static void main(String[] args) {
            Integer a = new Integer(3);
            // ��3�Զ�װ���Integer����
            Integer b = 3;
            int c = 3;
            // false ��������û������ͬһ����
            System.out.println(a == b);
            // true a�Զ������int�����ٺ�c�Ƚ�
            System.out.println(a == c);

            Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;
            // true
            System.out.println(f1 == f2);
            // false
            System.out.println(f3 == f4);
        }
    }

