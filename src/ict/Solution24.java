package ict;

/**
 * Created by lon on 16-7-28.
 */
public class Solution24 {
    public ListNode swapPairs(ListNode head) {
        if( head == null ||head.next==null ) return head;
        ListNode pre = null;
        ListNode cur = head;
        while(cur!=null && cur.next!=null){
            ListNode tmp = cur.next.next;
            if(pre==null){
                pre = cur.next;
                head = cur.next;
            }else{
                pre.next= cur.next;
            }
            cur.next.next = cur;
            cur.next = tmp;
            pre =cur;
            cur = tmp;
        }

        return head;
    }
    public ListNode swapPairs1(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode pre = null;
        ListNode cur = head;
        ListNode newHead = null;
        while (cur!=null && cur.next!=null){
            if(pre==null){
                pre = cur.next;
                newHead = pre;
            }else {
                ListNode tmp = cur.next.next;
                pre.next = cur.next;
                cur.next.next = cur;
                cur.next = tmp;
                pre = cur;
                cur = cur.next;
            }
        }
        return newHead;
    }
}
