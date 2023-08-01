package day9;

public class RemoveVowels {
	public static void main(String[] args) {
		String s="Test automation central";
		String vowels="aeiouAEIOU";
		String output=" ";
		for(char c:s.toCharArray())
		{
			if(vowels.indexOf(c)==-1)
			{
				output+=c;
				
			}
		}
		System.out.println(output);
	}
}
