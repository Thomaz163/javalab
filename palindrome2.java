/*************************************************************
 * File Name    : Palindrome
 * Discription  : To check weather a given string is palindrome or not
 * Author       : Thomas Mathew
 * Version      : 1.0
 **************************************************************/
package lab;
import java.util.Scanner;

public class palindrome2 {
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String input= sc.nextLine();
        boolean ispalindrome=check(input);
        if(ispalindrome)
        {
            System.out.println(input+" is a palindrome string");
        }
        else
        {
            System.out.println(input+" is not a palindrome string");
        }
    }
 
     static boolean check(String str) {
        int left = 0, right = str.length() - 1;
        
        while(left < right)
        {
            if(str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    } 
}



