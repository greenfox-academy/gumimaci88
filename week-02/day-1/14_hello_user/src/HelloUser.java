import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = userInput.nextLine();

        System.out.println("Hello, " + name + "!");

    }
}
