import java.util.Scanner;

public class oddeven {
public static void main(String[]args) {
	int num;
	System.out.println("Enter an integer number :");
	 Scanner input=new Scanner(System.in);
	 num = input.nextInt();
	 
	 if (num % 2 == 0)
		 System.out.println("even");
	 else
		 System.out.println("odd");
}
}
