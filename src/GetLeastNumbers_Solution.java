import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:ForOffer
 * PackageName: PACKAGE_NAME
 * Date: 2018/2/24 11:01
 */
public class GetLeastNumbers_Solution {
    /**
     * 场景及功能：
     * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
     * @param
     * @Autor elijahliu
     * @method a
     * @Date 2018/2/24 11:01
    * @Return a
     */
    /**投机法
     * @param input
     * @param k
     * @return
     */
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (k > input.length) {
            return arrayList;
        }
        Arrays.sort(input);
        for(int i = 0;i<k;i++) {
            arrayList.add(input[i]);
        }
        return arrayList;
    }

    /**
     * 基于最小堆排序实现
     * 直接使用java的堆操作
     * 堆就是一个完全二叉树 操作看
     * https://www.cnblogs.com/jetpie/p/3971382.html
     * http://blog.csdn.net/u013309870/article/details/71189189
     * 先将k个元素压入堆 后续元素如果小于堆顶元素 则弹出堆顶 将新的元素压入
     * 最后弹出小顶堆中的k个元素
     * @param input
     * @param k
     * @return
     */
    public ArrayList<Integer> GetLeastNumbers_Solution_Heap(int[] input,int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if (input.length < k) {
            return res;
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for(int i = 0;i<input.length;i++) {
            if (heap.size() < k) {
                heap.offer(input[i]);
            } else if (heap.peek() > input[i]) {
                heap.poll();
                heap.offer(input[i]);
            }
        }
        for (Integer integer : heap) {
            res.add(integer);
        }
        return res;
    }


}
