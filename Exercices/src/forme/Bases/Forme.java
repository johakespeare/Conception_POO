package forme.Bases;
import java.util.Objects;

/**
 * Class name : Forme
 * Description : Class for a standard Shape
 * @author Jean-François Giammari
 */
public abstract class Forme {
    static int nb_forme;
    public String name;


    /** CONSTRUCTOR **/
    /**
     * Full content constructor
     * @param name - Name + n°
     */
    public Forme(String name) {
        nb_forme++;
        if(name =="") name = "None";
        this.name = name + " n°"+nb_forme;

    }

    public Forme(){
        this("");
    }

    /** METHODS **/

    /**
     * @return the surface of a shape
     */
    public double surface(){
        return 0.0;
    }

    /**
     * @return True if the surface of shape is strictly more high than an other
     */
    public boolean compareTo(Object o) {
        if (this == o) return true;
        if (!(o instanceof Forme)) return false;
        Forme forme = (Forme) o;
        if(this.surface() > forme.surface()) return true;
        return false;
    }

    /**
     * @return a String that describe the shape
     */
    @Override
    public String toString() {
        return "\n*************************\n" +
                "* Name :  "+name+"\n"+
                "* Type : "+this.getClass().getName()+
                "\n* Surface : "+surface();
    }

    /**
     * @return if the shapes stats is the same
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Forme)) return false;
        Forme forme = (Forme) o;
        return Objects.equals(this.surface(), forme.surface());
    }

}
