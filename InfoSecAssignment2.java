import java.util.*;

class Node
{
	char [] arr = new char[4];
}

public class Assignment2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Node> matrix = new ArrayList<Node>();
		System.out.print("Enter an input string:- ");
		String msg = sc.nextLine();
		int i=0;
		while(i<msg.length())
		{
			char [] arr = new char[4];
			arr[0] = msg.charAt(i);
			i++;
			if(i>=msg.length())
				break;
			arr[1] = msg.charAt(i);
			i++;
			if(i>=msg.length())
				break;
			arr[2] = msg.charAt(i);
			i++;
			if(i>=msg.length())
				break;
			arr[3] = msg.charAt(i);
			i++;
			Node array = new Node();
			array.arr = arr;
			matrix.add(array);
		}
		for(i=0;i<matrix.size();i++)
		{
			System.out.print(matrix.get(i).arr);
		}
	}
}
