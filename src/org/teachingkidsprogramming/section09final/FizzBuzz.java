package org.teachingkidsprogramming.section09final;

public class FizzBuzz
{
  public static void main(String[] args)
  {
    //   For the whole numbers from 1 to 100, 
    for (int i = 1; i < 101; i++)
    {
      //    If that number is divisible by 3 and 5, then print the word 'FizzBuzz'
      if (i % 15 == 0)
      {
        System.out.println("FizzBuzz");
      }
      //    If that number is divisible by 3, then print the word 'Fizz', 
      else if (i % 3 == 0)
      {
        System.out.println("Fizz");
      }
      //    If that number is divisible by 5, then print the word 'Buzz', 
      else if (i % 5 == 0)
      {
        System.out.println("Buzz");
      }
      // print either that number, or, 
      else
      {
        System.out.println(i);
      }
    }
  }
}
