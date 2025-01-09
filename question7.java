class question7 {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;       // Move slow by one step
            fast = fast.next.next;  // Move fast by two steps
        }
        
        return slow; // Slow will point to the middle node
    }
}
