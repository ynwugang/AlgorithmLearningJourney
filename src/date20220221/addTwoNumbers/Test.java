package date20220221.addTwoNumbers;

/**
 * @author wugang
 * @date 2020/12/1 16:30
 */
public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = solution.addTwoNumbers(l1,l2);

        while (result != null){
            System.out.print(result.val);
            if (result.next != null){
                System.out.print("->");
            }

            result = result.next;
        }
    }
}
