package ict;

/**
 * Created by lon on 16-8-28.
 */
public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tmp = head;
        for (int i = 0; i <n ; i++) {
            if(tmp==null) return head;
            tmp = tmp.next;
        }
        if(tmp==null)return head;
        ListNode slow = head;
        while (tmp!=null&&tmp.next!=null){
            slow = slow.next;
            tmp = tmp.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
