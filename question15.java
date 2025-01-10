class question15 {
    public ListNode removeNodes(ListNode head) {
        // Reverse the linked list
        ListNode reversedHead = reverseList(head);

        // Keep track of the maximum value seen so far
        ListNode current = reversedHead;
        ListNode newHead = null;
        ListNode newTail = null;

        int maxValue = Integer.MIN_VALUE;

        // Traverse the reversed list
        while (current != null) {
            if (current.val >= maxValue) {
                // Update max value
                maxValue = current.val;

                // Add this node to the new list
                if (newHead == null) {
                    newHead = current;
                    newTail = current;
                } else {
                    newTail.next = current;
                    newTail = current;
                }
            }
            current = current.next;
        }

        // Terminate the new list
        if (newTail != null) {
            newTail.next = null;
        }

        // Reverse the list back to the original order
        return reverseList(newHead);
    }

    // Helper function to reverse a linked list
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
