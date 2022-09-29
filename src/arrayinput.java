import java.util.Scanner;

public class arrayinput {
public static void main(String[]args) {
	Scanner scanner = new Scanner(System.in);
	int[] arr=new int[10];
	int sum=0;
	System.out.println("enter the elements:");
	for (int i=0;i<10;i++)
	{
		arr[1]=scanner.nextInt();
	}
    for (int num:arr) {
    	sum=sum+num;
    }
	System.out.println("sum is "+sum);			
	}
}

