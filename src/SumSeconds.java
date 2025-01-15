import java.util.Scanner;

public class SumSeconds {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstCompetitorTime = Integer.parseInt(scanner.nextLine());
        int secondCompetitorTime = Integer.parseInt(scanner.nextLine());
        int thirdCompetitorTime = Integer.parseInt(scanner.nextLine());

        int totalTime = firstCompetitorTime + secondCompetitorTime + thirdCompetitorTime;
        int minutesCalc = totalTime / 60;
        int secondsCalc = totalTime % 60;

        if (secondsCalc < 10) {
            System.out.printf("%d:0%d", minutesCalc, secondsCalc);

        } else {
            System.out.printf("%d:%d", minutesCalc, secondsCalc);
        }
    }
}
