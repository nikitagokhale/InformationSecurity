
public class Assignment1
{
	public static void main(String [] args)
	{
		String str = "Hello World";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++)
        {
            int ASCII = str.charAt(i);
            int xor = ASCII ^ 127;
            sb.append((char)xor);
        }
        System.out.println(sb.toString());
	}
}
