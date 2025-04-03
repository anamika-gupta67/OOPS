import java.util.Scanner;
public class Q19_quadratic_equation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter coefficient of a: ");
        double a=sc.nextDouble();
        System.out.print("Enter coefficient of b: ");
        double b=sc.nextDouble();
        System.out.print("Enter coefficient of c: ");
        double c=sc.nextDouble();
        //calculate discriminant
        double discriminant=b*b - 4*a*c;
        double d1=Math.sqrt(discriminant);
        System.out.println("Discriminant: "+discriminant);
        //checking conditions
        if(discriminant>0){
            double root1= (-b + d1/(2*a));
            double root2= (-b - d1/(2*a));
            System.out.print("The roots are real and distinct: "+root1+" and "+root2);
        }
        else if(discriminant==0){
            double root=-b/(2*a);
            System.out.print("The roots are real and equal: "+root);
        }
        else{
            double realPart= -b/(2*a);
            double imaginaryPart= d1/(2*a);
            System.out.print("The roots are complex: "+realPart+"+"+imaginaryPart+"i and "+realPart+"-"+imaginaryPart+"i");
        }
    }
}
