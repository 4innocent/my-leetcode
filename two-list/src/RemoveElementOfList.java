public class RemoveElementOfList {
    public static void main(String[] args) {
        int ints[] = {1, 2, 6, 3, 4, 5, 6};
        ListNode head = new ListNode(1);
        ListNode temp = head;
        for (int i = 1; i < ints.length; i++) {
            temp.next = new ListNode(ints[i]);
            temp = temp.next;
        }

        ListNode listNode = removeElements(head, 6);



    }

    /**
     * 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
     *
     * @param head
     * @param val
     * @return
     */
    public static ListNode removeElements(ListNode head, int val) {
        ListNode headNew = null;
        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head != null) {
            headNew = head;
            ListNode last = head;
            ListNode now = head.next;
            while (now != null) {
                System.out.println(now.val);
                if(now.val == val){
                    last.next = now.next;
                }else{
                    last = last.next;
                }
                now = last.next;

            }
        }
        return headNew;
    }
}
