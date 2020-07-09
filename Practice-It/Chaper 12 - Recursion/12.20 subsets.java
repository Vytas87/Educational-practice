/**********************************************************************************************
Write a method subsets that uses recursive backtracking to find every possible sub-list of a
given list. A sub-list of a list L contains 0 or more of L's elements. Your method should accept
a List of strings as its parameter and print every sub-list that could be created from elements
of that list, one per line. For example, suppose a variable called list stores the following
elements:

                    [Janet, Robert, Morgan, Char]
    
The call of subsets(list); would produce output such as the following:

                    [Janet, Robert, Morgan, Char]
                    [Janet, Robert, Morgan]
                    [Janet, Robert, Char]
                    [Janet, Robert]
                    [Janet, Morgan, Char]
                    [Janet, Morgan]
                    [Janet, Char]
                    [Janet]
                    [Robert, Morgan, Char]
                    [Robert, Morgan]
                    [Robert, Char]
                    [Robert]
                    [Morgan, Char]
                    [Morgan]
                    [Char]
                    []

The order in which you show the sub-lists does not matter, but the order of the elements of each
sub-list DOES matter (Note: this requirement is a limitation of Practice-It testing code. The text-
book version of the problem would accept an answer with the elements in any order). The key thing
is that your method should produce the correct overall set of sub-lists as its output. Notice that
the empty list is considered one of these sub-lists. You may assume that the list passed to your
method is not null and that the list contains no duplicates. Do not use any loops in solving this
problem.

Hint: This problem is somewhat similar to the permutations problem. Consider each element and try
to generate all sub-lists that do include it, as well as all sub-lists that do not include it.

It can be hard to see a pattern from looking at the lines of output. But notice that the first 8
of 16 total lines of output constitute all the sets that include Janet, and the last 8 lines are
the sets that do not have her as a member. Within either of those groups of 8 lines, the first 4
of them are all the sets that include Robert, and the last 4 lines are the ones that do not inc-
lude him. Within a clump of 4, the first 2 are the ones including Morgan, and the last 2 are the
ones that do not include Morgan. And so on. Once again, you do not have to match this exact order,
but looking at it can help with figuring out the patterns and the recursion.
***********************************************************************************************/

public static void subsets(List<String> list) {
    subsets(list, "[");
}

public static void subsets(List<String> list, String result) {
    if (list.isEmpty()) {
        int index = result.lastIndexOf(", ");
        if (index != -1) {
            result = result.substring(0, index);
        }
        System.out.println(result + "]");
    } else {
        String curr = list.remove(0);
        subsets(list, result + curr + ", ");
        subsets(list, result);
        list.add(0, curr);
    }
}
