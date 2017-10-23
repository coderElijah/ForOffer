/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:ForOffer
 * PackageName: PACKAGE_NAME
 * Date: 2017/10/23 17:10
 */

public class Fibonacci {
    /**
     * 场景及功能：
     *题目描述
     大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项
     * @param null
     * @Autor elijahliu
     * @method a
     * @Date 2017/10/23 17:11
    * @Return a
     */
    public int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}
