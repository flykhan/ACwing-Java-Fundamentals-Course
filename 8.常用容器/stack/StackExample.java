package stack;

// 类：java.util.Stack<>
import java.util.Stack;

// 栈使用示例
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // 压入元素
        stack.push(1);
        stack.push(2);
        stack.push(10);
        System.out.println(stack);

        // 弹出栈顶元素,并返回栈顶元素
        stack.pop();
        System.out.println(stack);

        // 返回栈顶元素
        System.out.println(stack.peek());

        // 返回栈长度
        System.out.println(stack.size());

        // 判空
        System.out.println(stack.isEmpty());

        // 清空栈
        stack.clear();
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
    }
}