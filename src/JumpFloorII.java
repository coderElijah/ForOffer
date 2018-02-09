/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:ForOffer
 * PackageName: PACKAGE_NAME
 * Date: 2018/2/8 16:01
 */
public class JumpFloorII {
    /**
     * 场景及功能：
     *一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
     * @param
     * @Autor elijahliu
     * @method a
     * @Date 2018/2/8 16:01
    * @Return a
     */
    public int JumpFloorII(int target) {
        //通过移位计算2的次方
        return 1<<(target-1);
    }
    /**
     * 由上一个跳台阶问题理解这个变态的
     * 沿用分析思路
     * 如 n个台阶
     * 可以从n-1个台阶上跳上去 n-1个台阶有多少种跳法 n就有多少
     * 或n-2个台阶跳上去n-2个台阶有多少种跳法n就有多少
     * 。
     * 。
     * 。
     * 可以从第一个台阶跳上去
     * 还可以直接跳n个上去
     * 则f(n) = f(n-1)+f(n-2)+.......+f(1)
     * f(1)=1
     * f(2) = 1+f(1)=2
     * f(3) = f(2)+f(1)+1 = 4
     * f(4) = f(3)+f(2)+f(1)+1 = 8
     * 可以总结出
     * f(n) = 2^(n-1)
     * 可以通过左移来计算2次幂
     */
}
