/**********************************************************************************************
Write a recursive method maxSum that accepts a list of integers L and an integer limit n as its
parameters and uses backtracking to find the maximum sum that can be generated by adding ele-
ments of L that does not exceed n. For example, if you are given the list of integers [7, 30, 8,
22, 6, 1, 14] and the limit of 19, the maximum sum that can be generated that does not exceed is
16, achieved by adding 7, 8, and 1. If the list L is empty, or if the limit is not a positive in-
teger, or all of L's values exceed the limit, return 0.

Each index's element in the list can be added to the sum only once, but the same number value
might occur more than once in a list, in which case each occurrence might be added to the sum.
For example, if the list is [6, 2, 1] you may use up to one 6 in the sum, but if the list is [6,
2, 6, 1] you may use up to two sixes.

Here are several example calls to your method and their expected return values:

                        List L                  Limit n maxSum(L, n) returns
                    [7, 30, 8, 22, 6, 1, 14]     19         16
                    [5, 30, 15, 13, 8]           42         41
                    [30, 15, 20]                 40         35
                    [6, 2, 6, 9, 1]              30         24
                    [11, 5, 3, 7, 2]             14         14
                    [10, 20, 30]                  7          0
                    [10, 20, 30]                 20         20
                    []                           10          0

You may assume that all values in the list are non-negative. Your method may alter the contents
of the list L as it executes, but L should be restored to its original state before your method
returns. Do not use any loops in solving this problem.
***********************************************************************************************/

public static int maxSum(List<Integer> list, Integer n) {
    if (list.isEmpty() || n < 1) {
        return 0;
    }
    int[] max = {0};
    maxSum(list, n, 0, max);
    return max[0];
}

public static void maxSum(List<Integer> list, Integer n, int sum, int[] max) {
    if (list.isEmpty()) {
        if (sum <= n && sum > max[0]) {
            max[0] = sum;
        }
    } else {
        int curr = list.remove(0);
        maxSum(list, n, sum + curr, max);
        maxSum(list, n, sum, max);
        list.add(0, curr);
    }
}
