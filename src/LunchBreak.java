import java.util.Scanner;

public class LunchBreak {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nameOfSeries = scanner.nextLine();
        int durationOfEpisode = Integer.parseInt(scanner.nextLine());
        int durationOfBreak = Integer.parseInt(scanner.nextLine());

        double timeForLunch = (double) durationOfBreak * 1/8;
        double timeForRest = (double) durationOfBreak * 1/4;

        double leftTime = durationOfBreak - timeForLunch - timeForRest;

        if (leftTime >= durationOfEpisode) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", nameOfSeries, Math.ceil(leftTime - durationOfEpisode));

        } else if (leftTime < durationOfEpisode) {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", nameOfSeries, Math.ceil(durationOfEpisode - leftTime));

        }
    }
}
