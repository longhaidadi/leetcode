package ict;

/**
 * Created by lon on 16-5-16.
 */
public class Solution142 {
    public ListNode detectCycle(ListNode head) {
        if(head==null)return null;
        ListNode slow = head;
        ListNode fast = head;
        while (true){
            if(fast.next!=null && fast.next.next!=null){
                fast = fast.next.next;
                slow = slow.next;
            }else{
                return null;
            }
            if(fast==slow){
                break;
            }

        }
        fast = head;
        while (fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }

        return fast;
    }
}
