import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:ForOffer
 * PackageName: PACKAGE_NAME
 * Date: 2018/2/24 10:33
 */
public class MoreThanHalfNum_Solution {
    /**
     * 场景及功能：
     * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
     * @param
     * @Autor elijahliu
     * @method a
     * @Date 2018/2/24 10:52
    * @Return a
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        MoreThanHalfNum_Solution(array);
    }

    /**
     * 基于hashmap的解法
     * @param array
     * @return
     */
    public static int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer,Integer> countMap = new HashMap(16);
        for(int i = 0;i<array.length;i++) {
            if (countMap.get(array[i]) == null) {
                countMap.put(array[i], 1);
            }else{
                int count = countMap.get(array[i]);
                countMap.put(array[i], ++count);
            }
        }
        int num = 0;
        for (Map.Entry<Integer,Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > array.length / 2) {
                num = entry.getKey();
                break;
            }
        }
        return num;
    }

    /**
     * java语法巧解 直接使用排序
     * 因为数量大于数组一半
     * 则排序后 中间的元素一定就是结果
     */
    static int MoreThanHalfNum_Solution2(int[] array) {
        Arrays.sort(array);
        int count = 0;
        for(int i = 0;i<array.length;i++) {
            if (array[i] == array[array.length / 2]) {
                count++;
            }
        }
        if (count > array.length / 2) {
            return array[array.length / 2];
        }else{
            return 0;
        }
    }


}
