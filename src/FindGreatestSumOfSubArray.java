/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:ForOffer
 * PackageName: PACKAGE_NAME
 * Date: 2018/2/24 11:34
 */
public class FindGreatestSumOfSubArray {
    /**
     * 场景及功能：
     * HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。今天测试组开完会后,他又发话了:在古老的一维模式识别中,常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。
     * 但是,如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。你会不会被他忽悠住？(子向量的长度至少是1)
     *
     * @param
     * @Autor elijahliu
     * @method a
     * @Date 2018/2/24 11:34
     * @Return a
     */
    public static void main(String[] args) {
        int[] array = {6, -3, -2, 7, -15, 1, 2, 2};
        int[] array2 = {1, -2, 3, 10, -4, 7, 2, -5};
        int[] array3 = {-2,-8,-1,-5,-9};
        FindGreatestSumOfSubArray(array3);
    }
    public static int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int sum = 0;
        int maxSum = -1;
        //是否存在正数
        boolean flag = false;
        for(int i = 0;i<array.length;i++) {
            sum += array[i];
            if (array[i]>0) {
                flag = true;
            }
            if (flag&&sum<0) {
                if (sum - array[i] > maxSum) {
                    maxSum = sum - array[i];
                }
                sum = 0;
            } else if (!flag && sum < 0) {
                if (array[i] > maxSum) {
                    maxSum = array[i];
                }
            }
            if (sum > 0 && sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    /**
     * 题目解释 最大和就是如果没有正数 就是负数中的最大 如果全部都是正数 那么就是正数的和
     * 如果负数正数都有 那么如果一个个相加的和小于0那么就将和置为0继续求 那么正负相加求出不小于零的最大的正整数
     * 就是最大和
     * 题目理解了就好做了 无非就是分条件求和 找标记位记录的问题
     */

}
