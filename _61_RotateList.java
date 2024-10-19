public class _61_RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode count = head;
        int len = 0;
        while (count != null) {
            len++;
            count = count.next;
        }
        k = k % len;
        while (k != 0) {
            ListNode temp = head;
            ListNode secondToLast = head;
            while (temp.next != null) {
                temp = temp.next;
                if (temp.next != null) {
                    secondToLast = secondToLast.next;
                }
            }

            secondToLast.next = null;
            temp.next = head;
            head = temp;
            k--;
        }

        return head;
    }
}
