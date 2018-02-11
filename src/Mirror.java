import java.util.Stack;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:ForOffer
 * PackageName: PACKAGE_NAME
 * Date: 2018/2/11 11:06
 */
public class Mirror {
    /**
     * 场景及功能：
     * 操作给定的二叉树，将其变换为源二叉树的镜像。
     *
     * @param
     * @Autor elijahliu
     * @method a
     * @Date 2018/2/11 11:06
     * @Return a
     */
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(8);
        TreeNode node2 = new TreeNode(6);
        TreeNode node3 = new TreeNode(10);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(7);
        TreeNode node6 = new TreeNode(9);
        TreeNode node7 = new TreeNode(11);
        TreeNode node8 = new TreeNode(20);
        TreeNode node9 = new TreeNode(1);
        node9.left = node1;
        node9.right = node8;
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        Mirror(node9);
    }

    //递归 直接交换左右子树值
    public static void Mirror(TreeNode root) {
        //节点为空 则返回 否则交换左右子树 继续遍历
        if (root != null) {
            Mirror(root.left);
            Mirror(root.right);
            TreeNode temp;
            temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
    }
    //递归方式相当于由下而上的交换，非递归利用栈则是由上向下交换
    public static void MirrorStack(TreeNode root){
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.empty()){
            TreeNode node = stack.pop();
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }


}
