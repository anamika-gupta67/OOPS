import java.util.Scanner;
public class Q12_positive_negative_zero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number to check: ");
        int number=sc.nextInt();
        if(number==0){
            System.out.println(number+" it is zero.");
        }
        else if(number>0){
            System.out.println(number+" is a positive number.");
        }
        else{
            System.out.println(number+" is a negative number.");
        }
    }
}
