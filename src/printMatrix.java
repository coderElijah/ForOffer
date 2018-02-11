import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:ForOffer
 * PackageName: PACKAGE_NAME
 * Date: 2018/2/11 11:50
 */
public class printMatrix {
    /**
     * 场景及功能：
     * 题目描述
     * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
     * 例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
     * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
     *
     * @param
     * @Autor elijahliu
     * @method a
     * @Date 2018/2/11 11:50
     * @Return a
     */
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] array2 = {{1}, {2}, {3}};
        int[][] array3 = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        int[][] array4 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        printMatrix(array4);
    }

    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        int column = matrix[0].length;
        int row = matrix.length;
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (row == 1) {
            for (int i = 0; i < matrix[0].length; i++) {
                result.add(matrix[0][i]);
            }
            return result;
        }
        if (column == 1) {
            for (int i = 0; i < matrix.length; i++) {
                result.add(matrix[i][0]);
            }
            return result;
        }
        int r = row;
        int c = column;
        int total = row * column;
        while (r > 0 && c > 0) {
            for (int i = (column - c) / 2; i <= (column - c) / 2 + c - 1 && result.size() < total; i++) {
                //从左到右
                result.add(matrix[(row - r) / 2][i]);
            }
            for (int j = (row - r) / 2 + 1; j < (row - r) / 2 + r && result.size() < total; j++) {
                //从上到下
                result.add(matrix[j][(column - c) / 2 + c - 1]);
            }
            for (int k = (column - c) / 2 + c - 2; k >= (column - c) / 2 && result.size() < total; k--) {
                //从右到左
                result.add(matrix[row - (row - r) / 2 - 1][k]);
            }
            for (int i = row - (row - r) / 2 - 2; i > (row - r) / 2 && result.size() < total; i--) {
                //从下到上
                result.add(matrix[i][(column - c) / 2]);
            }
            r -= 2;
            c -= 2;
        }
        return result;
    }

    /**
     * ps:需要加上result的size和数组size的对比 以免重复打印的情况 算法比较暴力
     */
}
