package rick.Structures.LinkLis;

public class Questions
{
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    class Leetcode206 {
        public ListNode reverseList(ListNode head) {
            return reverse(head);
        }
        private ListNode reverse(ListNode head, ListNode prev){
            if(head == null){
                return prev;
            }
            ListNode newNode = reverse(head.next, head);
            head.next = prev;
            return newNode;
        }
        private ListNode reverse(ListNode head){
            ListNode newHead = null;
            while (head != null) {
                ListNode next = head.next;
                head.next = newHead;
                newHead = head;
                head = next;
            }
            return newHead;
        }
    }
}
