import java.util.Scanner;

public class ToyShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scanner.nextLine());

        int puzzles = Integer.parseInt(scanner.nextLine());
        int talkingDolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        int countOfToys = puzzles + talkingDolls + teddyBears + minions + trucks;
        double profitFromToys = (puzzles * 2.60) + (talkingDolls * 3) +
                (teddyBears * 4.10) + (minions * 8.20) + (trucks * 2);

        if (countOfToys >= 50) {
            profitFromToys = profitFromToys - (profitFromToys * 0.25);
        }

        double rent = 0.10;
        double finalProfit = profitFromToys - (profitFromToys * rent);

        if (finalProfit >= excursionPrice) {
            System.out.printf("Yes! %.2f lv left.", finalProfit - excursionPrice);

        } else if (finalProfit < excursionPrice) {
            System.out.printf("Not enough money! %.2f lv needed.", excursionPrice - finalProfit);
        }

    }
}
