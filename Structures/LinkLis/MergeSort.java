package rick.Structures.LinkLis;

public class MergeSort {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }

    private ListNode mergeSort(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode mid = mid(head);
        ListNode left = mergeSort(head);
        ListNode right = mergeSort(mid);
        return sortAdd(left, right);
    }
    private ListNode sortAdd(ListNode head1, ListNode head2){
        ListNode dummyHead = new ListNode();
        ListNode res = dummyHead;

        while(head1 != null && head2 != null){
            if(head1.val < head2.val){
                res.next = head1;
                res = res.next;
                head1 = head1.next;
            }
            else{
                res.next = head2;
                res = res.next;
                head2 = head2.next;
            }
        }
        res.next = (head1!= null)?head1 : head2;
        return dummyHead.next;
    }

    private ListNode mid(ListNode head){
        ListNode midPrev = null;
        while(head != null && head.next != null){
            midPrev = (midPrev == null)?head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
    public ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }
    private ListNode reverse(ListNode head, ListNode prev){
        if(head == null){
            return head;
        }
        if( head.next == null){
            head.next = prev;

            return head;
        }
        head.next = prev;
        return reverse(head.next, head);
    }
}
