package des;
import java.util.*;
/**
 * Class name : AutresDe
 *
 * Description : Class for a standard dice, but side can have of type of value (String, etc..)
 *
 * @author Jean-François Giammari
 */
public class AutresDe extends De {

    /**
     * Constructor  with nothing
     */
    public AutresDe() {
        super();
    }

    /**
     * Constructor  with name
     */
    public AutresDe(String init_name) {
        super(init_name);
    }

    /**
     * Constructor  with name & number of side
     */
    public AutresDe(String init_name, int init_nbFace) {
        super(init_name, init_nbFace);
    }



}
