/**********************************************************************************************
Write a method called printPowersOfN that accepts a base and an exponent as arguments and
prints each power of the base from base^0 (1) up to that maximu power, inclusive. For example,
consider the following calls:

                    printPowersOfN(4, 3);
                    printPowersOfN(5, 6);
                    printPowersOfN(-2, 8);

These calls should produce the following output:

                    1 4 16 64
                    1 5 25 125 625 3125 15625
                    1 -2 4 -8 16 -32 64 -128 256

You may assume that the exponent passed to printPowersOfN has a value of 0 or greater. (The Math
class may help you with this problem. If you use it, you may need to cast its results from double
to int so that you don't see a .0 after each number in your output. Also, can you write this
program without using the Math class?)
***********************************************************************************************/

public static void printPowersOfN(int base, int power) {
    if (power == 0) {
        System.out.print(1);
    } else {
        System.out.print(1 + " ");
        int sum = 1;
        for (int i = 1; i <= power; i++) {
            sum *= base;
            System.out.print(sum + " ");
        }
    }
}
