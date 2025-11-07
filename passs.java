package rooman;
import java.util.Scanner;

public class LoginCheck {

    public static void main(String[] args) {
        // Correct login credentials
        String correctUsername = "karthik";
        String correctPassword = "12345";

        Scanner sc = new Scanner(System.in);

        System.out.println("=== LOGIN SYSTEM ===");
        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        // Check login
        if (username.equalsIgnoreCase(correctUsername) && password.equals(correctPassword)) {
            System.out.println("\n✅ Login Successful! Welcome, " + username + "!");
        } else if (!username.equalsIgnoreCase(correctUsername)) {
            System.out.println("\n❌ Invalid Username! Access Denied.");
        } else {
            System.out.println("\n❌ Wrong Password! Try Again.");
        }

        sc.close();
    }
}
