import java.util.*;

class Vignere
{
	public static void main(String a[])
	{
		StringBuffer ans=new StringBuffer();
		System.out.println("Enter 1 for encryption or 2 for decryption:\n");
		Scanner s=new Scanner(System.in);
		int c=s.nextInt();
		int k=0;
		for(int i=0;i<a[0].length();i++)
		{
			if(k==a[1].length())
				k=0;
			if(c==1)
			ans.append(Character.toString((char)(((a[0].codePointAt(i)+a[1].codePointAt(k))%26)+'A')));
			else
			{
				int tmp=a[0].codePointAt(i)-a[1].codePointAt(k);
				if(tmp<0)
					tmp=26-(((int)Math.abs(tmp))%26);
				else
					tmp=tmp%26;
			ans.append(Character.toString((char)(tmp+'A')));
			}
			k++;
		}
		if(c==1)
		System.out.println("Encrypted text: "+ans);
		else
		System.out.println("Decrypted text: "+ans);
	}
}