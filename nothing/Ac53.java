import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;//优先队列
import java.util.Queue;

public class Ac53 {
    public static void main(String[] args) {
    }
}

class Solution {
    public List<Integer> getLeastNumbers_Solution(int[] input, int k) {
        Queue<Integer> heap = new PriorityQueue<>();
        for (int x : input)
            heap.add(x);// 建立小根堆
        List<Integer> res = new ArrayList<>();
        while (k-- > 0) {
            res.add(heap.remove());
        }
        return res;
    }
}