public class Swap {

      public static void main(String[] args) {

            int a = 10;
            int b = 20;
            int temp;

            System.out.println("Befor swapping: a=" + a + " b=" + b);

            temp = a;
            a = b;
            b = temp;

            System.out.println("After swapping: a=" + a + " b=" + b);
      }

}
