package queue;

/* 
接口：java.util.Queue<>

实现：

    java.util.LinkedList<>：双链表
    java.util.PriorityQueue<>：优先队列(堆)
        默认是小根堆，大根堆写法：new PriorityQueue<>(Collections.reverseOrder())
 */

import java.util.Queue;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

// 队列使用示例
public class QueueExample {
    public void queueExample() {
        // 类型需要时对象类型 Integer 等
        // 队列只能定义成 LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // 在队尾添加元素
        queue.add(1);
        queue.add(2);
        queue.add(10);
        System.out.println(queue);

        // remove 删除并返回队头
        System.out.println(queue.remove());

        // 判空
        System.out.println(queue.isEmpty());

        // 返回长度
        System.out.println(queue.size());

        // 返回队头
        System.out.println(queue.peek());

        // 清空队列
        queue.clear();

    }

    public void priorityQueueExample() {
        System.out.println("------------------------");
        System.out.println("priorityQueueExample:");
        // 小根堆示例
        Queue<Integer> pq = new PriorityQueue<>();

        // 在队尾添加元素
        pq.add(1);
        pq.add(2);
        pq.add(10);

        while (pq.size() > 0) {
            // 输出小根堆最顶元素并删除
            System.out.println(pq.remove());
        }
    }

    public void priorityQueueExampleReverse() {
        System.out.println("------------------------");
        System.out.println("priorityQueueExampleReverse:");
        // 大根堆示例
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // 在队尾添加元素
        pq.add(1);
        pq.add(2);
        pq.add(10);

        while (pq.size() > 0) {
            // 输出大根堆最顶元素并删除
            System.out.println(pq.remove());
        }
    }

    public static void main(String[] args) {
        QueueExample[] queues = { new QueueExample(), new QueueExample(), new QueueExample() };

        queues[0].queueExample();
        queues[1].priorityQueueExample();
        queues[2].priorityQueueExampleReverse();
    }
}
