class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

// 迭代写法
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;// 头结点为空
        ListNode cur = head;// 当前节点指向头结点
        while (cur != null) {
            ListNode next = cur.next;// 存一份cur.next
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;// 箭头指针反向了
    }
}

public class Ac35 {
    public static void main(String[] args) {

    }
}
