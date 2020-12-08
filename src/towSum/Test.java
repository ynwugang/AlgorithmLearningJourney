package towSum;

/**
 * @author wugang
 * @date 2020/12/8 10:15
 */
public class Test {
    public static void main(String[] args) {
        Solution towSum = new Solution();
        int[] a = {2,7,11,15};
        int[] b = towSum.getTwoSum(a, 9);

        for (int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
    }
}
