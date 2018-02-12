import java.util.Stack;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:ForOffer
 * PackageName: PACKAGE_NAME
 * Date: 2018/2/12 09:57
 */
public class IsPopOrder {
    /**
     * 场景及功能：
     * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。
     * 例如序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
     *
     * @param
     * @Autor elijahliu
     * @method a
     * @Date 2018/2/12 09:58
     * @Return a
     */
    public static void main(String[] args) {
        int[] pushA = {1, 2, 3, 4, 5};
        int[] popA = {4, 5, 3, 2, 1};
        int[] popB = {4, 3, 5, 1, 2};
        IsPopOrder(pushA, popB);
    }

    public static boolean IsPopOrder(int[] pushA, int[] popA) {
        Stack<Integer> stack = new Stack();
        int j = 0;
        for (int i = 0; i < pushA.length && j < popA.length; i++) {
            stack.push(pushA[i]);
            if (stack.peek() == popA[j]) {
                ++j;
                stack.pop();
            }
        }
        while (j < popA.length) {
            if (stack.peek() == popA[j]) {
                stack.pop();
                ++j;
            } else {
                break;
            }

        }
        if (stack.empty()) {
            return true;
        }
        return false;
    }
    /**
     * 思路
     * 将第一个序列压入栈中，如果栈顶元素与弹出序列相同 那么就弹出元素
     * 如果不同 那么就继续压栈 以此往复 如果全部呀入栈后 弹出序列没有遍历完
     * 那么遍历栈 看剩下的弹出序列想不相同 如果最后栈不为空 那么说名 不为弹出序列
     */
}
