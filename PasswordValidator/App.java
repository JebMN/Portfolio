import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasSpecial = false;
        boolean hasLength = password.length() >= 10;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
        
            if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecial = true;
            }
        }
        
        boolean isValid = hasLower && hasLength && hasSpecial && hasLength;
        if (isValid) {
            System.out.println("Strong Password !");
        } else {
            System.out.println("Not a strong password, try again!");
        }
        scanner.close();
    }
}