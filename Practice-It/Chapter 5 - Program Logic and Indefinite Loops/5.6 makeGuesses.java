/**********************************************************************************************
Write a method named makeGuesses that will guess numbers between 1 and 50 inclusive until it
makes a guess of at least 48. It should report each guess and at the end should report the total
number of guesses made. Below is a sample execution:

                    guess = 43
                    guess = 47
                    guess = 45
                    guess = 27
                    guess = 49
                    total guesses = 5

***********************************************************************************************/

public static void makeGuesses() {
    Random random = new Random();
    int guess = random.nextInt(50) + 1;
    System.out.println("guess = " + guess);
    int count = 1;
    while (guess < 48) {
        guess = random.nextInt(50) + 1;
        System.out.println("guess = " + guess);
        count++;
    }
    System.out.println("total guesses = " + count);
}
