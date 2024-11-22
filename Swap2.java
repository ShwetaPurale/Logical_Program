class Swap2
{
public static void main(String[]args)
{
  int a=100, b=200;
  a= a+b;
  b= a-b;
  a= a-b;
  System.out.println("value of a is "+a);
  System.out.println("value of b is "+b);
  }
}