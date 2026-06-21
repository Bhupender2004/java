//Reverse Linked List

// public class training_day14 {
//     public ListNode reverseList(ListNode next) {
//         if(next == null){
//             return null;
//         }
//         ListNode newHead = next;
//         if(next.next!=null){
//             ListNode nxt = (ListNode) next.next;
//             newHead = reverseList(nxt);
//             nxt.next = next;
//         }
//         next.next = null;
//         return newHead;
//     }
// }



// import java.util.*;
// class training_day18{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println(
//     java.util.stream.IntStream.rangeClosed(0, 5)
//         .map(i -> i * 2)
//         .mapToObj(String::valueOf)
//         .collect(java.util.stream.Collectors.joining(" "))
// );
//     }
// }


