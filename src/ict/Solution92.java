package ict;

/**
 * Created by lon on 16-7-30.
 */
public class Solution92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m==n)return head;
        ListNode newHead = new ListNode(-1);
        newHead.next=head;
        ListNode pre = newHead;
        ListNode first =newHead;
        ListNode seconde = newHead;

        ListNode tmp= head;
        for (int i = 1; i <=n ; i++) {
            if(i==m-1){
                pre = tmp;
            }
            else if(i==m){
                first = tmp;
            }
            if(i==n){
                seconde = tmp;
            }
            tmp = tmp.next;
        }
        pre.next=seconde.next;

        for (int i = 0; i <n-m+1 ; i++) {
            ListNode next = first.next;
            ListNode t = pre.next;
            first.next=t;
            pre.next=first;
            first=next;
        }
        return newHead.next;

    }

    public static void main(String[] args) {
        ListNode first = new ListNode(3);
        ListNode second = new ListNode(5);
        first.next=second;
        new Solution92().reverseBetween(first,1,2);
    }
}
