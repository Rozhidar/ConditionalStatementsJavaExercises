import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double petersBudget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int proccessors = Integer.parseInt(scanner.nextLine());
        int ramMemory = Integer.parseInt(scanner.nextLine());

        double calcForVideoCards = videoCards * 250;
        double calcForProccessors = proccessors * (calcForVideoCards * 0.35);
        double calcForRamMemory = ramMemory * (calcForVideoCards * 0.10);

        double totalPrice = calcForVideoCards + calcForProccessors + calcForRamMemory;

        if (videoCards > proccessors) {
            totalPrice = totalPrice - (totalPrice * 0.15);

        }

        if (petersBudget >= totalPrice) {
            System.out.printf("You have %.2f leva left!", petersBudget - totalPrice);

        } else if (petersBudget < totalPrice) {
            System.out.printf("Not enough money! You need %.2f leva more!", totalPrice - petersBudget);

        }
    }
}
