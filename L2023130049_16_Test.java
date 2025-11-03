import java.util.*;

public class L2023130049_16_Test {
    public static void main(String[] args) {
        Solution16 solution = new Solution16();

        // 测试用例 1
        int[] nums1 = {10, 2};
        System.out.println("输入: [10, 2]");
        System.out.println("输出: " + solution.largestNumber(nums1));
        System.out.println("期望: 210\n");

        // 测试用例 2
        int[] nums2 = {3, 30, 34, 5, 9};
        System.out.println("输入: [3, 30, 34, 5, 9]");
        System.out.println("输出: " + solution.largestNumber(nums2));
        System.out.println("期望: 9534330\n");

        // 测试用例 3
        int[] nums3 = {0, 0};
        System.out.println("输入: [0, 0]");
        System.out.println("输出: " + solution.largestNumber(nums3));
        System.out.println("期望: 0\n");

        // 测试用例 4
        int[] nums4 = {999999998, 999999997, 999999999};
        System.out.println("输入: [999999998, 999999997, 999999999]");
        System.out.println("输出: " + solution.largestNumber(nums4));
        System.out.println("期望: 999999999999999998999999997\n");

        // 测试用例 5（随机组合）
        int[] nums5 = {12, 121};
        System.out.println("输入: [12, 121]");
        System.out.println("输出: " + solution.largestNumber(nums5));
        System.out.println("期望: 12121\n");

        // 测试用例 6（单元素）
        int[] nums6 = {5};
        System.out.println("输入: [5]");
        System.out.println("输出: " + solution.largestNumber(nums6));
        System.out.println("期望: 5\n");
    }
}
