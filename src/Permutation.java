import java.util.ArrayList;
import java.util.Collections;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:ForOffer
 * PackageName: PACKAGE_NAME
 * Date: 2018/2/24 09:32
 */
public class Permutation {
    /**
     * 场景及功能：
     * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
     *
     * @param
     * @Autor elijahliu
     * @method a
     * @Date 2018/2/24 09:34
     * @Return a
     */
    public static void main(String[] args) {
        Permutation("abb");
    }

    public static ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if (str != null && str.length() > 0) {
            PermutationHelper(str.toCharArray(), 0, res);
        }
        Collections.sort(res);
        return res;
    }

    static void PermutationHelper(char[] strArr, int index, ArrayList<String> res) {
        if (index == strArr.length - 1) {
            if (!res.contains(String.valueOf(strArr))) {
                res.add(String.valueOf(strArr));
            }
        }
        for (int i = index; i < strArr.length; i++) {
            //交换对应位置
            swap(strArr, index, i);
            //回溯
            PermutationHelper(strArr, index + 1, res);
            //交换回去 还原为原序列进行下两个元素的交换
            swap(strArr, index, i);
        }
    }

    static void swap(char[] strArr, int a, int b) {
        if (a != b) {
            char temp = strArr[a];
            strArr[a] = strArr[b];
            strArr[b] = temp;
        }
    }

    /**
     * 全排列回溯算法参考http://www.cnblogs.com/cxjchen/p/3932949.html
     * 输入一个字符串，打印出该字符串中字符的所有排列。例如输入字符串abc，则输出由字符a，b，c所能排列出来的所有字符串abc，acb，bac，bca，cab和cba

     正常人的思维是，固定第一个字符，然后依次将后面的字符串与前面的交换，那么排列的个数就是除了第一个字符以外，其他字符的排列个数+1。

     也就是固定一个字符串之后，之后再将问题变小，只需求出后面子串的排列个数就可以得出结果，当然第一时间想到的就是递归的算法了。

     下面这张图很清楚的给出了递归的过程：


     很明显，递归的出口，就是只剩一个字符的时候，递归的循环过程，就是从每个子串的第二个字符开始依次与第一个字符交换，然后继续处理子串。

     还有一个问题要注意，就是如果字符串中有重复的字符串

     由于全排列就是从第一个数字起，每个数分别与它后面的数字交换，我们先尝试加个这样的判断——如果一个数与后面的数字相同那么这两个数就不交换 了。例如abb，第一个数与后面两个数交换得bab，bba。然后abb中第二个数和第三个数相同，就不用交换了。但是对bab，第二个数和第三个数不 同，则需要交换，得到bba。由于这里的bba和开始第一个数与第三个数交换的结果相同了，因此这个方法不行。

     换种思维，对abb，第一个数a与第二个数b交换得到bab，然后考虑第一个数与第三个数交换，此时由于第三个数等于第二个数，所以第一个数就不再用与第三个数交换了。再考虑bab，它的第二个数与第三个数交换可以解决bba。此时全排列生成完毕！

     这样，我们得到在全排列中去掉重复的规则：
     去重的全排列就是从第一个数字起，每个数分别与它后面非重复出现的数字交换。

     */
}
