package des;

/**
 * Class name : PipeDe
 * Description : Class for a cheating dice object.
 * @author Jean-François Giammari
 */
public class PipeDe extends De {
    private int pipe = 1;

    /** CONSTRUCTOR **/
    /** Constructor  with name & number of side & Cheating number **/
    public PipeDe(String init_name, int init_nbFace,int init_pipe) {
        super(init_name,init_nbFace);
        checkPipe(init_pipe);
    }

    /** METHODS **/
    /**
     * Check if cheating_number is valid ( <= Side number)
     */
    private void checkPipe(int new_pipe) {
        if(new_pipe <= getNbFaces()) {
            this.pipe = new_pipe;
        } else {
            this.pipe = this.getNbFaces() ;
        }
    }

    /**
     * Launch the dice one time and return random number,
     * between cheat value & number of side
     */
    public int lancer(){
        return  r.nextInt((this.getNbFaces()+1)-this.pipe)+this.pipe;
    }
}
