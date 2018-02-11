/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:ForOffer
 * PackageName: PACKAGE_NAME
 * Date: 2018/2/11 10:30
 */
public class HasSubtree {
    /**
     * 场景及功能：
     * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
     * @param
     * @Autor elijahliu
     * @method a
     * @Date 2018/2/11 10:31
    * @Return a
     */
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        //ps:遍历树节点的时候先看一定要先看看是不是空节点
        //在判断是否子树的过程中，应该先判断pRoot2是否为空，为空则表明子树的所有节点都比较完了，应该是子树返回True

        //任意一个为null 都表示不是子树
        if (root1==null || root2 == null) {
            return false;
        }
        //验证root1的根节点跟root2的根节点是不是相等，如果相等那么就验证看看是不是子树。
        boolean flag = isSubTree(root1,root2);
        //如果两个根节点都不一样，那么看看root1左树中有没有root2
        if(!flag){
            flag = HasSubtree(root1.left, root2);
        }
        //如果左子树中没有 验证又子树中有没有
        if (!flag) {
            flag = HasSubtree(root1.right, root2);
        }
        return flag;
    }

    boolean isSubTree(TreeNode root1, TreeNode root2) {
        //root2 即B树的节点为空 则说明b遍历完成 并且所有节点都符合 则返回true
        if (root2 == null) {
            return true;
        }
        //由于root2 为 root1子树 故一定不能先为null 所以 如果为null 肯定不符合子树条件
        if (root1 == null) {
            return false;
        }
        //如果两节点不相等则也不是子树
        if (root1.val != root2.val) {
            return false;
        }
        //如果上面三个终止条件都掠过，则不断向左向左遍历子树，再递归回来遍历右树，如果两边返回的条件都是true的话 则表示为子树
        return isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right);
    }
}
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
