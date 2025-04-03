import java.util.Scanner;
public class Q18_complex_number {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter real part: ");
       int real=sc.nextInt();
       System.out.print("Enter imaginary part: ");
       int imaginary=sc.nextInt();

       if(real==0 && imaginary!=0){
        System.out.print("The number is purely imaginary: "+imaginary+"i");
       }
       else if(real!=0 && imaginary==0){
        System.out.print("The number is purely real: "+real);
       }
       else if(real==0 && imaginary==0){
        System.out.print("The number is neither real nor imaginary(Zero).");
       }
       else{
        System.out.print("The number is complex number: "+real+"+"+imaginary+"i");
       }
    }
}
