public class Q7_swap {
    public static void main(String[] args){
      int a=10, b=20;
      System.out.println("Before swapping: a= "+ a + ", b="+ b);
      //swapping using XOR
      a=a^b;
      b=a^b;
      a=a^b;
      System.out.println("After swapping: a= "+ a + ", b="+ b);
    }
}
