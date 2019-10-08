import java.util.*;

class RSA
{
	public static void main(String a[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter p:\n");
		int p=s.nextInt();
		System.out.println("Enter q:\n");
		int q=s.nextInt();
		System.out.println("Enter message:\n");
		int m=s.nextInt();
		System.out.println("Enter e:\n");
		int e=s.nextInt();
		int n=p*q;
		int fn=(p-1)*(q-1);
		int c=0;
		if(gcd(e,fn))
		{
			c=((int)Math.pow(m,e))%n;
			System.out.println("Encrypted message: "+c);
		}
		else
			System.out.println("e not co-prime with function value");
		int d=-1;
		for(int i=0;i<fn;i++)
		{
		  if(e*i%26==1)
		  {
			  d=i;
			  break;
		  }
		}
		int ms=((int)Math.pow(c,e))%n;
		System.out.println("Decrypted message: "+ms);
	}
	public static boolean gcd(int a, int b)
	{
		for(int i=2;i<(a<b?a:b);i++)
		{
			if(a%i==0 && b%i==0)
				return false;
		}
		return true;
	}
}