package des;
/**
 * Class name : TestDe
 * Description : Test for De Class
 * @author Jean-François Giammari
 */

public class TestDe {
    public static void main(String[] args){
        De monDe1 = new MemDe("De memoire");
        De monDe2 = new PipeDe("De pipé",10,8);

        System.out.println(monDe1);
        System.out.println(monDe2);
        System.out.println(monDe1.lancer(40));

    }
}
