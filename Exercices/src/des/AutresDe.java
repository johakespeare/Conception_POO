package des;
import java.util.*;
/**
 * Class name : AutresDe
 * Description : Class for a standard dice, but side can have of type of value (String, etc..)
 * @author Jean-François Giammari
 */

public class AutresDe extends De {

    ArrayList<Object> faces = new ArrayList<Object>();


    /** CONSTRUCTOR **/
    /** Constructor  with name **/
    public AutresDe(String init_name) {
        super(init_name);
        setAutresFaces();
    }

    /** Constructor  with nothing **/
    public AutresDe() {
        this("");
    }


    /** SETTER **/
    /**
     * Set the value of faces (Objects)
     */
    private void setAutresFaces(){
        faces.add("Solo");
        faces.add(1);
        faces.add("Perdu");
        faces.add(1.5);
        faces.add(2);
        setNbFaces(5);
    }

    /**
     * Getter for faces
     */
    public Object getFaces(){
        return faces;
    }

    /**
     * Get the face of the number
     */
    private Object getLancerValue(int number){
        return faces.get(number);

    }

    /**
     * Launch the dice one time
     */
    public int lancer() {
        System.out.println(getLancerValue(super.lancer()));
        return 0;
    }

    @Override
    public String toString() {
        return "Type : Multi Faces | Nom : "+getName()+" | "+getNbFaces()+" Faces";
    }

}
