import java.util.Scanner;

public class areaofsquare {
public static void main(String[]args) {
	System.out.println("enter the side of the squares");
	Scanner scanner=new Scanner(System.in);
	double side=scanner.nextDouble();
	double area=side*side;
	System.out.println("Area of square is:"+area);
}
}
