import java.util.HashSet;
import java.util.Set;

public class Ac75 {
    public static void main(String[] args) {
    }
}

class Solution {
    public int[] findNumbersWithSum(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();
        for (int x : nums) {
            int y = target - x;
            if (set.contains(y))
                return new int[] { y, x };
            set.add(x);// 这里没看懂，但是删除会报错“Non Zero Exit Code”
        }
        return null;
    }
}