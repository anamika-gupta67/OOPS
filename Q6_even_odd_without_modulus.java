import java.util.Scanner;

public class Q6_even_odd_without_modulus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int a=sc.nextInt();
        if((a&1)==1){
            System.out.println(a+" is odd");
        }
        else{
             System.out.println(a+" is even");
        }
    }
}
