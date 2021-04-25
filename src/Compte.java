
public class Compte {

	private int id;
	private float solde;
	public Compte(int id, float solde) {
		super();
		this.id = id;
		this.solde = solde;
	}
	
	public void verser(float mt) {
		solde = solde + mt;
	}
	//Generation de l'exception
	public void retirer(float mt) throws Soldexception, SoldeNegatifException   {
		if(mt>solde) {
			throw new Soldexception("Solde insuffisant");
		}
		 if(mt<0) {
			 throw new SoldeNegatifException("Solde negatif");
		 }
		solde = solde - mt;
	}

	
	
}
