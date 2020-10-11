package forme;

import java.util.Objects;

/**
 * Class name : Forme2D
 * Description : Class for a standard 2D Shape
 * @author Jean-François Giammari
 */
public class Forme2D extends Forme {

    /** CONSTRUCTOR **/
    /**
     * Full content constructor
     * @param name - Name + n°
     */
    public Forme2D(String name) {
        super(name);
    }

    public Forme2D() {
        super();
    }

    /** METHODES **/
    /**
     * @return the perimetre of a shape
     */
    public double perimetre(){
        return 0.0;
    }

    /**
     * @return a String that describe the shape
     */
    @Override
    public String toString() {
        return super.toString() + "\n* Perimetre : "+ perimetre();
    }

    /**
     * @return if the 2D shapes stats is the same
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Forme2D)) return false;
        Forme2D forme2d = (Forme2D) o;
        return super.equals(o) && Objects.equals(this.perimetre(), forme2d.perimetre());
    }


}
