/**********************************************************************************************
Write a method named minGap that accepts an integer array as a parameter and returns the mini-
mum 'gap' between adjacent values in the array. The gap between two adjacent values in a array
is defined as the second value minus the first value. For example, suppose a variable called
array is an array of integers that stores the following sequence of values.

                    int[] array = {1, 3, 6, 7, 12};
                    
The first gap is 2 (3 - 1), the second gap is 3 (6 - 3), the third gap is 1 (7 - 6) and the
fourth gap is 5 (12 - 7). Thus, the call of minGap(array) should return 1 because that is the
smallest gap in the array. Notice that the minimum gap could be a negative number. For example,
if array stores the following sequence of values:

                    {3, 5, 11, 4, 8}

The gaps would be computed as 2 (5 - 3), 6 (11 - 5), -7 (4 - 11), and 4 (8 - 4). Of these values,
-7 is the smallest, so it would be returned.

This gap information can be helpful for determining other properties of the array. For example,
if the minimum gap is greater than or equal to 0, then you know the array is in sorted (nonde-
creasing) order. If the gap is greater than 0, then you know the array is both sorted and unique
(strictly increasing).

If you are passed an array with fewer than 2 elements, you should return 0.
***********************************************************************************************/

public static int minGap(int[] a) {
    int minGap;
    if (a.length < 2) {
        minGap = 0;
    } else {
        minGap = a[1] - a[0];
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i + 1] - a[i] < minGap) {
                minGap = a[i + 1] - a[i];
            }
        }
    }
    return minGap;
}