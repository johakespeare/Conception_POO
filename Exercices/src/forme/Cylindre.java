package forme;
/**
 * Class name : Sphere
 * Description : Class for an Ellipses
 * @author Jean-François Giammari
 */
public class Cylindre extends Cercle  {
    protected double h = 0;

    /** CONSTRUCTOR **/
    /**
     * Full content constructor
     * @param r - Rayon
     * @param name - Name + n°
     */
    public Cylindre(String name,double r, double h) {
        super(name, r);
        this.h = h;
    }

    public Cylindre(double r, double h) {
        this("",r, h);
    }

    /** METHODS **/
    /**
     * return the surface of the shape
     */
    public double surface(){
        return 0.0;
    }

    /**
     * return the volume of the shape
     */
    public double volume(){
        return 0.0;
    }

    /**
     * @return a String that describe the shape
     */
    @Override
    public String toString() {
        return super.toString() + "\n* Hauteur : "+ h;
    }


}
