import java.util.Scanner;
public class Q11_positive_negative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number to check: ");
        int number=sc.nextInt();
        if(number>0){
            System.out.println(number+" is positive number.");
        }
        else{
            System.out.println(number+" is negative number.");
        }
    }
}
