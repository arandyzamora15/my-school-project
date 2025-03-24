import java.util.Scanner;

public class SchoolProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        
        System.out.println("Enter a sentence:");
        String sentence = scanner.next();
        
        if (sentence.contains("school project")) {
            System.out.println("The sentence contains the word 'school project'.");
        } else {
            System.out.println("The sentence does not contain the word 'school project'.");
        }
    }
}
