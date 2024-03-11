import java.util.Scanner;

public class Ques_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Food :");
		String a[] = {"Dosa","Samosa","Idli","Poha","Upma","Tea","Cofee","Bhaji","Milk"};
		int price[] = {90,20,30,40,50,60,70,80,100};
		int totalbill = 0;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println((i+1)+ " : "+ a[i] +" Price  ="+price[i]);
		}
		System.out.println("10  Generate Bill :" );
		
		while(true)
		{
			System.out.println("Enter choice(1-10) :");
			int choice = sc.nextInt();
			
			if(choice >=1 && choice <= a.length)
			{
				System.out.println("Enter quantity");
				int quantity = sc.nextInt();
				totalbill = totalbill + price[choice-1] * quantity;
			}
			else if(choice == 10)
			{
				System.out.println("Total Bill "+ totalbill);
				break;
			}
			else
			{
				System.out.println("Invalid choice");
			}
		}
		
		

	}

}
