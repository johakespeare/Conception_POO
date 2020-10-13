package personne;

import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 * Class name : Manager
 *
 * Description : Class for a Employe with the statu of Manager
 *
 * @author Jean-François Giammari
 */
public class Manager extends Employe {
    Secretaire secretaire;

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
    public Manager(String leNom, String lePrenom, GregorianCalendar laDate, Adresse lAdresse, float initSalaire, GregorianCalendar initDateEmbauche) {
        super(leNom, lePrenom, laDate, lAdresse, initSalaire, initDateEmbauche);
    }

    /** METHODS **/
    /**
     * Permet d'augmenter le salaire a partir d'un poucentage avec un bonus de 0.5% par année dans l'entreprise
     * @param  pourcentage le pourcentage positif
     */
    @Override
    public void augmenterLeSalaire(float pourcentage){
        pourcentage += calculAnnuite()*0.5;
        if(pourcentage > 100){ pourcentage = 100;}
        super.augmenterLeSalaire(pourcentage);
    }

    /**
     * Accesseur
     * @return retourne la secretaire assigné
     */
    public Secretaire getSecretaire() {
        return secretaire;
    }

    /**
     * Modificateur
     * @param secretaire assigne une secretaire
     */
    public void setSecretaire(Secretaire secretaire) {
        secretaire.delManager(this);
        this.secretaire = secretaire;
        secretaire.addManager(this);
    }

    @Override
    public String toString(){
        return  super.toString()+ "Secretaire : "+ getSecretaire()+"\n";
    }
}
