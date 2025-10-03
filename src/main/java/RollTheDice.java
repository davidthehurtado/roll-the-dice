public class RollTheDice {
    public static void main(String[] args) {
        Dice dice = new Dice();

        int roll1, roll2, sum;
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        for (int i = 1; i <= 100; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            sum = roll1 + roll2;

            System.out.println("Roll " + i + ": " + roll1 + " - " + roll2 + " Sum: " + sum);

            if (sum == 2) {
                twoCounter++;
            } else if (sum == 4) {
                fourCounter++;
            } else if (sum == 6) {
                sixCounter++;
            } else if (sum == 7) {
                sevenCounter++;
            }
        }
        System.out.println("\nResults after 100 rolls:");
        System.out.println("Number of 2s rolled: " + twoCounter);
        System.out.println("Number of 4s rolled: " + fourCounter);
        System.out.println("Number of 6s rolled: " + sixCounter);
        System.out.println("Number of 7s rolled: " + sevenCounter);
    }
}
