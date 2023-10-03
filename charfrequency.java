/*************************************************************
 * File Name    : Character Frequency
 * Discription  : To check the Character Frequency of the enterd characters
 * Author       : Thomas Mathew
 * Version      : 1.0
 **************************************************************/

import java.util.Scanner;
public class charfrequency {

		public static void main(String[] args) {
			String input;
			char checkCharacter;
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the string");
			input=sc.nextLine();
			System.out.println("enter the character whose frequency to be checked");
			checkCharacter = sc.next().charAt(0);
			int count=frequency(input,checkCharacter);
			System.out.println("the frequency of entered character="+count );
			
			
			
		}
		static int frequency(String input,char checkCharacter){
			int count=0;
			char characterArray[]=input.toCharArray();
			for(int i=0;i<input.length();i++)
			{
				if(checkCharacter == characterArray[i])
				{
					count++;
				}
			}
			return count;
			
		}

	}