import java.util.*;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:ForOffer
 * PackageName: PACKAGE_NAME
 * Date: 2018/2/26 13:58
 */
public class PrintMinNumber {
    /**
     * 场景及功能：
     * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
     *
     * @param
     * @Autor elijahliu
     * @method a
     * @Date 2018/2/26 13:58
     * @Return a
     */
    public String PrintMinNumber(int [] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0;i<numbers.length;i++) {
            list.add(numbers[i]);
        }
        //比较器用的快排
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String a = o1.toString() + o2.toString();
                String b = o2.toString() + o1.toString();
                return a.compareTo(b);
            }
        });
        for (Object o : list) {
            stringBuffer.append(o);
        }
        return stringBuffer.toString();
    }
    /**
     * 比较两个数字不同排列哪个大 然后在用sort排序
     */
}
