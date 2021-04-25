import java.util.Scanner;

public class pres2 {

	public static void main(String [] args)  {
		try {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Code:");
		int code = clavier.nextInt();
	
		System.out.println("Solde:");
		float solde = clavier.nextFloat();
		Compte compte = new Compte(code, solde);
	//	System.out.println("Montant à verser :");

		System.out.println("Montant:");
		float mt2 = clavier.nextFloat();
		
			compte.retirer(mt2);
			System.out.println("pppppppppppppppppppp");
		} catch (Exception  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("hola");
		}
	
		
	
		
		
	
	}
}
