import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Good day. What is your problem? Enter your response here or Q to quit: ");
        String answer1 = keyboard.nextLine();
        System.out.println(answer1);
        while (!answer1.equalsIgnoreCase("q")) {
            System.out.print("Enter your response here or Q to quit: ");
            String answer = keyboard.nextLine();

            if (answer.equalsIgnoreCase("q")) {

                System.out.print("goodbye");
                System.exit(0);

            } else {
                System.out.println(answer);
            }


        }
    }
}