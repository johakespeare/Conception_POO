package personne;
import java.util.*;

public class Personne{
	private static int nbPersonne = 0;
    private static final Adresse ADRESSE_INCONNUE = null;
    private String nom;
    private String prenom;
    private final GregorianCalendar dateNaissance;
    private Adresse adresse=ADRESSE_INCONNUE;
	
	/**
	 * Constructeur de Personne
	 * @param leNom le nom de la personne
	 * @param lePrenom le pr�nom de la personne
	 * @param laDate la date de naissance de la personne
	 * @param lAdresse l'adresse de la personne
	 */
	public Personne(String leNom,String lePrenom, GregorianCalendar laDate, Adresse lAdresse){
		nom = leNom.toUpperCase();
		prenom=lePrenom;
		dateNaissance=laDate;
		adresse=lAdresse;
		nbPersonne++;
	}
	
	/** 
	 * Constructeur de Personne
	 * @param leNom le nom de la personne
	 * @param lePrenom le pr�nom de la personne
	 * @param j le jour de naissance
	 * @param m le mois de naissance
	 * @param a l'ann�e de naissance
	 * @param numero le n� de la rue
	 * @param rue la rue
	 * @param code_postal le code postal de l'adresse
	 * @param ville la ville ou la personne habite
	 */
	public Personne(String leNom,String lePrenom, int j, int m, int a, int numero, String rue, String code_postal, String ville){
		this(leNom, lePrenom, new GregorianCalendar(a,m,j),new Adresse(numero,rue,code_postal,ville));
	}

	/**
	 * Retourne vrai si la permière personne est plus agée que la deuxieme
	 * @param P1 la première personne
	 * @param P2 la deuxième personne
	 */
	public boolean plusAgee(Personne P1, Personne P2){
		/* CompareTo : -1 Si inférieur, 1 Si Supérieur, 0 Si Egale (Compté ici comme supérieur)*/
		if(P1.dateNaissance.compareTo(P2.dateNaissance) < 0){ return true; }else{ return false; }
	}

	/**
	 * Retourne vrai si la permière personne est plus agée que la deuxieme
	 * @param CompareP la deuxième personne
	 */
	public boolean plusAgeeQue(Personne CompareP){
		return plusAgee(this,CompareP);
	}

	/**
	 * Redéfiniton de equals (Avec Nom, Prénom, Date de Naissance comparé uniquement)
	 */
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Personne)) return false;
		Personne personne = (Personne) o;
		return nom.equals(personne.nom) && prenom.equals(personne.prenom) && dateNaissance.equals(personne.dateNaissance);
	}

	/**
	 * Accesseur
	 * @return retourne le nombre d'objets Personne instancier
	 */
	public static int getNbPersonne(){
		return Personne.nbPersonne;
	}

	/**
	 * Accesseur
	 * @return retourne le nom
	 */
	public String getNom(){
		return nom;
	}
	/**
	 * Accesseur
	 * @return retourne le pr�nom
	 */
	public String getPrenom(){
		return prenom;
	}
	/**
	 * Accesseur
	 * @return retourne la date de naissance	 
	 */
	public GregorianCalendar getDateNaissance() {
		return dateNaissance;
	}
	/**
	 * Accesseur
	 * @return retourne l'adresse	 
	 */
	public Adresse getAdresse() {
		return adresse;
	}
	/**
	 * Modificateur
	 * @param a modifie l'adresse
	 */
	public void setAdresse(Adresse a) {
		adresse=a;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		String result="\nNom : "+nom+"\n"
		+"Pr�nom : "+prenom+"\n"+
		"N�(e) le : "+dateNaissance.get(Calendar.DAY_OF_MONTH)+
		"-"+dateNaissance.get(Calendar.MONTH)+
		"-"+dateNaissance.get(Calendar.YEAR)+"\n"+
		"Adresse : "+
		adresse.toString();
		return result;
	}
}

    
   
   