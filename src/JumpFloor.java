/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:ForOffer
 * PackageName: PACKAGE_NAME
 * Date: 2018/2/6 17:06
 */
public class JumpFloor {
    /**
     * 场景及功能：
     *一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
     * @param
     * @Autor elijahliu
     * @method a
     * @Date 2018/2/6 17:08
    * @Return a
     */
    public int JumpFloor(int target) {
        if(target<=0){
            return 0;
        }
        else if (target == 1) {
            return 1;
        }
        else if (target == 2) {
            return 2;
        }else{
            return JumpFloor(target-1)+JumpFloor(target-2);
        }
    }
    public int JumpFloor2(int target){
        //非递归
        if (target <= 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }
        int one = 1, two = 2, three = 3;
        for(int i= 3;i<=target;i++){
            three = one + two;
            one = two;
            two = three;
        }
        return three;
    }
}
/**
 * 跳到最后一个台阶 无非是最后跳一步或跳两步
 * 如果有六个台阶 那么无非是从第五个跳一步 从第四个跳两步
 * 那么有多少种方式跳到第五个 就有多少种方式跳到第六个
 * 有多少种方式跳到第四个就有多少种方式跳到第六个
 * 故 f(6) = f(5)+f(4)
 * 以此向下推同理 其实是一个斐波那契数列
 *
 */
