import java.util.Stack;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:ForOffer
 * PackageName: PACKAGE_NAME
 * Date: 2018/2/23 22:23
 */
public class Convert {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = pRootOfTree;
        //记录中序遍历上一个节点
        TreeNode pre = null;
        //记录是不是第一个双向链表节点
        boolean flag = true;
        while (p != null||!stack.empty()) {
            while(p!=null){
                stack.push(p);
                p = p.left;
            }
            p = stack.pop();
            if (flag) {
                pRootOfTree = p;
                pre = p;
                flag = false;
            }else{
                pre.right = p;
                p.left = pre;
                pre = p;
            }
            p = p.right;
        }
        return pRootOfTree;
    }
    /**
     * 解题思路：
     1.核心是中序遍历的非递归算法。
     2.修改当前遍历节点与前一遍历节点的指针指向。
     */
}
