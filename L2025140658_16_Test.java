
/**
 * 测试类：L123456_16_Test
 * * 测试用例设计总体原则：
 * 本测试类基于“等价类划分”和“边界值分析”原则设计测试用例。
 * 1. 等价类划分：
 * - 有效等价类：
 * - 包含多个元素的标准数组（如示例）
 * - 只包含一个元素的数组
 * - 包含重复元素的数组
 * - 无效等价类：（本题中 nums 假设为非负整数，不测试负数或非数字）
 * 2. 边界值分析：
 * - 包含 0 的数组
 * - 数组中所有元素均为 0
 * - 包含数字 10 和 2 (示例1，测试 "2" > "10")
 * - 包含数字 3, 30, 34 (示例2，测试 "3" 和 "30" 的排序)
 * - 包含长短不一但前缀相同的数字 (如 12, 121)
 */
public class L2025140658_16_Test {

    // 这是一个辅助方法，用于执行单个测试并报告结果
    private static void runTest(Solution solution, String testName, int[] nums, String expected) {
        String actual = solution.largestNumber(nums);
        if (expected.equals(actual)) {
            System.out.println("[PASS] " + testName);
        } else {
            System.out.println("[FAIL] " + testName + " - 预期: " + expected + ", 实际: " + actual);
        }
    }

    /**
     * 测试目的：验证实验手册中提供的示例 1
     * 测试用例：nums = [10, 2]
     * 预期输出："210"
     */
    private static void testExample1(Solution solution) {
        int[] nums = {10, 2};
        String expected = "210";
        runTest(solution, "testExample1", nums, expected);
    }

    /**
     * 测试目的：验证实验手册中提供的示例 2
     * 测试用例：nums = [3, 30, 34, 5, 9]
     * 预期输出："9534330"
     */
    private static void testExample2(Solution solution) {
        int[] nums = {3, 30, 34, 5, 9};
        String expected = "9534330";
        runTest(solution, "testExample2", nums, expected);
    }

    /**
     * 测试目的：验证边界值 - 数组中所有元素均为 0
     * 测试用例：nums = [0, 0, 0]
     * 预期输出："0"
     */
    private static void testAllZeros(Solution solution) {
        int[] nums = {0, 0, 0};
        String expected = "0";
        runTest(solution, "testAllZeros", nums, expected);
    }
    
    /**
     * 测试目的：验证边界值 - 数组只包含一个元素
     * 测试用例：nums = [5]
     * 预期输出："5"
     */
    private static void testSingleElement(Solution solution) {
        int[] nums = {5};
        String expected = "5";
        runTest(solution, "testSingleElement", nums, expected);
    }

    /**
     * 测试目的：验证特殊排序 - 前缀相同 (e.g., 121 和 12)
     * 测试用例：nums = [121, 12]
     * 预期输出："12121"
     */
    private static void testSamePrefix(Solution solution) {
        int[] nums = {121, 12};
        String expected = "12121";
        runTest(solution, "testSamePrefix", nums, expected);
    }

    /**
     * 测试目的：验证特殊排序 - 3 和 30 (示例2的子集)
     * 测试用例：nums = [3, 30]
     * 预期输出："330"
     */
    private static void testThreeAndThirty(Solution solution) {
        int[] nums = {3, 30};
        String expected = "330";
        runTest(solution, "testThreeAndThirty", nums, expected);
    }


    // 测试执行入口
    public static void main(String[] args) {
        System.out.println("开始执行 " + L2025140658_16_Test.class.getName() + "...");
        
        Solution solution = new Solution();

        // 依次执行所有测试
        testExample1(solution);
        testExample2(solution);
        testAllZeros(solution);
        testSingleElement(solution);
        testSamePrefix(solution);
        testThreeAndThirty(solution);

        System.out.println("...测试执行完毕。");
    }
}

