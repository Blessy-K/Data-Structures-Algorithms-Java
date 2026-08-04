/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
    // PriorityQueue<ListNode> pq =
    //             new PriorityQueue<>((a, b) -> a.val - b.val);

    //     for (ListNode node : lists) {
    //         if (node != null)
    //             pq.offer(node);
    //     }

    //     ListNode dummy = new ListNode(0);
    //     ListNode tail = dummy;

    //     while (!pq.isEmpty()) {

    //         ListNode node = pq.poll();

    //         tail.next = node;
    //         tail = tail.next;

    //         if (node.next != null)
    //             pq.offer(node.next);
    //     }

    //     return dummy.next;

    // if (lists == null || lists.length == 0)
    //         return null;

    //     return divide(lists, 0, lists.length - 1);
    // }

    // private ListNode divide(ListNode[] lists, int left, int right) {

    //     if (left == right)
    //         return lists[left];

    //     int mid = left + (right - left) / 2;

    //     ListNode l1 = divide(lists, left, mid);
    //     ListNode l2 = divide(lists, mid + 1, right);

    //     return merge(l1, l2);
    // }

    // private ListNode merge(ListNode a, ListNode b) {

    //     ListNode dummy = new ListNode(0);
    //     ListNode curr = dummy;

    //     while (a != null && b != null) {

    //         if (a.val <= b.val) {
    //             curr.next = a;
    //             a = a.next;
    //         } else {
    //             curr.next = b;
    //             b = b.next;
    //         }

    //         curr = curr.next;
    //     }

    //     curr.next = (a != null) ? a : b;

    //     return dummy.next; 

    ListNode result = null;

        for (ListNode list : lists) {
            result = merge(result, list);
        }

        return result;
    }

    private ListNode merge(ListNode a, ListNode b) {

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (a != null && b != null) {

            if (a.val <= b.val) {
                curr.next = a;
                a = a.next;
            } else {
                curr.next = b;
                b = b.next;
            }

            curr = curr.next;
        }

        curr.next = (a != null) ? a : b;

        return dummy.next;   
    }
}