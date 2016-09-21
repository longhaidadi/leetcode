package ict;

/**
 * Created by lon on 16-7-29.
 */
public class Solution83 {
    public ListNode deleteDupliucates(ListNode head){
        ListNode list = head;
        if(head==null)return null;
        while (list.next!=null){
            if(list.val==list.next.val){
                list.next=list.next.next;
            }else
                list=list.next;
        }
        return list;
    }
    public ListNode deleteDupliucates1(ListNode head){
        ListNode list = head;
        if(head==null) return head;
        while (list.next!=null){
            if(list.val == list.next.val){
                list.next = list.next.next;
            }else
                list = list.next;
        }
        return head;
    }
}
