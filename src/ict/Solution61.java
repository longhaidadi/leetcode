package ict;

/**
 * Created by lon on 16-5-3.
 */
public class Solution61 {
    public static void main(String[] args) {
       Solution61 solution61 = new Solution61();

    }
    // 如果想要得到倒数第k个元素，则需要将fast向前<k-1
    // 如果想要得到倒数第k个元素的上一个元素，需要将fast向前走k步骤
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)return head;
        int len = 0;
        ListNode t = head;
        while (t!=null){
            len++;
            t = t.next;
        }

        k = k%len;
        if(k==0)return head;
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i <k ; i++) {
            fast = fast.next;
        }
        while (fast!=null&&fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        ListNode newHead = slow.next;
        slow.next=null;
        fast.next=head;
        return newHead;
    }

}
