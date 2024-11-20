import java.util.*;
class Main{
  public static void main(String harsh[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number");
    double num1 = sc.nextDouble();
    System.out.println("Enter second number");
    double num2 = sc.nextDouble();
    System.out.println("Choose an operation: +, -, *, /");
    char op = sc.next().charAt(0);
    double result;

    switch(op) {
      case '+':
        result = num1 + num2;
        break;
      case '-':
        result = num1 - num2;
        break;
      case '*':
        result = num1 * num2;
        break;
      case '/':
        if(num2 != 0)
          result = num1 / num2;
        else {
          System.out.println("Division by zero is not allowed");
          return;
        }
        break;
      default:
        System.out.println("Invalid operation");
        return;
    }

    System.out.println("The result is: " + result);
  }
}
