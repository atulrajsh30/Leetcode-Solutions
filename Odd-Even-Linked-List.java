class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head; // Edge case: empty list or single node
        }

        ListNode odd = head; // First node (odd index)
        ListNode even = head.next; // Second node (even index)
        ListNode evenHead = even; // Store even list head for later reconnection

        while (even != null && even.next != null) {
            odd.next = even.next; // Link odd node to next odd
            odd = odd.next; // Move odd pointer

            even.next = odd.next; // Link even node to next even
            even = even.next; // Move even pointer
        }

        odd.next = evenHead; // Attach even list to the end of odd list

        return head;
    }
}
