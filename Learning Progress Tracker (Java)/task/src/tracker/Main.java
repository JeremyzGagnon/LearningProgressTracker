package tracker;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Learning Progress Tracker");
        String usersInput = scanner.nextLine();

        while (!usersInput.equals("exit")) {
            if (usersInput.isEmpty() || usersInput.isBlank()) {
                System.out.println("No input.");
            } else {
                System.out.println("Unknown command!");
            }
            usersInput = scanner.nextLine();
        }
        System.out.println("Bye!");


    }
}
