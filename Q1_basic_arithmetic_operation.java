import java.util.Scanner;
public class Q1_basic_arithmetic_operation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1=sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2=sc.nextDouble();
        //Addition
        System.out.println("Sum is: "+(num1 + num2));
        //Subtraction
        System.out.println("Difference is: "+(num1 - num2));
        //Multiplication
        System.out.println("Product is: "+(num1 * num2));
        //Division
        System.out.println("Quotient is: "+(num1 / num2));
    }
}
