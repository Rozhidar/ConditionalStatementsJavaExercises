import java.util.Scanner;

public class TimePlusFifteenMinutes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        minutes += 15;

        if (minutes >= 60) {
            hour += 1;
            minutes = minutes % 60;

            if (hour == 24) {
                hour = 0;
            }
        }

        System.out.printf("%d:%02d", hour, minutes);


    }
}
