/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:ForOffer
 * PackageName: PACKAGE_NAME
 * Date: 2018/2/9 10:08
 */
public class Power {
    /**
     * 场景及功能：
     * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
     * @param
     * @Autor elijahliu
     * @method a
     * @Date 2018/2/9 10:08
    * @Return a
     */
    public double Power(double base, int exponent) {
        boolean flag = false;
     if(exponent<0){
         if (base == 0) {
             throw new RuntimeException();
         }
         flag = true;
         exponent = -exponent;
     }
        double result = 1;
        for(int i = exponent;i>0;i--){
            result *= base;
        }
        if(flag){
            result = 1 / result;
        }
        return result;
    }
}
