import java.util.*;
public class Q1_even_odd {
    /**
     * @param args
     */
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if((a&1)==1){
            System.out.println(a+" is odd");
        }
        else{
             System.out.println(a+" is even");
        }
    }
}