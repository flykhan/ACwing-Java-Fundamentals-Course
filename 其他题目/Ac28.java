class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public void deleteNode(ListNode node) {
        ListNode p = node.next;
        node.val = p.val;
        node.next = p.next;
    }
}

public class Ac28 {
    public static void main(String[] args) {

    }
}
