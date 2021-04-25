import java.util.Scanner;

public class Pres {
 
	public static void main(String [] args) {
		Scanner clavier = new Scanner(System.in);
		System.out.println("A:");
		int a = clavier.nextInt();
	
		System.out.println("B:");
		int b = clavier.nextInt();
		int c = 0;
		try {
		
		
		 c=  a / b;
		}catch(ArithmeticException e) {
		//System.out.println(e.getMessage());
			//System.out.println(e.toString());
			e.printStackTrace();
		}
		System.out.println("C="+c);
		System.out.println(3);
}	
}
