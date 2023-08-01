package day10;

public class Vowels {
	public static void main(String[] args) {
		String s="Test Automation Control";
		int vc=0,c=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')
			{
			
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					vc++;
			}
				
			else
			{
				c++;
			}
		}
		System.out.println("vowels:"+vc);
		System.out.println("count:"+c);

	}

}
