
public class casting {
	public static void main(String[] args)
	{
		byte b=10;
		int i=b;
		// byte c=i; lower value cannot put in higher value
		byte d=(byte)i; // casting works here
		byte x=10;
		byte y=20;
		// byte sum=x*y; arithemetic operation cannot be initilized by using byte
	}

}
