package forme;
import java.util.Objects;

/**
 * Class name : Forme3D
 * Description : Class for a standard 3D Shape
 * @author Jean-François Giammari
 */
public class Forme3D extends Forme2D {

    /** CONSTRUCTOR **/
    /**
     * Full content constructor
     * @param name - Name + n°
     */
    public Forme3D(String name) {
        super(name);
    }

    public Forme3D() {
        super();
    }

    /** METHODES **/
    /**
     * @return the volume of a shape
     */
    public double volume(){
        return 0.0;
    }

    /**
     * @return a String that describe the shape
     */
    @Override
    public String toString() {
        return super.toString() + "\n* Volume : "+ volume();
    }

    /**
     * @return if the 3D shapes stats is the same
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Forme3D)) return false;
        Forme3D forme3d = (Forme3D) o;
        return super.equals(o) && Objects.equals(this.volume(), forme3d.volume());
    }


}

