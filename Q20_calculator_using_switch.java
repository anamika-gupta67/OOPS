import java.util.Scanner;
public class Q20_calculator_using_switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter operator('+','-','*','/','%'): ");
        char operator=sc.next().charAt(0);
        System.out.print("Enter first number: ");
        double num1=sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2=sc.nextDouble();
        double result=0;
        switch (operator) {
            case '+':
                result= num1 + num2;
                System.out.println("Sum: "+result);
                break;
            case '-':
                result= num1 - num2;
                System.out.println("Difference: "+result);
                break;
            case '*':
                result= num1 * num2;
                System.out.println("Product: "+result);
                break;
            case '/':
                if(num2!=0){
                  result= num1 / num2;
                  System.out.println("Quotient: "+result);
                }
                else{
                    System.out.println("Invalid value: Division by zero is not allowed.");
                }
                break;
            case '%':
                if(num2!=0){
                result= num1 % num2;
                System.out.println("Remainder: "+result);
                }
                else{
                  System.out.println("Invalid value: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator...");
                break;
        }
    }
}
