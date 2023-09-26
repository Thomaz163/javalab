
import java.util.Scanner;

public class sumof2numbers {
	public static void main(String[] args)
	{
		int n1,n2,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		n1=sc.nextInt();
		System.out.println("enter the second number");
		n2=sc.nextInt();
		sc.close();
		sum=n1+n2;
		System.out.println("sum of two numbers is: "+sum);
	}

}
