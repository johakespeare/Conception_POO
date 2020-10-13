package personne;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Class name : Secretaire
 *
 * Description : Class for a Employe with the statu of Secretaire
 *
 * @author Jean-François Giammari
 */
public class Secretaire extends Employe {
    ArrayList<Manager> managers = new ArrayList<Manager>();

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
    protected Secretaire(String leNom, String lePrenom, GregorianCalendar laDate, Adresse lAdresse, float initSalaire, GregorianCalendar initDateEmbauche) {
        super(leNom, lePrenom, laDate, lAdresse, initSalaire, initDateEmbauche);
    }

    /** METHODS **/
    /**
     * Permet d'augmenter le salaire a partir d'un poucentage avec un bonus de 0.1% par année manager assigné
     * @param  pourcentage le pourcentage positif
     */
    public void augmenterLeSalaire(int pourcentage) {
        pourcentage += managers.size() * 0.1;
        if (pourcentage > 100) {
            pourcentage = 100;
        }
        super.augmenterLeSalaire(pourcentage);
    }

    /**
     * Accesseur
     * @return retourne la liste des manager assigné à la secretaire
     */
    public String getManagers() {
        String managerStr = "";

        if (managers.size() > 0) {
            for (int i = 0; i < managers.size(); i++) {
                managerStr += " " + managers.get(i).getNom() + " " + managers.get(i).getPrenom() + " | ";
            }
        }else if(managers.size() >= 5){
            managerStr = "Une secretaire ne peut pas avoir plus de 5 manager";
        }
        else { managerStr = "Aucun manager"; }

        return managerStr;
    }

    /**
     * Modificateur
     * @param manager ajoute un manager a la liste des manangers de la secretaire
     */
    public void addManager(Manager manager) {
        managers.add(manager);
    }

    /**
     * Modificateur
     * @param manager enleve un manager a la liste des manangers de la secretaire
     */
    public void delManager(Manager manager) {
        managers.remove(manager);

    }

    @Override
    public String toString(){
        return  super.toString()+"Manager : "+ getManagers()+"\n";
    }
}
