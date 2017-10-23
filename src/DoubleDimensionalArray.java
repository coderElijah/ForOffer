/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:ForOffer
 * PackageName: PACKAGE_NAME
 * Date: 2017/9/27 19:39
 */
public class DoubleDimensionalArray {

    public boolean Find(int target, int [][] array) {
        int i = 0, j = array[0].length - 1;
        while (j >= 0 && i < array.length) {
            if (array[i][j] == target) {
                return true;
            } else if (array[i][j] > target) {
                j--;
            } else if (array[i][j] < target) {
                i++;
            }
        }
        return false;
    }
}

/**
 * 场景及功能：
 *从左向右依次增大 则第一行最右方是第一行最大的
 * 能保证左边的比他小 下面的比他大 则若target比他小则一定在左方 若大于他 则一定在下方
 * @Author elijahliu
 * @mthod a
 * @param null
 * @Date 2017/9/27 20:02
 * Return a
 *
 *
 * 题目描述
在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
