import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:ForOffer
 * PackageName: PACKAGE_NAME
 * Date: 2018/2/9 10:52
 */
public class ReOrderArray {
    /**
     * 场景及功能：
     * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
     *
     * @param
     * @Autor elijahliu
     * @method a
     * @Date 2018/2/9 10:57
     * @Return a
     */
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5,6,7};
        reOrderArray(array);
    }
    public  static void reOrderArray(int [] array) {
        int[] array2 = new int[array.length];
        int oddcount = 0;
        for(int i = 0;i<array.length;i++) {
            if(isOdd(array[i])){
                oddcount++;
            }
        }
        for(int i = 0,j=0,y=oddcount;i<array.length;i++) {
            if (isOdd(array[i])) {
                array2[j] = array[i];
                j++;
                continue;
            }
            array2[y] = array[i];
            y++;
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = array2[i];
        }
    }
    private static boolean isOdd(int num){
        if (num % 2 == 0) {
            return false;
        }
        return true;
    }

    /**
     * 牺牲空间换时间
     */
}
