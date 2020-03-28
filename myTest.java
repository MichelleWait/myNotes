import org.junit.Test;

/**
 * @author ningfei
 * @date 2019/1/2
 */
public class myTest {

    public Integer maxCommission(int[] level, int[] commission, int[] worker) {
        int maxCommission = 0;
        if (worker.length > 0 && level.length > 0) {
            for (int i = 0; i < worker.length; i++) {
                int commissionForWorker = 0;
                for (int j = 0; j < level.length; j++) {
                    int l = level[j];
                    if (worker[i] >= l) {
                        try {
                            commissionForWorker = commission[j] > commissionForWorker ? commission[j] : commissionForWorker;
                        } catch (Exception ArrayIndexOutOfBoundsException) {

                        }
                    }
                }

                System.out.println("worker——" + i + "的最高佣金是:" + commissionForWorker);
                maxCommission = maxCommission + commissionForWorker;
            }
        }

        return maxCommission;
    }


    @Test
    public void test_01() {
        int[] level = new int[]{1, 2, 3, 4, 7};
        int[] commission = new int[]{2, 1, 15, 20, 25};
        int[] worker = new int[]{2, 3, 4, 6};
        Integer money = maxCommission(level, commission, worker);
        System.out.println("最高的佣金是:" + money);
    }

    @Test
    public void test_02() {
        int[] level = new int[]{1, 2, 3, 4, 7};
        int[] commission = new int[]{};
        int[] worker = new int[]{2, 3, 4, 6};
        Integer money = maxCommission(level, commission, worker);
        System.out.println("最高的佣金是:" + money);
    }

    @Test
    public void test_03() {
        int[] level = new int[]{};
        int[] commission = new int[]{2, 1, 15, 20, 25};
        int[] worker = new int[]{};
        Integer money = maxCommission(level, commission, worker);
        System.out.println("最高的佣金是:" + money);
    }
}



