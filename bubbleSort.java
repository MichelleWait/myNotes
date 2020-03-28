import org.junit.Test;

/**
 * @author ningfei
 * @date 2019/10/8
 */
public class bubbleSort {

    //冒泡排序改良第一版,+了一个tag,如果一直都没有交换,说明已经ready了提前结束

    public int[] bubbleSort(int[] A, int n) {
        // write code here
        int temp;
        int tag = 0;
        for (int i = n; i > 1; i--) {

            for (int j = 0; j < i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    tag = 1;
                    temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
            if (tag == 0) {
                break;
            }
            tag = 0;
        }
        return A;
    }


    public int[] bubbleSort_02(int[] A, int n) {
        // write code here
        int temp;
        int tag = 0;
        int lastExchangeIndex = 0;
        int sortBorder = A.length-1;
        for (int i = n; i > 1; i--) {

            for (int j = 0; j < i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    tag = 1;
                    temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                    lastExchangeIndex = j;
                }
            }
            sortBorder = lastExchangeIndex;
            if (tag == 0) {
                break;
            }
            tag = 0;
        }
        return A;
    }
    @Test
    public void test_01() {
        int[] A = new int[]{5, 8, 2, 4, 7, 1};
        bubbleSort(A, 6);
    }

    @Test
    public void test_02() {
        int[] A = new int[]{3, 4, 2, 1, 5, 6,7,8};
        bubbleSort(A, 8);
    }
}