package ict;

/**
 * Created by lon on 16-6-21.
 */
public class Solution143 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode nextNode = new ListNode(2);
        listNode.next = nextNode;
        new Solution143().reorderList(listNode);
    }

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        //把整个链表划分成2个等长的子链表，如果原链表长度为奇数，那么第一个子链表的长度多1
        ListNode slow = head, fast = head;
        while (fast.next != null) {
            fast = fast.next;
            if (fast.next != null) fast = fast.next;
            else break;
            slow = slow.next;
        }

        ListNode head1 = head, head2 = slow.next;
        slow.next = null;

        //翻转第二个子链表
        ListNode cur = head2, post = cur.next;
        cur.next = null;
        while (post != null) {
            ListNode tmp = post.next;
            post.next = cur;
            cur = post;
            post = tmp;
        }
        head2 = cur;

        //将两个子链表合并
        ListNode node1 = head1, node2 = head2;
        while (node2 != null) {
            ListNode tmp1 = node1.next;
            ListNode tmp2 = node2.next;
            node1.next = node2;
            node2.next = tmp1;
            node1 = tmp1;
            node2 = tmp2;
        }
    }
}
