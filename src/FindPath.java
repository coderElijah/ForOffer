import java.util.ArrayList;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:ForOffer
 * PackageName: PACKAGE_NAME
 * Date: 2018/2/23 15:24
 */
public class FindPath {
    ArrayList<Integer> path = new ArrayList<>();
    ArrayList<ArrayList<Integer>> paths = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null) {
            return paths;
        }
        path.add(root.val);
        target -= root.val;
        if (target==0 && root.left == null && root.right == null) {
            paths.add(new ArrayList<Integer>(path));
        }
        FindPath(root.left, target);
        FindPath(root.right, target);
        path.remove(path.size() - 1);
        return paths;
    }
    /**
     * 通过先序遍历用递归的方式深度遍历 试过用栈的方法并不是很好做
     * 24行 需要新建一个list添加 不然指针都指向同一个list
     * 如到叶子结点 和不是target 则需要回退到上一个父节点 在path中的路径也要删除
     */
}
