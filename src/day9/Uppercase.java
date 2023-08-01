package day9;

public class Uppercase {
	public static void main(String[] args) {
		String s="Test Automation Central";
		int count=0;
		for(char c:s.toCharArray())
		{
			if(Character.isUpperCase(c))
			{
				count++;
			}
				
		}
		System.out.println(count);
}
}