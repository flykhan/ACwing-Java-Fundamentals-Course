/**
 * 通过冒泡排序算法实现效果
 */
public class DataSort {
    // 程序代码

    public void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public String display(int[] array) {
        String res = "";
        for (int i : array) {
            res += i + "  ";
        }
        return res;
    }

    public static void main(String[] args) {
        // 提供一组无序的数据
        int[] array = { 12, 9, 78, 95, 16, 56, 3 };

        // 程序代码
        DataSort ds = new DataSort();
        System.out.println("排序前:" + ds.display(array));
        ds.bubbleSort(array);
        System.out.println("排序后:" + ds.display(array));
    }
}
