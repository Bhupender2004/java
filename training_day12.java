
import java.util.*;
public class training_day12 {
    
    public ListNode reverseList(ListNode next) {
        if(next==null){
            return null;
        }
        ListNode newHead = next;
        if(next.next!=null){
            ListNode nextNode = (ListNode) next.next;
            newHead = reverseList(nextNode);
            nextNode.next = next;
        }
        next.next =null;
        return newHead;
    }

}
