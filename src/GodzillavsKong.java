import java.util.Scanner;

public class GodzillavsKong {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double movieBudget = Double.parseDouble(scanner.nextLine());
        int walkons = Integer.parseInt(scanner.nextLine());
        double clothingPriceForOneWalkon = Double.parseDouble(scanner.nextLine());

        double priceForWalkonsClothing = walkons * clothingPriceForOneWalkon;
        double priceForDecor = movieBudget * 0.10;

        if (walkons > 150) {
            priceForWalkonsClothing = priceForWalkonsClothing - (priceForWalkonsClothing * 0.10);
        }

        double finalExpense = priceForWalkonsClothing + priceForDecor;

        if (finalExpense > movieBudget) {
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", finalExpense - movieBudget);
            
        } else if (finalExpense <= movieBudget) {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", movieBudget - finalExpense);
            
        }

    }
}
