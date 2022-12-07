package tracker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Learning Progress Tracker");
        Scanner scanner = new Scanner(System.in);
        String cmd;
        while(true) {
            cmd = scanner.nextLine();
            if (cmd.equals("exit")) {
                break;
            } else if (cmd.isEmpty() || cmd.isBlank()) {
                System.out.println("no input");
            } else {
                System.out.println("Error: unknown command!");
            }
        }
        System.out.println("Bye!");
    }
}
