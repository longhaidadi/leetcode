package ict.package328;

/**
 * Created by lon on 16-3-1.
 */
public class Solution328 {
    public static ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode oddP = head;
        ListNode evenHead = head.next;
        ListNode evenP = head.next;
        while(evenP!=null&&evenP.next!=null){
            oddP.next=evenP.next;
            oddP=oddP.next;
            evenP.next=oddP.next;
            evenP=evenP.next;
        }
        oddP.next=evenHead;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode p = head;
        for(int i =2;i<=3;i++){
            ListNode listNode = new ListNode(i);
            p.next=listNode;
            p=p.next;
        }
        //outPut(head);

        head = oddEvenList(head);
        outPut(head);


    }

    public static void outPut(ListNode head){
        ListNode p=head;
        while (p!=null){
            System.out.println(p.val);
            p=p.next;
        }
    }
}
