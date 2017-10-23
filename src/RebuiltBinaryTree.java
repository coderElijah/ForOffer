/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:ForOffer
 * PackageName: PACKAGE_NAME
 * Date: 2017/9/27 20:59
 */
public class RebuiltBinaryTree {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        TreeNode root = reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length-1);
        return root;
    }

    private TreeNode reConstructBinaryTree(int[] pre, int startpre, int endpre, int[] in, int startin, int endin) {
        if (startpre > endpre || startin > endin) {
            return null;
        }
        //建立节点
        TreeNode root = new TreeNode(pre[startpre]);
        //在后续列表中先寻找根节点的位置
        for(int i =  startin;i<=endin;i++) {
            if (pre[startpre] == in[i]) {
                /**
                 * 因为先序列表中第一个已经是跟元素，则startpre加一从第二个开始，endpre中i-startin指的是后续列表中左子树的元素个数，则再加上startpre就是
                 * 左子树的尾节点，如第一轮中序则会变成（472）1（5386）分成两部分，先序则会成（1）（247）（3568）
                 */
                root.left = reConstructBinaryTree(pre, startpre + 1, i + startpre - startin, in, startin, i - 1);
                /**
                 * 因为左子树在进行遍历的时候，i已经发生过位移，i-startin指的是左子树中，已经遍历的左节点的个数，则先序遍历中肯定是先左子树遍历，
                 * 于是startpre+(i-startin)+1必定是左子树中第一个右节点，同理其他的也是一样的，必然是二叉树中的右子树，在进行递归遍历建树
                 */
                root.right = reConstructBinaryTree(pre,startpre+(i-startin)+1,endpre,in,i+1,endin);
            }
        }
        return root;
    }




    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}


/**
 * 场景及功能：
 * 题目描述
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 *
 * @Author elijahliu
 * @mthod a
 * @param null
 * @Date 2017/9/27 21:26
 * Return a
 */