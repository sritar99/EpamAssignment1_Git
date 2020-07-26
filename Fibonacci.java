package normal;


import java.math.BigInteger;
import java.util.Scanner;
class Fibonacci{
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    BigInteger a,b,c;
    a=new BigInteger("0");
    b=new BigInteger("1");
    c=new BigInteger("0");
    for(int i=2;i<=n;i++)
    {
    	c=a.add(b);
    	a=b; b=c;
    }
    if(n==0)
    	 System.out.println(0);
    else if(n==1)
    	 System.out.println(1);
    else
    	 System.out.println(c);
    in.close();
  }
}
