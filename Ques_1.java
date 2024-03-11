import java.util.Scanner;

public class Ques_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		
		int n1 = sc.nextInt();
		
		String Binary = Integer.toBinaryString(n1);
		System.out.println("Binary Equivalent:"+Binary);
		
		String Octal = Integer.toOctalString(n1);
		System.out.println("Octal Equivalent :"+Octal);
		
		String Hexa = Integer.toHexString(n1);
		System.out.println("Hexadeimal Eqivalent :"+Hexa);
		

	}

}
