/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:ForOffer
 * PackageName: PACKAGE_NAME
 * Date: 2018/2/23 21:12
 */
public class Clone {
    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) {
            return null;
        }
        RandomListNode nHead = pHead;
        //从原来的a-b-c变为a-a1-b-b1-c-c1
        while (nHead != null) {
            RandomListNode node = new RandomListNode(nHead.label);
            node.next = nHead.next;
            nHead.next = node;
            nHead = node.next;
        }
        //遍历随机节点，因为上一步复制了节点到一条链中，所以原来的随机节点就是原始节点的下一个节点
        nHead = pHead;
        while (nHead != null) {
            if (nHead.random != null) {
                nHead.next.random = nHead.random.next;
            }
            nHead = nHead.next.next;
        }
        //将复合链表拆分
        nHead = pHead;
        RandomListNode head = pHead.next;
        RandomListNode n2Head = head;

        while(nHead!=null){
            nHead.next = nHead.next.next;
            if (n2Head.next != null) {
                n2Head.next = n2Head.next.next;
            }
            n2Head = n2Head.next;
            nHead = nHead.next;
        }
        return head;
    }
}
