import java.util.Scanner;
public class Q3_bitwise_operator {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter second number: ");
        int num2=sc.nextInt();
        //bitwise operator
        System.out.println("Bitwise AND(&): "+(num1 & num2));
        System.out.println("Bitwise OR(|): "+(num1 | num2));
        System.out.println("Bitwise XOR(^): "+(num1 ^ num2));
        System.out.println("Bitwise Complement (~num1): "+(~num1));
        System.out.println("Bitwise Complement (~num2): "+(~num2));
        System.out.println("Left Shift(num1 << 1): "+(num1 << 1));
        System.out.println("Right Shift(num1 >> 1): "+(num1 >> 1));
    }
}
