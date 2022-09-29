import java.util.Scanner;

public class areaofrectangle {
public static void main(String[]args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the length of the triangle");
	double length=scanner.nextDouble();
	System.out.println("enter the width of the triangle");
	double width=scanner.nextDouble();
	double area=length*width;
	System.out.println("area of the triangle is :"+area);
}
}
