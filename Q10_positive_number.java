import java.util.Scanner;
public class Q10_positive_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number to check: ");
        int number=sc.nextInt();
        if(number>0){
            System.out.println(number+" number is positive.");
        }
    }
}