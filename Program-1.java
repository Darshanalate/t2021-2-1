import java.util.Scanner;
class Calculator {
  public static void main(String[] args) {
    String operator;
    Double a, b, result;
    Scanner input = new Scanner(System.in);
    System.out.println("Choose an operator: Add, Sub, Mul, or Div");
    operator = input.next();
    System.out.println("Enter first number");
    a = input.nextDouble();
    System.out.println("Enter second number");
    b = input.nextDouble();
    switch (operator) {
      case "Add":
        result = a + b;
        System.out.println(a + " + " + b + " = " + result);
        break;
      case "Sub":
        result = a - b;
        System.out.println(a + " - " + b + " = " + result);
        break;
      case "Mul":
        result = a * b;
        System.out.println(a + " * " + b + " = " + result);
        break;
      case "Div":
        result = a / b;
        System.out.println(a + " / " + b + " = " + result);
        break;
      default:
        System.out.println("Invalid operator!");
        break;
    }
    input.close();
  }
}
