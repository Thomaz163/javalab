import java.util.Scanner;
public class attendence {
	public static void main(String [] args) {
		int attendence;
		float mark=10f;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the attaendence percentage");
		attendence= sc.nextInt();
		if (attendence>=90){
			System.out.println("the grade is: "+mark);
		}
		else{
			mark=(float)attendence/10;
			System.out.println("the mark is"+mark);
		}
		
	}
		
			
	}

