import java.util.*;

class Solution16 {
    public String largestNumber(int[] nums) {
        int n = nums.length;

        // 转换为 Integer 数组（因为需要使用自定义比较器）
        Integer[] numsArr = new Integer[n];
        for (int i = 0; i < n; i++) {
            numsArr[i] = nums[i];
        }

        // 按 (y + x) 与 (x + y) 的字符串比较结果排序
        Arrays.sort(numsArr, (x, y) -> {
            String sx = x.toString();
            String sy = y.toString();
            return (sy + sx).compareTo(sx + sy); // 注意：降序排列
        });

        // 若排序后首元素为 0，则整个数都是 0
        if (numsArr[0] == 0) {
            return "0";
        }

        StringBuilder ret = new StringBuilder();
        for (int num : numsArr) {
            ret.append(num);
        }

        return ret.toString();
    }
}
