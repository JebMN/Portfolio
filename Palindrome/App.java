import java.util.Scanner;

public class App{
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n ---This is the palindrome tester---");
        System.out.println("Enter a word : ");
        String word = scanner.nextLine().toLowerCase();
        boolean isPali = true;

        for (int i = 0; i < word.length() / 2; i++) { 
            if (word.charAt(i) != word.charAt(word.length() -1 -i )){
                isPali = false;
                break;
            }
        }

        if (isPali) { 
            System.out.println(word + " is a palindrome!");
            
        } else {
            System.out.println(word + " is not a palindrome!");
        }
        scanner.close();                    
    }
}