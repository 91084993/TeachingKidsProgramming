public class Pow2
{
  public static void main(String[] args)
  {
    int base = 5;
    int exp = 2;
    int result = pow(base, exp);
    System.out.println("the answer is: " + result);
  }
  public static int pow(int base, int exp)
  {
    int product = 1;
    for (int i = 0; i < exp; i++)
    {
      product = product * base;
    }
    return product;
  }
} // end of class
