class Solution {
    public int pairSum(ListNode head) {

        
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode current = slow;

        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        ListNode first = head;
        ListNode second = prev;
        int maximumSum = 0;

        while (second != null) {
            int twinSum = first.val + second.val;
            maximumSum = Math.max(maximumSum, twinSum);

            first = first.next;
            second = second.next;
        }

        return maximumSum;
    }
}