package week1;

public class Euclidean {

   public static void main(String[] args) {
      int a=424, b=38;
      int r;
      
      do {
         if (a<b) {
            int temp = a;
            a = b;
            b = temp;
         }
         r=a%b;
         if (r==0) {
            System.out.println("Answer= "+b);
            break;
         } else {
            a=b;
            b=r;
         } 
      } while (true);
      
      a=424;
      b=38;
      
      int gcd = greatestCommonDivisor(a,b);
      System.out.println("Answer= "+gcd);
   }

   private static int greatestCommonDivisor(int a, int b) {
      if (a<b) {
         int temp = a;
         a=b;
         b=temp;
      }
      int r = a%b;
      if (r==0)
         return b;
      else {
         return greatestCommonDivisor(b,r);
      }
   }
}