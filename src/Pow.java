public class Pow
{
  public static void main(String[] args)
  {
    int base = 2;
    int exponent = 3;
    int result = pow(base, exponent);
    System.out.println("the answer is: " + result);
  }
  public static int pow(int base, int exp)
  {
    int product = 1;
    for (int i = 0; i < exp; i++)
    {
    }
    {
      product = product * base;
    }
    return product;
  }
}
