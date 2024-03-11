import java.util.Scanner;

public class Ques_2 {

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1 = 0;
		double n2 = 0;
		
		System.out.println("Enter first value :");
		if(sc.hasNextDouble())
		{
			 n1 = sc.nextDouble();	
			System.out.println("values is double");
		}
		else
		{
			System.out.println(" first value  are not double :");
		}
		
		System.out.println("Enter second value:");
		if(sc.hasNextDouble())
		{
			 n2 = sc.nextDouble();
			System.out.println("values is double");
		}
		else
		{
			System.out.println("Second value are not double :");
		}
		double sum =(n1+n2);
		double avg = sum/2;
		
		System.out.println("Average is :"+avg);
		
		
		

	}

}
