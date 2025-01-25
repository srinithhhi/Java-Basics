public class Main
{
	public static void main(String[] args)
	{
		String s = "aaaaabbccccdddddddddddaaac";
		String r = "";
		int c=1;
		for (int i=0; i<s.length(); i++)
		{
		    if((i+1)<s.length() && s.charAt(i)==s.charAt(i+1))
		    {
		        c++;
		    }
		    else {
		        r=r+s.charAt(i);
		        r=r+c;
		        c=1;
		    }
		}
		System.out.print(r);
	}
}
