public class Q9_max_of_two_numbers {
    public static int max(int a, int b){
        return (a+b + Math.abs(a-b))/2;
    }
    public static void main(String[] args) {
        int a=40, b=80;
        System.out.println("Maximum: "+ max(a,b));
    }
}
