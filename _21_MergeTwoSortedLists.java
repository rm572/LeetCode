// package LeetCode;

public class _21_MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode res = new ListNode();

        if (list1.val < list2.val) {
            res = list1;
            list1 = list1.next;
        }

        else {
            res = list2;
            list2 = list2.next;
        }
        ListNode temp = res;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                temp.next = list1;
                list1 = list1.next;
            }
            else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        if (list1 == null) {
            temp.next = list2;
        }

        else if (list2 == null) {
            temp.next = list1;
        }

        return res;
    }
}
