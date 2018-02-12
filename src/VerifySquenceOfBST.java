/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:ForOffer
 * PackageName: PACKAGE_NAME
 * Date: 2018/2/12 10:58
 */
public class VerifySquenceOfBST {
    boolean isTree(int[] sequence, int start, int end) {
        if (start >= end) {
            return true;
        }
        int index = start;

        while (index <= end) {
            if (sequence[index] < sequence[end]) {
                ++index;
            } else {
                break;
            }
        }
        for (int i = index; i <= end; i++) {
            if (sequence[i] < sequence[end]) {
                return false;
            }
        }
        return isTree(sequence, start, index - 1) && isTree(sequence, index, end - 1);
    }

    /**
     * 场景及功能：
     * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
     *
     * @param
     * @Auhor elijahliu
     * @method a
     * @Date 2018/2/12 15:57
     * @Return a
     */
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence.length == 0) {
            return false;
        }
        return isTree(sequence, 0, sequence.length - 1);
    }
    /**
     * 思路
     * 二叉搜索树 左子树的所有数值都小于根节点
     * 后续遍历最后一个元素为根元素
     * 前面的是左子树，后面的是右子树
     * 所以用递归，将前面分成左右两部分递归 然后判断是否可以构成一棵二叉搜索树
     */
}
