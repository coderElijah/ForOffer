/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:ForOffer
 * PackageName: PACKAGE_NAME
 * Date: 2018/2/9 11:44
 */
public class FindKthToTail {
    /**
     * 场景及功能：
     * 输入一个链表，输出该链表中倒数第k个结点。
     * @param
     * @Autor elijahliu
     * @method a
     * @Date 2018/2/9 11:46
    * @Return a
     */
    public static void main (String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        FindKthToTail(node1,6);

    }
    public static ListNode FindKthToTail(ListNode head,int k) {
        if (head == null || k == 0) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        int count = 1;
        while(fast.next!=null){
            if (count >= k) {
                slow = slow.next;
            }
            fast = fast.next;
            count++;
        }
        if (count < k) {
            return null;
        }
        return slow;
    }

    /**
     * 设置两个指针
     * slow fast
     * 让fast先走k步
     * 然后slow再走
     * 这时候fast 和slow间隔k个距离
     * 然后两个指针一起移动
     * 最后fast到头 slow正好到k 因为间隔k所以是倒数第k个
     */

}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
