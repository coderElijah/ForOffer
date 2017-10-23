import java.util.ArrayList;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:ForOffer
 * PackageName: PACKAGE_NAME
 * Date: 2017/9/27 20:18
 */


public class LinkListConvertPrint {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ListNode post = null;
        ListNode convertList = null;
        while (listNode != null) {
            post = listNode.next;
            listNode.next = convertList;
            convertList = listNode;
            listNode = post;
        }
        while (convertList != null) {
            arrayList.add(convertList.val);
            convertList = convertList.next;
        }
        return arrayList;
    }


    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}

/**
 * 场景及功能：
 *
 * @Auelijahliuahliu
 * @mth * @param null null
 * 2017/9/27720:50 20:50
 * Return a
 * <p>
 * *输入一个链表，从尾到头打印链表每个节点的值。
 */
