/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:ForOffer
 * PackageName: PACKAGE_NAME
 * Date: 2018/2/8 16:26
 */
public class RectCover {
    /**
     * 场景及功能：
     * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
     * @param
     * @Autor elijahliu
     * @method a
     * @Date 2018/2/8 16:35
     * @Return a
     */
    public int RectCover(int target) {
        if(target<=0){
            return 0;
        }
        if (target == 1|| target==2) {
            return target;
        }
        int one = 1, two = 2, three = 0;
        for(int i=3;i<=target;i++) {
            three = two + one;
            one = two;
            two = three;
        }
        return three;
    }
    /**
     * 依旧是一个斐波那契数列的问题
     * 因为是2*n的大矩形 所以行数位2 则如果第一个2*1的小矩形竖着摆则 剩下2*(n-1)的大矩形
     * 这个大矩形有多少种摆放方式f(n)就多少种
     * 如果第一个小矩形横着摆 则下面也必须横着摆一个 而且占据两列 则剩下2*(n-2)的大矩形
     * 这个大矩形有多少种 则f(n)就有多少种
     * 则 f(n) = f(n-1)+f(n-2)
     */
}
