
public class vowelornot {
	public static void main(String args[]) {
		char ch = 'I';
		if (ch == 'a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
			System.out.println(ch+ " lower case vowel");
		else if (ch == 'A' || ch=='E'||ch=='I'||ch=='O'||ch=='U')
			System.out.println(ch+ " Uppercase vowel");
		else
			System.out.println(ch+" consonant");
		
	}

}
