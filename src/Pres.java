import java.util.Scanner;

public class Pres {
 
	public static void main(String [] args) {
		//il ya deux type d'exceptions :
		// -les exceptions surveill�s : surveill�s au moment de compilation (division par 0)
		//les exceptions non surveill�s : surveill�s au moment de l'execution : le compilateur va pas vous dire attention
		//dans ce cas au moment de l'execusion, l'application g�nere une exception, et comme elle n'a pas �t� captur�, elle est signal� � la machine vertuelle java
		
		//et c'est un beug, l'application arrete, il va falloir la relancer
		//traiter une exception non surveill�, la capturer pour qu'elle ne propage pas � la machine vertuelle
		//Cette methode va afficher ce message d'exception dans un fichier de log, de journalisation
		Scanner clavier = new Scanner(System.in);
		System.out.println("A:");
		int a = clavier.nextInt();
	
		System.out.println("B:");
		int b = clavier.nextInt();
		int c = 0;
		try {
		
		
		 c=  a/  b;
		}catch(ArithmeticException e) {
		//System.out.println(e.getMessage());
			//System.out.println(e.toString());
			e.printStackTrace();
		}
		System.out.println("C="+c);
		System.out.println(3);
}	
}
