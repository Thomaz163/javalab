import java.util.Scanner;
public class grade {
	public static void main(String [] args) {
		int mark;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the mark of the student: ");
		mark= sc.nextInt();
		if (mark>=90) {
			System.out.println("the grade is A");}
		else if (mark<90&&mark>=80) {
			System.out.println("the grade is B");}
		else if (mark<80&&mark>=70) {
			System.out.println("the grade is C");}
		else if (mark<70&&mark>=60) {
			System.out.println("the grade is D");}
		else if (mark<60&&mark>=50) {
			System.out.println("the grade is E");}
		else {
			System.out.println("FAILED");
		}
			}
	
			
	}


	
