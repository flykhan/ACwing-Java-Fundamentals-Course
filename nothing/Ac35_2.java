class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

// 递归写法
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;// 当head为空或head只有一个结点时，直接返回
        ListNode tail = reverseList(head.next);// 递归，翻转当前节点的后部分结点
        head.next.next = head;// 将当前的head结点接到翻转完的tail链表之后
        head.next = null;// 将当前head下一节点置为null，变为新的尾结点
        return tail;// 完成后，尾结点变为头结点，头结点变为尾结点。因此返回当前的tail结点即为反转后的头结点地址
    }
}