public class _2_AddTwoNumbers {
    public static void main(String[] args) {
        
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l = new ListNode();
        ListNode cur = l;
        int x = 0;

        while (l1 != null || l2 != null || x == 1) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            sum += x;
            x = sum/10;
            ListNode n = new ListNode(sum % 10);
            cur.next = n;
            cur = cur.next;
        }
        return l.next;
    }
}
