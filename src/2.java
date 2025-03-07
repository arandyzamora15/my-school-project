public class Calculator {
  public static void main(String[] args) {
    System.out.println("Welcome to the calculator!");
    
    int num1 = 5;
    int num2 = 3;
    String operation = "add";
    
    switch (operation) {
      case "add":
        System.out.println(num1 + num2);
        break;
      case "subtract":
        System.out.println(num1 - num2);
        break;
      case "multiply":
        System.out.println(num1 * num2);
        break;
      case "divide":
        if (num2 != 0) {
          System.out.println(num1 / num2);
        } else {
          System.out.println("Error: cannot divide by zero!");
        }
        break;
    }
    
    System.out.println("Goodbye!");
  }
}
