import java.util.Scanner;

public class BonusScore {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());

        double bonusPoints = 0;

        if (number <= 100) {
            bonusPoints = 5;

        } else if (number <= 1000) {
            bonusPoints = number * 0.20;

        } else {
            bonusPoints = number * 0.10;

        }

        if (number % 2 == 0) {
            bonusPoints = bonusPoints + 1;
        }

        if (number % 10 == 5) {
            bonusPoints = bonusPoints + 2;
        }

        System.out.println(bonusPoints);
        System.out.println(number + bonusPoints);
    }
}
