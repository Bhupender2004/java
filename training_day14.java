//Reverse Linked List

public class training_day14 {
    public ListNode reverseList(ListNode next) {
        if(next == null){
            return null;
        }
        ListNode newHead = next;
        if(next.next!=null){
            ListNode nxt = (ListNode) next.next;
            newHead = reverseList(nxt);
            nxt.next = next;
        }
        next.next = null;
        return newHead;
    }
}
