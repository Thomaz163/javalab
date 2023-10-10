/*************************************************************
 * File Name    : Metheod Overloading
 * Discription  : To calaculate area using Method overloading
 * Author       : Thomas Mathew
 * Version      : 1.0
 **************************************************************/
import java.util.Scanner;
public class metheodoverloading {
    public static void main(String [] args ) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the choice:\n 1. Rectangle \n 2. Triangle \n 3. Circle");
    	int choice;
    	choice =sc.nextInt();
    	Shape shape=new Shape();
    	if(choice==1) {
    	System.out.println("enter the length:");
    	int length =sc.nextInt();
    	System.out.println("enter the breadth:");
    	int breadth =sc.nextInt();
    	Shape.area(length,breadth);
    	}
    	else if(choice==2) {
    		System.out.println("enter the height:");
        	float height =sc.nextFloat();
        	System.out.println("enter the base:");
        	float base =sc.nextFloat();
        	Shape.area(height,base);
    	}
    	else if(choice==3) {
    		System.out.println("enter the radius:");
        	float radius =sc.nextFloat();
        	Shape.area(radius);
    	}
    	else {
    		System.out.println("invalid choice");
    	}
    		
    	
    	 
       }
    }
    	class Shape{
    	  int length;
    	  int breadth;
    	  
    	  public static void area(int length, int breadth) {
    		  System.out.println("Area of Rectangle="+(length*breadth));
    	  }
    	  public static void area(float height, float base) {
    		  System.out.println("Area oftriangle="+(0.5*height*base));
    	  }
    	  public static void area(float radius) {
    		  System.out.println("Area of circle="+(3.14*radius*radius));
    	 }
    	}
    

