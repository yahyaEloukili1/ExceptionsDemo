import java.util.Scanner;

public class Pres {
 
	public static void main(String [] args) {
		//il ya deux type d'exceptions :
		// -les exceptions surveillés : surveillés au moment de compilation (division par 0)
		//les exceptions non surveillés : surveillés au moment de l'execution : le compilateur va pas vous dire attention
		//dans ce cas au moment de l'execusion, l'application génere une exception, et comme elle n'a pas été capturé, elle est signalé à la machine vertuelle java
		
		//et c'est un beug, l'application arrete, il va falloir la relancer
		//traiter une exception non surveillé, la capturer pour qu'elle ne propage pas à la machine vertuelle
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
