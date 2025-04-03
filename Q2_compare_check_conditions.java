import java.util.Scanner;
public class Q2_compare_check_conditions {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter first number: ");
     int num1=sc.nextInt();
     System.out.println("Enter second number: ");
     int num2=sc.nextInt();   
     //checking conditions
     if(num1==num2){
        System.out.println("Both numbers are eqaul.");
     } else if(num1>num2){
        System.out.println("First number is greater than second number.");
     } else {
        System.out.println("First number is smaller than second number.");
     }
     //Additional conditions
     if(num1 >= num2){
        System.out.println("First number is greater than or equal to second number.");
     }
     if(num1 <= num2){
        System.out.println("First number is less than or equal to second number.");
     }
    }
}
