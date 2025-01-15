import java.util.Scanner;

public class WorldSwimmingRecord {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double distanceOfOneMeterSwamInSeconds = Double.parseDouble(scanner.nextLine());

        double distanceToSwin = distanceInMeters * distanceOfOneMeterSwamInSeconds;
        double additionalTimeCalculation = Math.floor(distanceInMeters / 15);
        additionalTimeCalculation = additionalTimeCalculation * 12.5;

        double totalNeededTime = distanceToSwin + additionalTimeCalculation;

        if (totalNeededTime < recordInSeconds) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalNeededTime);

        } else if (totalNeededTime >= recordInSeconds) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalNeededTime - recordInSeconds);

        }

    }
}
