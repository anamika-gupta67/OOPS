import java.util.Scanner;
public class Q4_assignment {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter first number: ");
       int num1=sc.nextInt();
       System.out.print("Enter second number: ");
       int num2=sc.nextInt();  
       //Assignment operator
       int a= num1;
       a += num2;
       System.out.println("Assignment(+): "+a);

       a= num1;
       a -= num2;
       System.out.println("Assignment(-): "+a);

       a= num1;
       a *= num2;
       System.out.println("Assignment(*): "+a);

       if(num2!=0){
         a = num1;
         a /= num2;
         System.out.println("Assignment(/): "+a);
       }
       //increment or decrement operator
       System.out.println("num1 before increment: "+num1);
       System.out.println("Post increment(num1++): "+(num1++));
       System.out.println("Pre increment(++num1): "+(++num1));

       System.out.println("num2 before increment: "+num2);
       System.out.println("Post increment(num2++): "+(num2++));
       System.out.println("Pre increment: "+(++num2));
}
}
