package des;

/**
 * Class name : MemDe
 * Description : Class for a standard dice object with a memory (Never 2 same number following)
 * @author Jean-François Giammari
 */
public class MemDe extends De {
    int last_value = 0;


    /** CONSTRUCTOR **/
    /**  Constructor  with name & number of side **/
    public MemDe(String init_name, int init_nbFace) {
        super(init_name, init_nbFace);
    }

    /** Constructor  with name **/
    public MemDe(String init_name) {
        super(init_name);
    }

    /** Constructor  with nothing **/
    public MemDe() {
        super();
    }


    /** METHODS **/
    /**
     * Launch the dice one time and return random number between 1 & number of side
     * But if 2 same number following, relaunch
     */
    public int lancer() {
        int side;
        do {
            side = r.nextInt(this.getNbFaces() + 1);
        } while (side == last_value);
        last_value = side;

        return side;
    }

    @Override
    public String toString() {
        return "Type : Memoire | Nom : "+getName()+" | "+getNbFaces()+" Faces";
    }
}
