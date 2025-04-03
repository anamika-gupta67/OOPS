import java.util.Scanner;
public class Q14_even_odd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print("Enter any number: ");
        if(a%2==1){
            System.out.println(a+" is odd");
        }
        else{
             System.out.println(a+" is even");
        }
    }
}