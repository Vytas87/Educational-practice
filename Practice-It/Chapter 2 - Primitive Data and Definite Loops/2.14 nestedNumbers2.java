/**********************************************************************************************
Modify your code from the previous problem to produce the following output:

                    999998888877777666665555554444433333222221111100000
                    999998888877777666665555554444433333222221111100000
                    999998888877777666665555554444433333222221111100000
                    999998888877777666665555554444433333222221111100000
                    999998888877777666665555554444433333222221111100000

***********************************************************************************************/

for (int i = 1; i <= 5; i++) {
    for (int j = 9; j >= 0; j--) {
        for (int z = 1; z <= 5; z++) {
            System.out.print(j);
        }
    }
    System.out.println();
}
