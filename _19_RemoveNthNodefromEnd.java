public class _19_RemoveNthNodefromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp1 = head;
        ListNode temp2 = head;
        int count = 0;
        if (head.next == null) {
            return null;
        }
        while (temp1.next != null) {
            if (count < n) {
                count++;
                temp1 = temp1.next;
            }
            else {
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
        if (count < n) {
            head = head.next;
            return head;
        }
        temp2.next = temp2.next.next;
        return head;
    }
}
