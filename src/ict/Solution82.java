package ict;

/**
 * Created by lon on 16-5-4.
 */
public class Solution82 {
    public static void main(String[] args) {
    }
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)return null;
        ListNode res = new ListNode(0);
        res.next=head;
        ListNode pre = res;
        ListNode cur = head;
        int count = 1;
        while (cur.next!=null){
            if(cur.next.val==cur.val){
                count++;
            }else {
                if(count==1){
                    pre.next=cur;
                    pre=cur;
                }else count=1;
            }
            cur = cur.next;
        }
        if(count==1)pre.next=cur;
        else pre.next=null;
        return res.next;
    }

    public ListNode deleteDuplicates1(ListNode head){
        if(head == null) return null;
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode pre = newHead;
        ListNode cur = head;
        int count = 1;
        while (cur!=null && cur.next!=null){
            if(cur.next.val == cur.val){
                count++;
            }else{
                if(count==1){
                    pre.next = cur;
                    pre = cur;
                }else {
                    count=1;
                }
            }
        }
        if(count==1) pre.next = cur;
        else pre.next = null;
        return newHead.next;

    }
}
