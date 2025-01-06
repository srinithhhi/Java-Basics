import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner leo = new Scanner(System.in);
		System.out.print("Enter first number:");
		int a=leo.nextInt();
		System.out.print("Enter second number:");
		int b=leo.nextInt();
        
        int big= a>b?a:b;
        int lcm = big;
        while(true) {   
            if (lcm%a==0 && lcm%b==0)
                  break;
            else
                  lcm=big+lcm;
        }
        System.out.print(lcm);
}
}
