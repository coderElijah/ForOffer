/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:ForOffer
 * PackageName: PACKAGE_NAME
 * Date: 2018/2/9 09:03
 */
public class NumberOf1 {
    /**
     * 场景及功能：
     * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
     * @param
     * @Autor elijahliu
     * @method a
     * @Date 2018/2/9 09:31
    * @Return a
     */
    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n-1);
            ++count;
        }
        return count;
    }
    /**
     * 假设n=3
     * 则二进制n=0110
     * 将此数-1则得 0101相当于 最右侧得1移到了末尾
     * 将原数与减一后的数做与运算相当于移除了最右得一个一
     * 如 0110&0101 = 0100
     * 则用此方法可得出1得个数
     *
     * 原码补码反码
     * 原码 正数原码补码反码都一样
     *      负数的原码最高位为1来表示为负数
     * 反码 负数的反码是除最高位以外 所有位取反
     * 补码 负数的补码 反码加1
     *
     */
}
