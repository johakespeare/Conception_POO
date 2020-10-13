package forme.Forme2D;

import forme.Bases.Forme2D;

/**
 * Class name : Rectangle
 * Description : Class for an Ellipses
 * @author Jean-François Giammari
 */
public class Rectangle extends Forme2D {
    protected double h = 0;
    protected double l = 0;

    /** CONSTRUCTOR **/
    /**
     * Full content constructor
     * @param h - Hauter
     * @param l - Largeur
     * @param name - Name + n°
     */
    public Rectangle(String name, double h , double l) {
        super(name);
    }
    public Rectangle(double h , double l){
        this("",h,l);
    }

    /** METHODS **/
    /**
     * return the surface of the shape
     */
    public double surface(){
        return l*h;
    }

    /**
     * return the perimetre of the shape
     */
    public double perimetre(){
        return 2*(l+h);
    }

    /**
     * @return a String that describe the shape
     */
    @Override
    public String toString() {
        return super.toString() + "\n* Hauteur : "+ h +"\n* Largeur : "+ l;
    }


}
