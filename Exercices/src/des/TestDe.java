package des;

import java.nio.channels.Pipe;

/**
 * Class name : TestDe
 * Description : Test for De Class
 * @author Jean-François Giammari
 */

public class TestDe {
    public static void main(String[] args){
        De De1 = new De("Mon De normal",10);
        MemDe MemDe1 = new MemDe("De memoire",10);
        PipeDe PipeDe1 = new PipeDe("De pipé",10,8);
        AutresDe AutresDe1 = new AutresDe("Autre De");


        System.out.println(De1);
        System.out.println(MemDe1);
        System.out.println(PipeDe1);
        System.out.println(AutresDe1);
        System.out.println(De1.lancer());
        System.out.println(MemDe1.lancer());
        System.out.println(PipeDe1.lancer());
        System.out.println(AutresDe1.getFaces());


    }
}
