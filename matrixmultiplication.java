import java.util.Scanner;
import java.util.Scanner;
public class matrixmultiplication {
public static void main (String[] args) {
	Scanner obj= new Scanner(System.in);
	System.out.println("enter the deatis of the first matrix:");
	System.out.println("enter the rows: ");
	System.out.println("enter the columns");
	int r1=obj.nextInt();
	int c1=obj.nextInt();
	System.out.println("enter the details of the second matrix");
	System.out.println("enter the rows: ");
	System.out.println("enter the columns:");
	int r2=obj.nextInt();
	int c2=obj.nextInt();
	int firstmatrix[][]=new int [r1][c1];
	int secondmatrix[][]= new int[r2][c2];
	int product[][]=new int [r1][c2];
	System.out.println("enter the elements of first matrix: ");
	for(int i=0;i<r1;i++)
	{
		for(int j=0;j<c1;j++)
		{
			firstmatrix[i][j]=obj.nextInt();
		}
	}
	System.out.println("the first matrix is:");
	for(int i=0;i<r1;i++)
	{
		for(int j=0;j<c1;j++)
		{
			System.out.print(firstmatrix[i][j]+"\t");
		}
		System.out.println("\n");
	}
	System.out.println("enter the elements of the second matrix: ");
	for(int i=0;i<r2;i++)
	{
		for(int j=0;j<c2;j++)
		{
			secondmatrix[i][j]=obj.nextInt();
		}
	}
	System.out.println("the first second is:");
	for(int i=0;i<r1;i++)
	{
		for(int j=0;j<c1;j++)
		{
			System.out.print(secondmatrix[i][j]+"\t");
		}
		System.out.println("\n");
	}
if(c1!=r2)
{
	System.out.println("matrix multiplication is not possible");
}
else
{
	System.out.println("product of the matrix is:");
	for(int i=0;i<r1;i++)
	{
		for(int j=0;j<c2;j++)
		{
			product[i][j]=0;
			for(int k=0;k<c1;k++)
				product[i][j]+=firstmatrix[i][k]*secondmatrix[k][i];
		}
	}
	for(int i=0;i<r1;i++)
	{
		for(int j=0;j<c1;j++)
		{
			System.out.print("\t"+product[i][j]);
		}
		System.out.print("\n");
	}
	
}
}
}
