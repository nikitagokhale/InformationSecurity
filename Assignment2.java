import java.util.*;

public class Assignment2
{
	class coordinates
	{
		int x, int y;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimension of matrix:- ");
		System.out.print("Row>");
		int rowSize = sc.nextInt();
		System.out.print("Column>");
		int columnSize = sc.nextInt();
		int matrix[][] = new int[rowSize][columnSize];
		System.out.println("Enter the points (1 for obstacles/0 for pathway):- ");
		for(int i=0;i<rowSize;i++)
		{
			for(int j=0;j<columnSize;j++)
			{
				System.out.print("("+i+", "+j+") >");
				matrix[i][j] = sc.nextInt();
			}
		}
//		for(int i=0;i<rowSize;i++)
//		{
//			for(int j=0;j<columnSize;j++)
//				System.out.print(matrix[i][j]+ " ");
//			System.out.println();
//		}
		System.out.print("Source:-");
		int source = sc.nextInt();
		System.out.print("Source:-");
		int target = sc.nextInt();
		
		
		sc.close();
	}
}
