public class _2807_InsertGCDLinkedList {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp1 = head;
        ListNode temp2 = temp1.next;

        while (temp2 != null) {
            int value = findGCD(temp1.val, temp2.val);
            ListNode newNode = new ListNode(value, temp2);
            temp1.next = newNode;
            temp1 = temp2;
            temp2 = temp2.next;
        }

        return head;
    }

    public int findGCD(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
