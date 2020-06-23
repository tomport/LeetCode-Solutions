import java.util.Scanner;

public class Calc{
    public static void main(String[] args){
        double num1;
        double num2;
        char operator;
        double answer;
        Scanner read = new Scanner(System.in);
        System.out.print("Enter two numbers separated by an operator: ");
        num1 = read.nextDouble();
        operator = read.next().charAt(0);
        num2 = read.nextDouble();
        switch(operator) {
            case '+': answer = num1 + num2;
                break;
            case '-': answer = num1 - num2;
                break;
            case '*': answer = num1 * num2;
                break;
            case '/': answer = num1 / num2;
                break;
            default:  System.out.printf("Incorrect operator");
                return;
        }
        System.out.print("\nAnswer:\n");
        System.out.printf(num1 + " " + operator + " " + num2 + " = " + answer);
    }
}