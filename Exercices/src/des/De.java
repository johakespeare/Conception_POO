package des;
import java.util.*;

/**
 * Class name : De
 *
 * Description : Class for a standard dice object
 *
 * @author Jean-François Giammari
 */

public class De {
    private final static int MIN_SIDE = 3;
    private final static int MAX_SIDE = 120;
    private int nbFaces = 6;
    private String name;
    static int nb_De;
    protected static Random r = new Random();

    /**
     * Constructor for De with name & nb_Face &
     * @param init_name : Name of the dice
     * @param init_nbFace : Number of side of the side
     */
    public De(String init_name, int init_nbFace) {
        setNbFaces(init_nbFace);
        checkName(init_name);
        nb_De++;
    }

    /**
     * Constructor with name initialization
     * @param init_name : Name of the dice
     */
    public De(String init_name) {
        checkName(init_name);
        nb_De++;
    }

    /**
     * Constructor  with nothing
     */
    public De() {
        nb_De++;
        checkName("");
    }


    /**
     * Getter for nbFaces
     */
    public int getNbFaces() {
        return nbFaces;
    }

    /**
     * Setter for nbFaces
     * @param new_nbFaces : New number of side of the dice
     */
    public void setNbFaces(int new_nbFaces) {
        if (new_nbFaces >= MIN_SIDE && new_nbFaces <= MAX_SIDE) {
            this.nbFaces = new_nbFaces;
        } else {
            System.err.println("Nombre de faces invalide");
        }
    }

    /**
     * Getter for name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Check if name is valid or set by default with N° Dice number
     * @param new_name : Name to check validity
     */
    private void checkName(String new_name) {
        if (new_name != null && !new_name.equals("")) {
            this.name = new_name;
        } else {
            this.name = "De n°"+nb_De;
        }
    }

    /**
     * Launch the dice one time and return random number between 1 & number of side
     */
    public int lancer(){
        return  r.nextInt(this.nbFaces)+1;
    }

    /**
     * Launch the dice x time and return the high random number between 1 & number of side
     * @param launch_number : Number of run
     */
    public int lancer(int launch_number){
        int max = 0;
        for(int i=0; i < launch_number; ++i){
            int result = lancer();
            System.out.println(result);
            if(result>max){
                max = result;
            }
        }
        return max;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        De de = (De) o;
        return nbFaces == de.nbFaces;
    }

    @Override
    public String toString() {
        return "Nom : "+getName()+" | "+getNbFaces()+" Faces";
    }
}
