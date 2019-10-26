/**
 * 在一个二维数组中，每一行都按照从左到右递增
 * 的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组
 * 和一个整数，判断数组中是否包含该整数。
 */

public class No03 {

    public static void main(String[] args) {
        int[][] arr = //
                {{1, 2, 8, 9},//
                        {2, 4, 9, 12},//
                        {4, 7, 10, 13},//
                        {6, 8, 11, 15}};//

        System.out.println(search1(arr, 6));
    }


    private static boolean search(int[][] arr, int value) {
        int a = arr[0].length;
        int b = arr.length;
        int i = 0;
        int j = a - 1;

        while (i <= b - 1 && j >= 0) {
            if (arr[i][j] == value) {
                return true;
            }
            if (arr[i][j] > value) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }

    /**
     * 思路2  1判断 如果value小于最小值 或者大于最大值.直接false
     *       2在对角线上进行二分查找,确定范围区间。
     *      3 继续 二分查找 知道 确定。
     *
     * @param arr
     * @param value
     * @return
     */
    private static boolean search1(int[][] arr, int value) {
        //TODO
        return false;
    }

}
