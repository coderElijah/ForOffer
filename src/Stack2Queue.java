import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.util.Stack;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:ForOffer
 * PackageName: PACKAGE_NAME
 * Date: 2017/10/23 16:29
 */
public class Stack2Queue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node){
        while (!stack2.empty()) {
            stack1.push(stack2.peek());
            stack2.pop();
        }
        stack1.push(node);
    }

    public int pop() {
        while (!stack1.empty()) {
            Integer val = stack1.peek();
            stack2.push(val);
            stack1.pop();
        }
        Integer peek = stack2.peek();
        stack2.pop();
        return peek;
    }
}

/**
 * 题目描述
 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
