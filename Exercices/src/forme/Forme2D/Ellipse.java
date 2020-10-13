package forme.Forme2D;

import forme.Bases.Forme2D;

/**
 * Class name : Ellipse
 * Description : Class for an Ellipses
 *
 * @author Jean-François Giammari
 */
public class Ellipse extends Forme2D {

    protected double ra = 0;
    protected double rb = 0;

    /** CONSTRUCTOR **/
    /**
     * Full content constructor
     *
     * @param ra   = Axe a
     * @param rb   = Axe b
     * @param name - Name + n°
     */
    public Ellipse(String name, double ra, double rb) {
        super(name);
        if (ra < 0) ra = 0;
        if (rb < 0) rb = 0;
        this.ra = ra;
        this.rb = rb;
    }

    public Ellipse(double ra, double rb) {
        this("", ra, rb);
    }

    /** METHODS **/
    /**
     * return the surface of the shape
     */
    public double surface() {
        return Math.PI * ra * rb;
    }

    /**
     * return the perimetre of the shape
     */
    public double perimetre() {
        return (2 * Math.PI * (Math.sqrt((ra * rb) / 2)));
    }

    /**
     * @return a String that describe the shape
     */
    @Override
    public String toString() {
        return super.toString() + "\n* Axe a : " + ra + "\n* Axe b : " + rb;
    }


}
