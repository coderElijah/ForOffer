import java.util.List;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:ForOffer
 * PackageName: PACKAGE_NAME
 * Date: 2018/2/9 14:15
 */
public class ReverseList {
    /**
     * 场景及功能：
     * 输入一个链表，反转链表后，输出链表的所有元素。
     *
     * @param
     * @Autor elijahliu
     * @method a
     * @Date 2018/2/9 14:15
     * @Return a
     */

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ReverseList(node1);
    }
    public static ListNode ReverseList(ListNode head) {

        if (head == null) {
            return head;
        }
        ListNode pre = head;
        ListNode post = null;
        ListNode temp;
        while (pre.next != null) {
            temp = pre.next;
            pre.next = post;
            post = pre;
            pre = temp;
        }
        pre.next = post;
        return pre;
    }
}
