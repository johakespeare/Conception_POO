package forme;
/**
 * Class name : Sphere
 * Description : Class for an Ellipses
 * @author Jean-François Giammari
 */
public class Sphere extends Cercle {

    /** CONSTRUCTOR **/
    /**
     * Full content constructor
     * @param r - Rayon
     * @param name - Name + n°
     */
    public Sphere(String name,double r) {
        super(name, r);
    }

    public Sphere(double r) {
        this("",r);
    }

    /** METHODS **/
    /**
     * return the surface of the shape
     */
    public double surface(){
        return 0.0;
    }

    /**
     * return the perimetre of the shape
     */
    public double volume(){
        return 0.0;
    }



}
