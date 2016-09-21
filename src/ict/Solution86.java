package ict;

/**
 * Created by lon on 16-7-29.
 */
public class Solution86 {
    public ListNode partition(ListNode head,int x){
        ListNode smallHead = new ListNode(-1);
        ListNode bigHead = new ListNode(-1);
        ListNode small = smallHead;
        ListNode big = bigHead;
        while (head!=null){
            int v = head.val;
            if(x>v){
                small.next = new ListNode(v);
                small= small.next;
            }else {
                big.next = new ListNode(v);
                big = big.next;
            }
            head = head.next;
        }
        small.next = bigHead.next;
        return smallHead.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        new Solution86().partition(head,1);

    }
}
