package personne;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Class name : Employe
 * Description : Class for a Personne who work
 * @author Jean-François Giammari
 */
public class Employe extends Personne {

    protected float salaire = 0;
    private GregorianCalendar dateEmbauche;
    public static final int MINAGEREQUIS = 16;
    public static final int MAXAGEREQUIS = 65;

    /** CONSTRUCTOR **/
    /**
     * Constructeur de Mananger
     * @param leNom le nom de la personne
     * @param lePrenom le pr�nom de la personne
     * @param laDate la date de naissance de la personne
     * @param lAdresse l'adresse de la personne
     * @param initSalaire le salaire de la personne
     * @param initDateEmbauche la date d'embauche de la personne
     */
    protected Employe(String leNom,String lePrenom, GregorianCalendar laDate, Adresse lAdresse, float initSalaire, GregorianCalendar initDateEmbauche){
        super(leNom,lePrenom,laDate,lAdresse);
        this.dateEmbauche = initDateEmbauche;
        this.salaire = initSalaire;
    }


    /**
     * Pré Constructeur de Manager pour valider les entrées
     * @param leNom le nom de la personne
     * @param lePrenom le pr�nom de la personne
     * @param laDate la date de naissance de la personne
     * @param lAdresse l'adresse de la personne
     * @param initSalaire le salaire de la personne
     * @param initDateEmbauche la date d'embauche de la personne
     * return une instance Employe si valide sinon null
     */
    public static Employe createEmploye(String leNom,String lePrenom, GregorianCalendar laDate, Adresse lAdresse, int initSalaire, GregorianCalendar initDateEmbauche){
        int year = initDateEmbauche.get(Calendar.YEAR);
        GregorianCalendar minAgeDate = (GregorianCalendar) initDateEmbauche.clone();
        GregorianCalendar maxAgeDate = (GregorianCalendar) initDateEmbauche.clone();
        minAgeDate.set(Calendar.YEAR, year - MINAGEREQUIS );
        maxAgeDate.set(Calendar.YEAR, year - MAXAGEREQUIS);
        if(laDate.before(minAgeDate) && laDate.after(maxAgeDate) && initSalaire > 0){
            return new Employe(leNom,lePrenom,laDate,lAdresse, initSalaire,initDateEmbauche);
        }else{
            System.err.println("Erreur d'instance");
           return null;
        }
    }

    /** METHODS **/
    /**
     * Permet d'augmenter le salaire a partir d'un poucentage
     * @param  pourcentage le pourcentage positif
     */
    public void augmenterLeSalaire(float pourcentage){
        if(pourcentage > 0){
            this.salaire = this.salaire*(pourcentage/100 + 1);
        }else{
            System.err.println("Il faut un pourcentage positif ! ");
        }
    }

    /**
     * Permet de calculer le nombre d'année de travail dans cette entreprise
     * @return  le nombre d'année
     */
    public int calculAnnuite(){
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int yearEmbauche = dateEmbauche.get(Calendar.YEAR);
        return  year - yearEmbauche+1;
    }

    /**
     * Accesseur
     * @return retourne le salaire
     */
    public float getSalaire() {
        return salaire;
    }

    /**
     * Accesseur
     * @return retourne la date d'embauche
     */
    public GregorianCalendar getDateEmbauche() {
        return dateEmbauche;
    }

    @Override
    public String toString(){
        return super.toString()+ "Date Embauche : "+ getDateEmbauche().toString()+"\n"+ "Salaire : "+ getSalaire();
    }
}
